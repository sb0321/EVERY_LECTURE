package com.goldenbrothers.everylecture.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.goldenbrothers.everylecture.dao.ITestDAO;
import com.goldenbrothers.everylecture.model.TestDTO;

@Service
public class TestService implements ITestService {
	
	@Autowired
	@Qualifier("ITestDAO")
	ITestDAO dao;
	
	@Override
	public ArrayList<TestDTO> testList() {
		// TODO Auto-generated method stub
		return dao.testList();
	}

}
