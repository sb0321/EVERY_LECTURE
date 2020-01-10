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
	public String lecture_list(Model model, HttpServletRequest request, HttpSession session) {
		
		String userID = ((LoginDTO) session.getAttribute("uInfo")).getUserID();
		
		// 모든 강의를 가져온다.
		ArrayList<LectureDTO> lectureList = service.selectLectureAll();
		
		// 현재 등록된 강의를 찾는다.
		ArrayList<HashMap<String, Object>> registeredLectureList = service.getRegisteredLecture(userID);
		System.out.println(registeredLectureList.toString() + " registeredLectureList");
		
		// 현재 듣고 있는 강의들의 lectureID의 배열을 만든다.
		ArrayList<String> registeredLectureIDs = new ArrayList<String>();
		for(int i = 0; i < registeredLectureList.size(); i++) {
			// lectureID만 모여있는 배열을 만든다.
			registeredLectureIDs.add(Integer.toString((int) registeredLectureList.get(i).get("lectureID")));			
		}
		
		System.out.println(registeredLectureIDs.toString() + " registeredLectureIDs");
		// 등록된 강좌는 뺀다.
		ArrayList<LectureDTO> result = new ArrayList<LectureDTO>();
		for(int j = 0; j < lectureList.size(); j++) {
//			System.out.println(lectureList.get(j).getLectureID());
			if(!registeredLectureIDs.contains(Integer.toString(lectureList.get(j).getLectureID()))) {
				System.out.println(lectureList.get(j).getLectureID());
				result.add(lectureList.get(j));
			}
		}
		System.out.println(result.toString() + " result");
		
		
		// 강의 리스트를넣는다.
		model.addAttribute("lectureList", result);
		
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
		
		ArrayList<HashMap<String, Object>> registered = service.getRegisteredLecture(userID);
		
		session.setAttribute("registered", registered);
		
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
	
	@RequestMapping(value = "/lecture/goLectureExplain/{lectureID}")
	public String go_Lecture_explain(@PathVariable String lectureID, Model model) {
		
		LectureDTO lecture = service.selectOneLecture(lectureID);
		
		model.addAttribute("lecture", lecture);
		
		return "lecture/lectureExplain";
	}

}
