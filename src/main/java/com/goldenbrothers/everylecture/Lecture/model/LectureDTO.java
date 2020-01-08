package com.goldenbrothers.everylecture.Lecture.model;

public class LectureDTO {
	
	private int lectureID;
	private String adminID;
	private String lectureName;
	private String lectureExplain;
	private String lectureImgName;
	private String lectureImgPath;
	
	public int getLectureID() {
		return lectureID;
	}
	public void setLectureID(int lectureID) {
		this.lectureID = lectureID;
	}
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	public String getLectureName() {
		return lectureName;
	}
	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	public String getLectureExplain() {
		return lectureExplain;
	}
	public void setLectureExplain(String lectureExplain) {
		this.lectureExplain = lectureExplain;
	}
	public String getLectureImgName() {
		return lectureImgName;
	}
	public void setLectureImgName(String lectureImgName) {
		this.lectureImgName = lectureImgName;
	}
	public String getLectureImgPath() {
		return lectureImgPath;
	}
	public void setLectureImgPath(String lectureImgPath) {
		this.lectureImgPath = lectureImgPath;
	}

}
