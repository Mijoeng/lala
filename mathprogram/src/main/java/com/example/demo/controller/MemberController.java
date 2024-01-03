package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	@Autowired
	JpaMemberRepository jpaMember;
	
	@RequestMapping(value="insertMemberForm")
	public ModelAndView insertMemberForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("signup");
		return mav;
	}
	
	@RequestMapping(value="loginForm")
	public ModelAndView loginForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
}
