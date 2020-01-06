package com.goldenbrothers.everylecture.service;

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
	public int updateName(UserDTO dto) {
		// TODO Auto-generated method stub
		return dao.update(dto);
	}
	
	

}
