package com.goldenbrothers.everylecture.Login.dao;

import java.util.ArrayList;

import com.goldenbrothers.everylecture.Login.model.LoginDTO;

public interface ILoginDAO {
	
	public LoginDTO selectOne(String userID);

}
