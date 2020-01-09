package com.goldenbrothers.everylecture.Lecture.model;

public class UserClassDTO {
	
	private String userID;
	private int lectureID;
	private String progress;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getLectureID() {
		return lectureID;
	}
	public void setLectureID(int lectureID) {
		this.lectureID = lectureID;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
	
	

}
