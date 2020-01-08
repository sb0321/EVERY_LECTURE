package com.goldenbrothers.everylecture.Login.dao;

import java.util.ArrayList;

import com.goldenbrothers.everylecture.Login.model.LoginDTO;

public interface ILoginDAO {
	
	public LoginDTO selectOne(String userID);
	public ArrayList<LoginDTO>selectAll();
	public int insert(LoginDTO dto);
	public int update(LoginDTO dto);
	public int delete(String id);

}
