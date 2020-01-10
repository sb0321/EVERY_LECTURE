package com.goldenbrothers.everylecture.Mypage.controller;


import java.security.Principal;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldenbrothers.everylecture.Login.model.LoginDTO;
import com.goldenbrothers.everylecture.Mypage.service.IMypageService;

@Controller
public class MypageController {
	
	@Autowired
//	@Qualifier("IMypageService")
	IMypageService service;
	
	private static final Logger logger = LoggerFactory.getLogger(MypageController.class);
	
	// 마이페이지 이동
	@RequestMapping(value = "/mypage/mypage")
	public String mypage() {
		return "forward:/lecture/getRegisteredLectureMypage";
	}
	
	@ResponseBody
	@RequestMapping(value = "/mypage/changeName")
	public String changeName(HttpSession session, @RequestParam String userName) {
		
		// 사용자 정보를 가져옴
		LoginDTO user = (LoginDTO) session.getAttribute("uInfo");
		String userID = user.getUserID();
		
		LoginDTO dto = new LoginDTO();
		
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
		
		String result = "0";
		
		// 사용자 정보를 가져온다
		LoginDTO user = (LoginDTO)session.getAttribute("uInfo");
		
		if(user.getUserPW().equals(userPW))
			result = "1";
		
		return result;
	}
	
	// 비밀번호 바꿈
	@ResponseBody
	@RequestMapping(value = "/mypage/changePassword")
	public String changePassword(HttpSession session, @RequestParam String newUserPW) {
		
		
		
		// 사용자 정보를 가져온다
		LoginDTO update = (LoginDTO)session.getAttribute("uInfo");
		
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
	
	// 회원 탈퇴 체크
	@ResponseBody
	@RequestMapping(value = "/mypage/expireUserCheck")
	public String expireUserCheck(Principal principal) {
		
		String userID = principal.getName();
		System.out.println(userID);
		
		return userID;
	}
	
	
	// 회원 탈퇴
	@ResponseBody
	@RequestMapping(value = "/mypage/expireUser")
	public String expireUser(@RequestParam HashMap<String, String> user) {
		
		String result = Integer.toString(service.deleteUser(user.get("userID")));
		
		return result;
	}
	
	// 등록된 강의 삭제
	@RequestMapping(value = "/mypage/deleteRegisteredLecture/{lectureID}")
	public String delete_registered_lecture(@PathVariable String lectureID, HttpSession session) {
		
		String userID = ((LoginDTO) session.getAttribute("uInfo")).getUserID();
		
		HashMap<String, String> IDs = new HashMap<String, String>();
		
		IDs.put("lectureID", lectureID);
		IDs.put("userID", userID);
		
		service.deleteRegisteredLecture(IDs);
		
		return "forward:/mypage/mypage";
	}

}
