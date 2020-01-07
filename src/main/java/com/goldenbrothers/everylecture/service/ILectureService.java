package com.goldenbrothers.everylecture.service;

import java.util.ArrayList;

import com.goldenbrothers.everylecture.model.LectureDTO;

public interface ILectureService {
	
	public ArrayList<LectureDTO> selectLectureAll();

}
