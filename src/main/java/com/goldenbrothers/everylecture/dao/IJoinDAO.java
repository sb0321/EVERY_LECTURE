package com.goldenbrothers.everylecture.dao;

import com.goldenbrothers.everylecture.model.UserDTO;

public interface IJoinDAO {
	
	public int insertUser(UserDTO dto);
	public int IDCheck(String userID);

}
