package com.goldenbrothers.everylecture.controller;

import com.goldenbrothers.everylecture.model.UserDTO;
import com.goldenbrothers.everylecture.service.IJoinService;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JoinController {
	
	@Autowired
	IJoinService service;
	
	private static final Logger logger = LoggerFactory.getLogger(JoinController.class);
	
	
	@ResponseBody
	@RequestMapping(value = "/join/IDCheck")
	public String IDCheck(@RequestParam String id) {
		
		String result = Integer.toString(service.IDCheck(id));
		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/join/userJoin")
	public String userJoin(@RequestParam HashMap<String, String> userInfo) {
		
		UserDTO dto = new UserDTO();
		
		dto.setUserID(userInfo.get("userID"));
		dto.setUserPW(userInfo.get("userPW"));
		dto.setUserName(userInfo.get("userName"));
		
		String result = Integer.toString(service.insertUser(dto));
		
		return result;
		
	}


}
