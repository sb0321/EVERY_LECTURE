package com.goldenbrothers.everylecture.Comment.service;

import java.util.ArrayList;

import com.goldenbrothers.everylecture.Comment.model.CommentDTO;

public interface ICommentService {
	
	public int insertComment(CommentDTO dto);
	public ArrayList<CommentDTO> selectComment(String boardID);
	public int deleteComment(String comID);

}
