package com.goldenbrothers.everylecture.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goldenbrothers.everylecture.service.ITestService;

@Controller
public class TestController {
	
	@Autowired
	ITestService service;

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAllTest(Model model) {
		
		service.oneList();
		
		return "index";
	}

}
