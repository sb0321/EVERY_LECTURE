package com.goldenbrothers.everylecture.controller;

import java.security.Principal;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldenbrothers.everylecture.model.UserDTO;
import com.goldenbrothers.everylecture.service.IMypageService;

@Controller
public class MypageController {
	
	@Autowired
	IMypageService service;
	
	private static final Logger logger = LoggerFactory.getLogger(MypageController.class);
	
	@ResponseBody
	@RequestMapping(value = "/mypage/changeName")
	public String changeName(HttpSession session, @RequestParam String userName) {
		
		// 사용자 정보를 가져옴
		UserDTO user = (UserDTO) session.getAttribute("uInfo");
		String userID = user.getUserID();
		
		UserDTO dto = new UserDTO();
		
		dto.setUserID(userID);
		dto.setUserName(userName);
		
		String result = "init";
		try {			
			result = Integer.toString(service.updateName(dto));
			
			if(result.equals("1")) {
				
				session.removeAttribute("uInfo");
				
				user = service.selectOne(userID);
				
				session.setAttribute("uInfo", user);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	// 비밀번호를 바꿈
	@ResponseBody
	@RequestMapping(value = "/mypage/checkPassword")
	public String checkPassword(HttpSession session, @RequestParam String userPW) {
		
		System.out.println(userPW);
		
		String result = "0";
		
		// 사용자 정보를 가져온다
		UserDTO user = (UserDTO)session.getAttribute("uInfo");
		
		if(user.getUserPW().equals(userPW))
			result = "1";
		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/mypage/changePassword")
	public String changePassword(HttpSession session, @RequestParam String newUserPW) {
		
		
		
		// 사용자 정보를 가져온다
		UserDTO update = (UserDTO)session.getAttribute("uInfo");
		
		update.setUserPW(newUserPW);
		String result = "init";
		try {
			result = Integer.toString(service.updatePW(update));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
	}

}
