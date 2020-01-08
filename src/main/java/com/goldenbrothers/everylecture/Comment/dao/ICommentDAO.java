package com.goldenbrothers.everylecture.Comment.dao;

import java.util.ArrayList;

import com.goldenbrothers.everylecture.Comment.model.CommentDTO;

public interface ICommentDAO {

	public int insertComment(CommentDTO dto);
	public ArrayList<CommentDTO> selectComment(String boardID);
	public int deleteComment(String comID);
}
