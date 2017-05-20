package com.night.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.night.interaction.CustomerJson;
import com.night.service.ICustomerService;

@Controller
@RequestMapping("customer")
@ResponseBody
public class CustomerController {
	@Autowired	HttpServletRequest req;
	@Autowired	ICustomerService service;
	
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
	
	@RequestMapping("login_page")
	public ModelAndView gotoLogin(){
		ModelAndView mav = new ModelAndView("customer/login/login");
		return mav;
	}
	
	@RequestMapping("account/{account}")
	public CustomerJson checkAccount(@PathVariable("account") String account){
		CustomerJson json = new CustomerJson();
		try{
			System.out.println(account+"--------------");
			service.checkAccountExist(account);
		}catch(Exception e){
			
		}finally{
			return json;
		}
	}
}
