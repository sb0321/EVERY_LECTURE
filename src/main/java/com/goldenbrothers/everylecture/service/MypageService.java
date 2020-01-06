package com.goldenbrothers.everylecture.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.goldenbrothers.everylecture.dao.IUserDAO;
import com.goldenbrothers.everylecture.model.UserDTO;

@Service
public class MypageService implements IMypageService {
	
	@Autowired
	@Qualifier("IUserDAO")
	IUserDAO dao;

	@Override
	public int update(UserDTO dto) {
		// TODO Auto-generated method stub
		return dao.update(dto);
	}

	@Override
	public UserDTO selectOne(String userID) {
		// TODO Auto-generated method stub
		return dao.selectOne(userID);
	}

	@Override
	public ArrayList<UserDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(UserDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
