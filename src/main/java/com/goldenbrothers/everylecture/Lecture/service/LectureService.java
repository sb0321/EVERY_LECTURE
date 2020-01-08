package com.goldenbrothers.everylecture.Lecture.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldenbrothers.everylecture.Lecture.dao.ILectureDAO;
import com.goldenbrothers.everylecture.Lecture.model.LectureDTO;

@Service
public class LectureService implements ILectureService {
	
	@Autowired
	ILectureDAO dao;

	@Override
	public ArrayList<LectureDTO> selectLectureAll() {
		// TODO Auto-generated method stub
		return dao.selectLectureAll();
	}

}
