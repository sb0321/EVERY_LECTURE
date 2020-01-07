-- --------------------------------------------------------
-- 호스트:                          every-lecture.iptime.org
-- 서버 버전:                        10.3.17-MariaDB-0+deb10u1 - Raspbian 10
-- 서버 OS:                        debian-linux-gnueabihf
-- HeidiSQL 버전:                  10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- test 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `test` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `test`;

-- 테이블 test.admin 구조 내보내기
CREATE TABLE IF NOT EXISTS `admin` (
  `adminID` varchar(50) NOT NULL,
  `adminPW` varchar(50) DEFAULT NULL,
  `authority` varchar(50) NOT NULL DEFAULT 'USER',
  PRIMARY KEY (`adminID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 테이블 데이터 test.admin:~0 rows (대략적) 내보내기
DELETE FROM `admin`;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;

-- 테이블 test.board 구조 내보내기
CREATE TABLE IF NOT EXISTS `board` (
  `boardID` int(11) NOT NULL AUTO_INCREMENT,
  `userID` varchar(50) NOT NULL,
  `boardName` varchar(50) DEFAULT NULL,
  `boardText` varchar(1000) DEFAULT NULL,
  `boardTime` datetime DEFAULT current_timestamp(),
  `DelYn` varchar(1) DEFAULT 'N',
  PRIMARY KEY (`boardID`),
  KEY `board_userID_FK` (`userID`),
  CONSTRAINT `board_userID_FK` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 테이블 데이터 test.board:~0 rows (대략적) 내보내기
DELETE FROM `board`;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
/*!40000 ALTER TABLE `board` ENABLE KEYS */;

-- 테이블 test.comment 구조 내보내기
CREATE TABLE IF NOT EXISTS `comment` (
  `comID` int(11) NOT NULL AUTO_INCREMENT,
  `boardID` int(11) NOT NULL,
  `comText` varchar(500) NOT NULL,
  `comTime` datetime NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`comID`),
  KEY `boardID_FK` (`boardID`),
  CONSTRAINT `comment_boardID_FK` FOREIGN KEY (`boardID`) REFERENCES `board` (`boardID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 테이블 데이터 test.comment:~0 rows (대략적) 내보내기
DELETE FROM `comment`;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;

-- 테이블 test.lecture 구조 내보내기
CREATE TABLE IF NOT EXISTS `lecture` (
  `lectureID` int(11) NOT NULL AUTO_INCREMENT,
  `adminID` varchar(50) NOT NULL,
  `lectureName` varchar(50) DEFAULT NULL,
  `lectureExplain` varchar(140) DEFAULT NULL,
  PRIMARY KEY (`lectureID`),
  KEY `adminID_FK` (`adminID`),
  CONSTRAINT `lecture_adminID_FK` FOREIGN KEY (`adminID`) REFERENCES `admin` (`adminID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 테이블 데이터 test.lecture:~0 rows (대략적) 내보내기
DELETE FROM `lecture`;
/*!40000 ALTER TABLE `lecture` DISABLE KEYS */;
/*!40000 ALTER TABLE `lecture` ENABLE KEYS */;

-- 테이블 test.user 구조 내보내기
CREATE TABLE IF NOT EXISTS `user` (
  `userID` varchar(50) NOT NULL,
  `userPW` varchar(50) DEFAULT NULL,
  `userName` varchar(50) DEFAULT NULL,
  `authority` varchar(10) NOT NULL DEFAULT 'USER',
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='사용자 테이블';

-- 테이블 데이터 test.user:~2 rows (대략적) 내보내기
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`userID`, `userPW`, `userName`, `authority`) VALUES
	('jm', 'jm', '쨰민', 'USER'),
	('sb', 'sb', 'KSB', 'USER');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- 테이블 test.userClass 구조 내보내기
CREATE TABLE IF NOT EXISTS `userClass` (
  `userID` varchar(50) NOT NULL,
  `lectureID` int(11) NOT NULL,
  `progress` varchar(50) NOT NULL,
  KEY `userID_FK` (`userID`),
  KEY `lectureID_FK` (`lectureID`),
  CONSTRAINT `userClass_lectureID_FK` FOREIGN KEY (`lectureID`) REFERENCES `lecture` (`lectureID`) ON UPDATE CASCADE,
  CONSTRAINT `userClass_userID_FK` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 테이블 데이터 test.userClass:~0 rows (대략적) 내보내기
DELETE FROM `userClass`;
/*!40000 ALTER TABLE `userClass` DISABLE KEYS */;
/*!40000 ALTER TABLE `userClass` ENABLE KEYS */;

-- 테이블 test.video 구조 내보내기
CREATE TABLE IF NOT EXISTS `video` (
  `videoID` int(11) NOT NULL AUTO_INCREMENT,
  `originalName` varchar(100) DEFAULT NULL,
  `UUID` varchar(200) DEFAULT NULL,
  `fileSize` int(30) NOT NULL,
  PRIMARY KEY (`videoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 테이블 데이터 test.video:~0 rows (대략적) 내보내기
DELETE FROM `video`;
/*!40000 ALTER TABLE `video` DISABLE KEYS */;
/*!40000 ALTER TABLE `video` ENABLE KEYS */;

-- 테이블 test.videoList 구조 내보내기
CREATE TABLE IF NOT EXISTS `videoList` (
  `lectureID` int(11) NOT NULL,
  `videoID` int(11) NOT NULL,
  `sequence` int(11) DEFAULT NULL,
  KEY `lectureID_FK` (`lectureID`),
  KEY `videoID_FK` (`videoID`),
  CONSTRAINT `videoList_lectureID_FK` FOREIGN KEY (`lectureID`) REFERENCES `lecture` (`lectureID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `videoList_videoID_FK` FOREIGN KEY (`videoID`) REFERENCES `video` (`videoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 테이블 데이터 test.videoList:~0 rows (대략적) 내보내기
DELETE FROM `videoList`;
/*!40000 ALTER TABLE `videoList` DISABLE KEYS */;
/*!40000 ALTER TABLE `videoList` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
