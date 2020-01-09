package com.goldenbrothers.everylecture.Lecture.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldenbrothers.everylecture.Lecture.dao.ILectureDAO;
import com.goldenbrothers.everylecture.Lecture.model.LectureDTO;
import com.goldenbrothers.everylecture.Lecture.model.UserClassDTO;

@Service
public class LectureService implements ILectureService {
	
	@Autowired
	ILectureDAO dao;

	@Override
	public ArrayList<LectureDTO> selectLectureAll() {
		// TODO Auto-generated method stub
		return dao.selectLectureAll();
	}

	@Override
	public int registerLecture(UserClassDTO dto) {
		// TODO Auto-generated method stub
		return dao.registerLecture(dto);
	}

	@Override
	public ArrayList<HashMap<String, Object>> getRegisteredLecture(String userID) {
		// TODO Auto-generated method stub
		return dao.getRegisteredLecture(userID);
	}

}
