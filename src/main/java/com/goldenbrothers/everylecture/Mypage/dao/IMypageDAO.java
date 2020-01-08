package com.goldenbrothers.everylecture.Mypage.dao;

import com.goldenbrothers.everylecture.Login.model.LoginDTO;

public interface IMypageDAO {
	
	public int deleteUser(String userID);
	public int updateName(LoginDTO dto);
	public int updatePW(LoginDTO dto);
	public LoginDTO selectOne(String userID);

}
