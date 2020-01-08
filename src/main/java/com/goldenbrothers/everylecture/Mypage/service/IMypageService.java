package com.goldenbrothers.everylecture.Mypage.service;


import com.goldenbrothers.everylecture.Login.model.LoginDTO;

public interface IMypageService {
	
	public int deleteUser(String userID);
	public int updateName(LoginDTO dto);
	public int updatePW(LoginDTO dto);
	public LoginDTO selectOne(String userID);


}
