package com.goldenbrothers.everylecture.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldenbrothers.everylecture.dao.IMypageDAO;
import com.goldenbrothers.everylecture.model.UserDTO;

@Service
public class MypageService implements IMypageService {
	
	@Autowired
	IMypageDAO dao;

	@Override
	public int deleteUser(String userID) {
		// TODO Auto-generated method stub
		return dao.deleteUser(userID);
	}

	@Override
	public int updateName(UserDTO dto) {
		// TODO Auto-generated method stub
		return dao.updateName(dto);
	}

	@Override
	public UserDTO selectOne(String userID) {
		// TODO Auto-generated method stub
		return dao.selectOne(userID);
	}

	@Override
	public int update(UserDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePW(UserDTO dto) {
		// TODO Auto-generated method stub
		return dao.updatePW(dto);
	}
	
	


	
	
	
	

}
