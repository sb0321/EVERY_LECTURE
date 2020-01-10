package com.goldenbrothers.everylecture.Lecture.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.goldenbrothers.everylecture.Lecture.model.LectureDTO;
import com.goldenbrothers.everylecture.Lecture.model.UserClassDTO;

public interface ILectureDAO {
	
	public int uploadLecture(LectureDTO dto);
	public ArrayList<LectureDTO> selectLectureAll();
	public int registerLecture(UserClassDTO dto);
	public ArrayList<HashMap<String, Object>> getRegisteredLecture(String userID);
	public LectureDTO selectOneLecture(String lectureID);

}
