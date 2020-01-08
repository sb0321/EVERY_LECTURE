package com.goldenbrothers.everylecture.Admin.dao;

import com.goldenbrothers.everylecture.Admin.model.AdminDTO;
import com.goldenbrothers.everylecture.Lecture.model.LectureDTO;

public interface IAdminDAO {
	
	public AdminDTO selectOneAdmin(String userID);

}
