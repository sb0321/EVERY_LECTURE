package com.goldenbrothers.everylecture.Login.service;

import java.util.ArrayList;

import com.goldenbrothers.everylecture.Admin.model.AdminDTO;
import com.goldenbrothers.everylecture.Login.model.LoginDTO;

public interface ILoginService {
	
	public LoginDTO selectOne(String userID);
	public ArrayList<LoginDTO>selectAll();
	public int insert(LoginDTO dto);
	public int update(LoginDTO dto);
	public int delete(String id);

}
