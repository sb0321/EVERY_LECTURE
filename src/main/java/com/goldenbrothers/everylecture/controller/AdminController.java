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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.goldenbrothers.everylecture.Utils.FileUtil;
import com.goldenbrothers.everylecture.model.AdminDTO;
import com.goldenbrothers.everylecture.model.LectureDTO;
import com.goldenbrothers.everylecture.service.IAdminService;

@Controller
public class AdminController {
	
	@Autowired
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
	
	@ResponseBody
	@RequestMapping(value = "/admin/uploadLecutureInfo")
	public String upload_lecture_info(MultipartRequest multipartRequest, 
			@RequestParam HashMap<String, Object> info,
			HttpSession session) {
		// ajax에서 보낸 파일을 받는다.
		MultipartFile file = multipartRequest.getFile("lectureImg");
		
		// 파일 업로드 관련 객체
		FileUtil fileUtil = new FileUtil();
		
		// 파일 저장하고 저장 경로를 반환
		String fileLocation = fileUtil.saveImage(file);
		
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
}
