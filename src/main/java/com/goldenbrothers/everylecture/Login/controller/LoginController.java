package com.goldenbrothers.everylecture.Login.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldenbrothers.everylecture.Admin.model.AdminDTO;
import com.goldenbrothers.everylecture.Login.model.LoginDTO;
import com.goldenbrothers.everylecture.Login.service.ILoginService;

@Controller
public class LoginController {
	
	@Autowired
	ILoginService service;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	// ajax 사용시에는 @ResponseBody 사용

	
	// 먼저 spring security 이후
	@RequestMapping(value = "/login/userLogin")
	public String goLogin(HttpSession session, Principal principal) {		
		// 사용자 정보 가져오기
		
		
		String userID = principal.getName();
		LoginDTO dto = new LoginDTO();
		try {
			
			if(userID != null)
				dto =  service.selectOne(userID);
			
			session.setAttribute("uInfo", dto);
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("error!!!");
		}
		
		return "redirect:/";
	}
	
	// 로그아웃 할 때
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	

	
}
