package com.goldenbrothers.everylecture.Join.dao;

import com.goldenbrothers.everylecture.Login.model.LoginDTO;

public interface IJoinDAO {
	
	public int insertUser(LoginDTO dto);
	public int IDCheck(String userID);

}
