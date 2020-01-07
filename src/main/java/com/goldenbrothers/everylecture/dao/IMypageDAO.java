package com.goldenbrothers.everylecture.dao;

import com.goldenbrothers.everylecture.model.UserDTO;

public interface IMypageDAO {
	
	public int update(UserDTO dto);
	public int deleteUser(String userID);
	public int updateName(UserDTO dto);
	public UserDTO selectOne(String userID);
	public int updatePW(UserDTO dto);

}
