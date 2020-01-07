package com.goldenbrothers.everylecture.dao;

import com.goldenbrothers.everylecture.model.AdminDTO;

public interface IAdminDAO {
	
	public AdminDTO selectOneAdmin(String userID);

}
