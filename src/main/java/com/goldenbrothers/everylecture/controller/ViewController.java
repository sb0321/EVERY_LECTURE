package com.goldenbrothers.everylecture.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goldenbrothers.everylecture.model.TestDTO;

@Controller
public class ViewController {
	
	private static final Logger logger = LoggerFactory.getLogger(ViewController.class);
	
	// index
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAllTest() {
		return "index";
	}
	
	// test
	@RequestMapping(value = "/test/test")
	public String test() {
		return "/test/test";
	}
	
	@RequestMapping(value = "/login/login_overlay")
	public String loginOverlay() {
		return "login/login_overlay";
	}
	
	@RequestMapping(value = "/login/login")
	public String login(HttpSession session) {
		return "/login/login";
	}
	
	// ∏∂¿Ã∆‰¿Ã¡ˆ ¿Ãµø
	@RequestMapping(value = "/mypage/mypage")
	public String mypage() {
		return "/mypage/mypage";
	}
	
	@RequestMapping(value = "/mypage/mypageLecture")
	public String go_lecture() {
		return "/mypage/mypage_lecture";
	}
	
	@RequestMapping(value = "/mypage/mypageUser")
	public String go_user() {
		return "/mypage/mypage_user";
	}
	
	//---------------------------admin-----------------------------
	@RequestMapping(value = "/goAdminLogin")
	public String go_admin_login() {
		return "/admin/admin_login";
	}
	
	@RequestMapping(value = "/admin/uploadLecture")
	public String go_admin_login1() {
		return "/admin/upload_lecture";
	}
	
	
	@RequestMapping(value = "/join/joinForm")
	public String join() {
		return "join/joinForm";
	}
	
	
	@RequestMapping(value = "/board/boardForm")
	public String board() {
		return "board/boardForm";
	}
	
	@RequestMapping(value = "/board/boardWrite")
	public String boardWrite() {
		return "board/boardWrite";
	}
	
	@RequestMapping(value = "/board/boardEdit")
	public String boardEdit() {
		return "board/boardEdit";
	}
	
<<<<<<< Upstream, based on origin/jm
	@RequestMapping(value = "/board/boardView")
	public String boardView() {
		return "board/boardView";
=======
	//------------------------lecture---------------------------
	@RequestMapping(value = "/lecture/lectureIndex")
	public String lecture_list() {
		return "redirect:/lecture/lectureList";
>>>>>>> 54c88c1 Í∞ïÏùò Î∂àÎü¨Ïò§Í∏∞ ÏôÑÎ£å
	}

}
