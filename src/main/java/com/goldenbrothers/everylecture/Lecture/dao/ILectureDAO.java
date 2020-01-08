package com.goldenbrothers.everylecture.Lecture.dao;

import java.util.ArrayList;

import com.goldenbrothers.everylecture.Lecture.model.LectureDTO;

public interface ILectureDAO {
	
	public int uploadLecture(LectureDTO dto);
	public ArrayList<LectureDTO> selectLectureAll();

}
