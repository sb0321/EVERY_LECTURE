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
		
		String userID = session.getId();
		
		UserDTO dto = new UserDTO();
		
		dto.setUserID(userID);
		dto.setUserName(userName);
		
		String result = "init";
		try {			
			result = Integer.toString(service.updateName(dto));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(userID);
		
		return result;
	}
	

}
