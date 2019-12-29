package com.goldenbrothers.everylecture.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.goldenbrothers.everylecture.model.TestDTO;

public interface ITestDAO {
	
	public ArrayList<TestDTO> testList();

}
