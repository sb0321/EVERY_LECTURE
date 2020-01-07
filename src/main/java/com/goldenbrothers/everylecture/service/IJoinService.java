package com.goldenbrothers.everylecture.service;

import com.goldenbrothers.everylecture.model.UserDTO;

public interface IJoinService {
	
	public int IDCheck(String userID);
	public int insertUser(UserDTO dto);

}
