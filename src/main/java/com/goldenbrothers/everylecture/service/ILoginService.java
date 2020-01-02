package com.goldenbrothers.everylecture.service;

import java.util.ArrayList;

import com.goldenbrothers.everylecture.model.UserDTO;

public interface ILoginService {
	
	public UserDTO selectOne(UserDTO dto);
	public ArrayList<UserDTO>selectAll();
	public int insert(UserDTO dto);
	public int update(UserDTO dto);
	public int delete(String id);

}
