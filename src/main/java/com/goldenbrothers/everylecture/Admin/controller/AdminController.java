package com.goldenbrothers.everylecture.Admin.controller;

import java.security.Principal;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.goldenbrothers.everylecture.Admin.model.AdminDTO;
import com.goldenbrothers.everylecture.Admin.service.IAdminService;
import com.goldenbrothers.everylecture.Lecture.model.LectureDTO;
import com.goldenbrothers.everylecture.Utils.FileUtil;

@Controller
public class AdminController {
	
	@Autowired
//	@Qualifier("IAdminService")
	IAdminService service;
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	//------------------------------ admin 로그인 ------------------------------
	
	@RequestMapping(value = "/admin/adminLogin")
	public String goLoginAdmin(HttpSession session, Principal principal) {		
		// 사용자 정보 가져오기
		String userID = principal.getName();
		System.out.println(userID);
		AdminDTO dto = new AdminDTO();
		try {
			
			if(userID != null)
				dto =  service.selectOneAdmin(userID);
			
			session.setAttribute("aInfo", dto);
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("error!!!");
		}
		
		
		return "redirect:/";
	}
	
	// 강의 생성
	@ResponseBody
	@RequestMapping(value = "/admin/uploadLecutureInfo")
	public String upload_lecture_info(MultipartRequest multipartRequest, 
			@RequestParam HashMap<String, Object> info,
			HttpSession session, HttpServletRequest request) {
		// ajax에서 보낸 파일을 받는다.
		MultipartFile file = multipartRequest.getFile("lectureImg");
		
		// 파일 업로드 관련 객체
		FileUtil fileUtil = new FileUtil();
		
		// 파일 저장하고 저장 경로를 반환
		String fileLocation = fileUtil.saveImage(file, request);
		
		LectureDTO dto = new LectureDTO();
		
		// dto 사전 준비
		AdminDTO user = (AdminDTO) session.getAttribute("aInfo");
		
		String adminID = user.getAdminID();
		String lectureName = (String) info.get("lectureName");
		String lectureExplain = (String) info.get("lectureExplain");
		String lectureImgName = file.getOriginalFilename();
		String lectureImgPath = fileLocation;
		
		// dto에 적용
		dto.setAdminID(adminID);
		dto.setLectureName(lectureName);
		dto.setLectureExplain(lectureExplain);
		dto.setLectureImgName(lectureImgName);
		dto.setLectureImgPath(lectureImgPath);
		
		// 데이터베이스에 저장
		String result = Integer.toString(service.uploadLecture(dto));
		
		
		return result;
	}
	
	// 강의 삭제
	@ResponseBody
	@RequestMapping(value = "/admin/deleteLecture")
	public String delete_lecture(@RequestParam String lectureID, HttpServletRequest request) {
		
		System.out.println(lectureID);
		
		// 강의 정보 불러옴
		LectureDTO lecture = service.selectOneLecture(lectureID);
		String filePath = lecture.getLectureImgPath();
		
		System.out.println(filePath);
		
		// 강의 삭제
		String result = Integer.toString(service.deleteOneLecture(lectureID));
		
		// 강의 이미지 삭제
		FileUtil fileUtil = new FileUtil();
		fileUtil.deleteImage(filePath, request);
		
		return result;
	}
	

	@RequestMapping(value = "/admin/goDeleteLecture")
	public String go_delete_lecture(Model model) {
		
		// 모든 강의를 가져온다.
		ArrayList<LectureDTO> lectureList = service.selectLectureAll();
		
		// 넣는다.
		model.addAttribute("lectureList", lectureList);
		
		return "admin/lecture_index_admin";
	}
	
}
