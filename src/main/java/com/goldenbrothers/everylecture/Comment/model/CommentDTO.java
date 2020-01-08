package com.goldenbrothers.everylecture.Comment.model;

public class CommentDTO {
	
	private int comID;
	private String userID;
	private int boardID;
	private String comText;
	private String comTime;
	public int getComID() {
		return comID;
	}
	public void setComID(int comID) {
		this.comID = comID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getBoardID() {
		return boardID;
	}
	public void setBoardID(int boardID) {
		this.boardID = boardID;
	}
	public String getComText() {
		return comText;
	}
	public void setComText(String comText) {
		this.comText = comText;
	}
	public String getComTime() {
		return comTime;
	}
	public void setComTime(String comTime) {
		this.comTime = comTime;
	}
	
	

}
