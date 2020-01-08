package com.goldenbrothers.everylecture.Admin.service;

import com.goldenbrothers.everylecture.Admin.model.AdminDTO;
import com.goldenbrothers.everylecture.Lecture.model.LectureDTO;

public interface IAdminService {
	
	public int uploadLecture(LectureDTO dto);
	public AdminDTO selectOneAdmin(String userID);

}
