package com.goldenbrothers.everylecture.Test.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.goldenbrothers.everylecture.Test.dao.ITestDAO;
import com.goldenbrothers.everylecture.Test.model.TestDTO;

@Service
public class TestService implements ITestService {
	
	//mybatis
	@Autowired
	@Qualifier("ITestDAO")
	ITestDAO dao;
	
	@Override
	public TestDTO oneList() {
		// TODO Auto-generated method stub
		return dao.oneList();
	}

}
