package com.goldenbrothers.everylecture.Board.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldenbrothers.everylecture.Board.model.BoardDTO;
import com.goldenbrothers.everylecture.Board.service.IBoardService;
import com.goldenbrothers.everylecture.Login.model.LoginDTO;

@Controller
public class BoardController {
	
	@Autowired 
	IBoardService service;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	
	// 게시판 페이지
	@RequestMapping(value = "/board/boardForm")
	public String go_boardList(Model model) {
		
		int start = 0;
		int end = start + 10;
		
		// 처음 pagenation
		HashMap<String, Integer> pagination = new HashMap<String, Integer>();
		pagination.put("start", start);
		pagination.put("end", end);
		
		// 10개씩 전체 리스트를 가져온다.
		ArrayList<BoardDTO> boardList = service.selectBoardLimit(pagination);
		model.addAttribute("boardList", boardList);
		
		int totalBoardCount = service.selectBoardCount();
		model.addAttribute("totalBoardCount", totalBoardCount);
		
		model.addAttribute("curPage", 1);
		
		return "board/boardForm";
	}
	
	// 게시판 페이지 페이지네이션
	@RequestMapping(value = "/board/pagination/{curPage}")
	public String pagenation(@PathVariable int curPage, Model model) {
		
		System.out.println(curPage);
		
		int pageSize = 10;
		
		int start = (curPage - 1) * pageSize;
		int end = start + 10;
		
		int totalBoardCount = service.selectBoardCount();
		model.addAttribute("totalBoardCount", totalBoardCount);
		
		if(totalBoardCount <= end)
			end = totalBoardCount;
		
		// 페이지네이션 파라미터 설정
		HashMap<String, Integer> pagination = new HashMap<String, Integer>();
		pagination.put("start", start);
		pagination.put("end", end);
		
		ArrayList<BoardDTO> boardList = service.selectBoardLimit(pagination);
		model.addAttribute("boardList", boardList);
		
		model.addAttribute("curPage", curPage);
		
		return "board/boardForm";
	}
	
	@RequestMapping(value = "/board/boardWrite")
	public String go_boardWrite(HttpSession session, Model model) {		
		return "board/boardWrite";
	}
	
	@ResponseBody
	@RequestMapping(value = "/board/writeContent")
	public String writeContent(@RequestParam HashMap<String, String> content, 
			HttpSession session) {
		
//		// 사용자 정보를 불러옴
		LoginDTO user = (LoginDTO) session.getAttribute("uInfo");
		String userID = user.getUserID();
		String boardName = content.get("boardName");
		String boardText = content.get("boardText");
		
		// 파라메터 입력
		BoardDTO dto = new BoardDTO();
		
		dto.setUserID(userID);
		dto.setBoardName(boardName);
		dto.setBoardText(boardText);
		
//		System.out.println(boardName + " " + boardText);
		
		
		String result = Integer.toString(service.insertBoard(dto));
		
		
		return result;
	}
	
	// 보드 뷰
	@RequestMapping(value = "/board/boardView/{boardID}")
	public String boardView(@PathVariable String boardID, Model model) {
		
		System.out.println(boardID);
		
		BoardDTO board = service.selectOneBoard(boardID);
		// 조회수를 올린다.
		service.boardCountUp(boardID);
		
		model.addAttribute("board", board);
		
		return "forward:/comment/selectComment/" + boardID;
	}
	
	@RequestMapping(value = "/board/boardRevise/{boardID}")
	public String boardRevise(@PathVariable String boardID, Model model) {
		
		BoardDTO dto = service.selectOneBoard(boardID);
		
		model.addAttribute("board", dto);
		model.addAttribute("boardID", boardID);
		
		return "board/boardRevise";
	}
	
	@ResponseBody
	@RequestMapping(value = "/board/boardUpadte")
	public String boardUpadte(@RequestParam HashMap<String, String> newContent) {
		
		int boardID = Integer.parseInt(newContent.get("boardID"));
		String boardName = newContent.get("boardName");
		String boardText = newContent.get("boardText");
		
		// 파라미터 설정
		BoardDTO update = new BoardDTO();
		
		update.setBoardID(boardID);
		update.setBoardName(boardName);
		update.setBoardText(boardText);
		
		String result = Integer.toString(service.updateBoard(update));
		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/board/boardDelete")
	public String boardDelete(@RequestParam String boardID) {
		
		String result = Integer.toString(service.deleteBoard(boardID));
		
		return result;
	}
}
