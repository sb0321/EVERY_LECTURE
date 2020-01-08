package com.goldenbrothers.everylecture.Admin.service;

import java.util.ArrayList;

import com.goldenbrothers.everylecture.Admin.model.AdminDTO;
import com.goldenbrothers.everylecture.Lecture.model.LectureDTO;

public interface IAdminService {
	
	public int uploadLecture(LectureDTO dto);
	public AdminDTO selectOneAdmin(String userID);
	public int deleteOneLecture(String lectureID);
	public LectureDTO selectOneLecture(String lectureID);
	public ArrayList<LectureDTO> selectLectureAll();

}
