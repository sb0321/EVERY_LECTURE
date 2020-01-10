package com.goldenbrothers.everylecture.Mypage.service;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.goldenbrothers.everylecture.Login.model.LoginDTO;
import com.goldenbrothers.everylecture.Mypage.dao.IMypageDAO;

@Service
public class MypageService implements IMypageService {
	
	@Autowired
//	@Qualifier("IMypageDAO")
	IMypageDAO dao;

	@Override
	public int deleteUser(String userID) {
		// TODO Auto-generated method stub
		return dao.deleteUser(userID);
	}

	@Override
	public int updateName(LoginDTO dto) {
		// TODO Auto-generated method stub
		return dao.updateName(dto);
	}

	@Override
	public LoginDTO selectOne(String userID) {
		// TODO Auto-generated method stub
		return dao.selectOne(userID);
	}

	@Override
	public int updatePW(LoginDTO dto) {
		// TODO Auto-generated method stub
		return dao.updatePW(dto);
	}

	@Override
	public int deleteRegisteredLecture(HashMap<String, String> IDs) {
		// TODO Auto-generated method stub
		return dao.deleteRegisteredLecture(IDs);
	}
	
	


	
	
	
	

}
