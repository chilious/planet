package com.night.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("customer")
@ResponseBody
public class CustomerController {
	@Autowired	HttpServletRequest req;
	
	@RequestMapping("main")
	public ModelAndView gotoMain(){
		ModelAndView mav = new ModelAndView("customer/main/main");
		return mav;
	}
	
	@RequestMapping("bottom")
	public ModelAndView gotoBottom(){
		ModelAndView mav = new ModelAndView("bottom/bottom");
		return mav;
	}
}
