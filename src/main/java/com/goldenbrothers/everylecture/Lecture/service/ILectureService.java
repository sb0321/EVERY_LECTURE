package com.goldenbrothers.everylecture.Lecture.service;

import java.util.ArrayList;

import com.goldenbrothers.everylecture.Lecture.model.LectureDTO;

public interface ILectureService {
	
	public ArrayList<LectureDTO> selectLectureAll();

}
