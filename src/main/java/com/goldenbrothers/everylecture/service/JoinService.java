package com.goldenbrothers.everylecture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.goldenbrothers.everylecture.dao.IJoinDAO;
import com.goldenbrothers.everylecture.model.UserDTO;

@Service
public class JoinService implements IJoinService {
	
	@Autowired
	IJoinDAO dao;

	@Override
	public int IDCheck(String userID) {
		// TODO Auto-generated method stub
		return dao.IDCheck(userID);
	}

	@Override
	public int insertUser(UserDTO dto) {
		// TODO Auto-generated method stub
		return dao.insertUser(dto);
	}

}
