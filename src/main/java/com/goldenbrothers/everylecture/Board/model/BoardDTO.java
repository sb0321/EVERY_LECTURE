package com.goldenbrothers.everylecture.Board.model;

public class BoardDTO {
	
	private int boardID;
	private String userID;
	private String boardName;
	private String boardText;
	private String boardTime;
	private int showed;
	private String DelYn;
	
	public int getBoardID() {
		return boardID;
	}
	public void setBoardID(int boardID) {
		this.boardID = boardID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getBoardText() {
		return boardText;
	}
	public void setBoardText(String boardText) {
		this.boardText = boardText;
	}
	public String getBoardTime() {
		return boardTime;
	}
	public void setBoardTime(String boardTime) {
		this.boardTime = boardTime;
	}
	public String getDelYn() {
		return DelYn;
	}
	public void setDelYn(String delYn) {
		DelYn = delYn;
	}
	public int getShowed() {
		return showed;
	}
	public void setShowed(int showed) {
		this.showed = showed;
	}
	
	

}
