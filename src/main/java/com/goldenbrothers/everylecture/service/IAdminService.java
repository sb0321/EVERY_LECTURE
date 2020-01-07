package com.goldenbrothers.everylecture.service;

import com.goldenbrothers.everylecture.model.AdminDTO;
import com.goldenbrothers.everylecture.model.LectureDTO;

public interface IAdminService {
	
	public int uploadLecture(LectureDTO dto);
	public AdminDTO selectOneAdmin(String userID);

}
