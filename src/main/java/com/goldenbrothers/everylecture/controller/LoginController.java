package com.goldenbrothers.everylecture.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldenbrothers.everylecture.model.UserDTO;
import com.goldenbrothers.everylecture.service.ILoginService;

@Controller
public class LoginController {
	
	@Autowired
	ILoginService service;
	
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	// ajax 사용시에는 @ResponseBody 사용
	@ResponseBody
	@RequestMapping(value = "/login/goLogin", method = RequestMethod.POST)
	// dto로 자동 들어옴
	public String goLogin(UserDTO dto) {
		
		String result = "1";
		
		UserDTO check = new UserDTO();
		
		try {
			
			if(service.selectOne(dto) == null)
				result = "0";
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return result;
	}
}
