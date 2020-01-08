package com.goldenbrothers.everylecture.Join.service;

import com.goldenbrothers.everylecture.Login.model.LoginDTO;

public interface IJoinService {
	
	public int IDCheck(String userID);
	public int insertUser(LoginDTO dto);

}
