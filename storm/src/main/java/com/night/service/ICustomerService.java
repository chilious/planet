package com.night.service;

public interface ICustomerService {
	/**
	 * 检查账号是否存在
	 * @param account
	 * @return
	 * @throws Exception
	 */
	public boolean checkAccountExist(String account)throws Exception;
}
