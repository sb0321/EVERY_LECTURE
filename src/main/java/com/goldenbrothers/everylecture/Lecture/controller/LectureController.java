package com.goldenbrothers.everylecture.Lecture.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldenbrothers.everylecture.Lecture.model.LectureDTO;
import com.goldenbrothers.everylecture.Lecture.model.UserClassDTO;
import com.goldenbrothers.everylecture.Lecture.service.ILectureService;
import com.goldenbrothers.everylecture.Login.model.LoginDTO;

@Controller
public class LectureController {
	
	@Autowired
//	@Qualifier("ILectureService")
	ILectureService service;
	
	private static final Logger logger = LoggerFactory.getLogger(LectureController.class);
	
	@RequestMapping(value = "/lecture/lectureList")
	public String lecture_list(Model model, HttpServletRequest request) {
		
		
		// 모든 강의를 가져온다.
		ArrayList<LectureDTO> lectureList = service.selectLectureAll();
		
		// 넣는다.
		model.addAttribute("lectureList", lectureList);
		
		System.out.println(request.getSession().getServletContext().getRealPath("/"));
		
		return "lecture/lecture_index";
	}
	
	
	@RequestMapping(value = "/lecture/applyLecture/{lectureID}")
	public String lecture_apply(@PathVariable String lectureID, HttpSession session) {
		
		// 사용자 정보 가져옴
		LoginDTO user = (LoginDTO) session.getAttribute("uInfo");
		String userID = user.getUserID();
		
		// 파라미터 설정
		UserClassDTO dto = new UserClassDTO();
		dto.setLectureID(Integer.parseInt(lectureID));
		dto.setUserID(userID);
		
		String result = Integer.toString(service.registerLecture(dto));
		
		return "/mypage/mypage";
	}
	
	@RequestMapping(value = "/lecture/getRegisteredLectureMypage")
	public String get_registered_lecture(HttpSession session, Model model) {
		
		// 사용자 정보를 가져옴
		LoginDTO user = (LoginDTO) session.getAttribute("uInfo");
		String userID = user.getUserID();
		
		ArrayList<HashMap<String, Object>> registered = service.getRegisteredLecture(userID);
		
		session.setAttribute("registered", registered);
		
		return "/mypage/mypage";
		
	}

}
