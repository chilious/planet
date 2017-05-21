package com.night.service;

import com.night.entity.Customer;

public interface ICustomerService {
	/**
	 * 检查账号是否存在
	 * @param account
	 * @return
	 * @throws Exception
	 */
	public void checkAccountExist(String account)throws Exception;
	/**
	 * 检查密码是否正确
	 * @param account
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public void checkPassword(String account,String password)throws Exception;
	/**
	 * 用户登录
	 * @param customer
	 * @return
	 */
	public void login(Customer customer)throws Exception;
}
