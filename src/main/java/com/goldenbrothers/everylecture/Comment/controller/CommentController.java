package com.goldenbrothers.everylecture.Comment.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldenbrothers.everylecture.Comment.model.CommentDTO;
import com.goldenbrothers.everylecture.Comment.service.ICommentService;
import com.goldenbrothers.everylecture.Login.model.LoginDTO;

@Controller
public class CommentController {
	
	@Autowired
	ICommentService service;

	private static final Logger logger = LoggerFactory.getLogger(CommentController.class);
	
	
	@ResponseBody
	@RequestMapping(value = "/comment/writeComment")
	public String write_comment(@RequestParam HashMap<String, String> comment, HttpSession session) {

		// 사전 파라미터 준비
		String comText = comment.get("comText");
		int boardID = Integer.parseInt(comment.get("boardID"));
		
		LoginDTO user = (LoginDTO) session.getAttribute("uInfo");
		String userID = user.getUserID();
		
		CommentDTO dto = new CommentDTO();
		
		dto.setBoardID(boardID);
		dto.setComText(comText);
		dto.setUserID(userID);
		
		String result = Integer.toString(service.insertComment(dto));
		
		return result;
	}
	
	@RequestMapping(value = "/comment/selectComment/{boardID}")
	public String select_comment(@PathVariable String boardID, Model model) {
		
		ArrayList<CommentDTO> commentList = service.selectComment(boardID);
		
		model.addAttribute("commentList", commentList);
		
		
		return "board/boardView";
	}
	
	@ResponseBody
	@RequestMapping(value = "/comment/deleteComment")
	public String delete_comment(@RequestParam String comID) {

		// 댓글 삭제
		String result = Integer.toString(service.deleteComment(comID));
		
		return result;
	}
}
