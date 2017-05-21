package com.night.dao;

import com.night.entity.Customer;

/**
 * 用户类dao
 * @author Chilious
 */
public interface ICustomerDao {
	
	/**
	 * 根据账号找到该用户
	 * @param account
	 * @return
	 * @throws Exception
	 */
	public Customer findUserByAccount(String account)throws Exception;
	
	/**
	 * 根据账号和密码找到该用户
	 * @param account
	 * @param password
	 * @return
	 */
	public Customer findUserByAccountAndPassword(String account, String password)throws Exception;
	
}
