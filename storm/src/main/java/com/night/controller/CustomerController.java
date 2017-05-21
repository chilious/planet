package com.night.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.night.entity.Customer;
import com.night.exception.CustomerException;
import com.night.interaction.CustomerJson;
import com.night.service.ICustomerService;
import com.night.system.utils.ProUtil;

@Controller
@RequestMapping("customer")
@ResponseBody
public class CustomerController {
	@Autowired	HttpServletRequest req;
	@Autowired	ICustomerService service;
	
	/**
	 * 跳转到客户主页
	 * @return
	 */
	@RequestMapping("main")
	public ModelAndView gotoMain(){
		ModelAndView mav = new ModelAndView("customer/main/main");
		return mav;
	}
	
	/**
	 * 跳转到底页
	 * @return
	 */
	@RequestMapping("bottom")
	public ModelAndView gotoBottom(){
		ModelAndView mav = new ModelAndView("bottom/bottom");
		return mav;
	}
	
	/**
	 * 跳转到登录页
	 * @return
	 */
	@RequestMapping("login_page")
	public ModelAndView gotoLogin(){
		ModelAndView mav = new ModelAndView("customer/login/login");
		return mav;
	}
	
	/**
	 * 检查账号是否存在
	 * @param account
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping(value="account/{account}",method=RequestMethod.GET)
	public CustomerJson checkAccount(@PathVariable("account") String account){
		CustomerJson json = new CustomerJson();
		try{
			service.checkAccountExist(account);
			json.setSuccess(true);
		}catch(Exception e){
			json.setSuccess(false);
			if(e instanceof CustomerException){
				json.setMsg(ProUtil.getException(e.getMessage()));
			}
		}finally{
			return json;
		}
	}
	
	/**
	 * 检查密码是否正确
	 * @param account
	 * @param password
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping(value="password",method=RequestMethod.GET)
	public CustomerJson checkPassword(String account,String password){
		CustomerJson json = new CustomerJson();
		try{
			service.checkPassword(account,password);
			json.setSuccess(true);
		}catch(Exception e){
			json.setSuccess(false);
			if(e instanceof CustomerException){
				json.setMsg(ProUtil.getException(e.getMessage()));
			}
		}finally{
			return json;
		}
	}
	
	/**
	 * 登录
	 * @param account
	 * @param password
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping(value="login",method=RequestMethod.GET)
	public CustomerJson login(Customer customer){
		CustomerJson json = new CustomerJson();
		json.setAttribue("account_result", true);
		json.setAttribue("password_result", true);
		json.setAttribue("account_msg", "");
		json.setAttribue("password_msg", "");
		try{
			service.login(customer);
			json.setSuccess(true);
		}catch(Exception e){
			if(e instanceof CustomerException){
				String msg = e.getMessage();
				if("account_not_exist".equals(msg) || "account_frozen".equals(msg)){
					json.setAttribue("account_result", false);
					json.setAttribue("account_msg", ProUtil.getException(msg));
				}else{
					json.setAttribue("password_result", false);
					json.setAttribue("password_msg", ProUtil.getException(msg));
				}
			}
		}finally{
			return json;
		}
	}
}
