package com.goldenbrothers.everylecture.dao;

import java.util.ArrayList;

import com.goldenbrothers.everylecture.model.LectureDTO;

public interface ILectureDAO {
	
	public int uploadLecture(LectureDTO dto);
	public ArrayList<LectureDTO> selectLectureAll();

}
