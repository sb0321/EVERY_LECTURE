package com.goldenbrothers.everylecture.Comment.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldenbrothers.everylecture.Comment.dao.ICommentDAO;
import com.goldenbrothers.everylecture.Comment.model.CommentDTO;

@Service
public class CommentService implements ICommentService {
	
	@Autowired
	ICommentDAO dao;
		
	@Override
	public int insertComment(CommentDTO dto) {
		// TODO Auto-generated method stub
		return dao.insertComment(dto);
	}

	@Override
	public ArrayList<CommentDTO> selectComment(String boardID) {
		// TODO Auto-generated method stub
		return dao.selectComment(boardID);
	}

	@Override
	public int deleteComment(String comID) {
		// TODO Auto-generated method stub
		return dao.deleteComment(comID);
	}

}
