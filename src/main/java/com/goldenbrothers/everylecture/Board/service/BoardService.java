package com.goldenbrothers.everylecture.Board.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldenbrothers.everylecture.Board.dao.IBoardDAO;
import com.goldenbrothers.everylecture.Board.model.BoardDTO;
import com.goldenbrothers.everylecture.Login.model.LoginDTO;

@Service
public class BoardService implements IBoardService {
	
	@Autowired
	IBoardDAO dao;

	@Override
	public ArrayList<BoardDTO> selectBoardAll() {
		// TODO Auto-generated method stub
		return dao.selectBoardAll();
	}

	@Override
	public LoginDTO selectOneUser(String userID) {
		// TODO Auto-generated method stub
		return dao.selectOneUser(userID);
	}

	@Override
	public int insertBoard(BoardDTO dto) {
		// TODO Auto-generated method stub
		return dao.insertBoard(dto);
	}

	@Override
	public BoardDTO selectOneBoard(String boardID) {
		// TODO Auto-generated method stub
		return dao.selectOneBoard(boardID);
	}

	@Override
	public int updateBoard(BoardDTO dto) {
		// TODO Auto-generated method stub
		return dao.updateBoard(dto);
	}

	@Override
	public int deleteBoard(String boardID) {
		// TODO Auto-generated method stub
		return dao.deleteBoard(boardID);
	}

	@Override
	public int boardCountUp(String boardID) {
		// TODO Auto-generated method stub
		return dao.boardCountUp(boardID);
	}
}
