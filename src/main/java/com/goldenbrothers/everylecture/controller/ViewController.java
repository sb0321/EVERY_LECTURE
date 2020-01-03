package com.goldenbrothers.everylecture.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goldenbrothers.everylecture.model.TestDTO;

@Controller
public class ViewController {
	
	private static final Logger logger = LoggerFactory.getLogger(ViewController.class);
	
	// index
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAllTest() {
		return "index";
	}
	
	// test
	@RequestMapping(value = "/test/test")
	public String test() {
		return "/test/test";
	}
	
	@RequestMapping(value = "login/login_overlay")
	public String loginOverlay() {
		return "login/login_overlay";
	}
	

}
