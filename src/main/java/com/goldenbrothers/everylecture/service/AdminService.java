package com.goldenbrothers.everylecture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldenbrothers.everylecture.dao.IAdminDAO;
import com.goldenbrothers.everylecture.dao.ILectureDAO;
import com.goldenbrothers.everylecture.model.AdminDTO;
import com.goldenbrothers.everylecture.model.LectureDTO;

@Service
public class AdminService implements IAdminService {
	
	@Autowired
	ILectureDAO Ldao;
	
	@Autowired
	IAdminDAO Adao;

	@Override
	public int uploadLecture(LectureDTO dto) {
		// TODO Auto-generated method stub
		return Ldao.uploadLecture(dto);
	}

	@Override
	public AdminDTO selectOneAdmin(String userID) {
		// TODO Auto-generated method stub
		return Adao.selectOneAdmin(userID);
	}

}
