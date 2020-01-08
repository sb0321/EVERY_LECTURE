package com.goldenbrothers.everylecture.Board.service;

import java.util.ArrayList;

import com.goldenbrothers.everylecture.Board.model.BoardDTO;
import com.goldenbrothers.everylecture.Login.model.LoginDTO;

public interface IBoardService {
	
	public ArrayList<BoardDTO> selectBoardAll();
	public LoginDTO selectOneUser(String userID);
	public int insertBoard(BoardDTO dto);
	public BoardDTO selectOneBoard(String boardID);

}
