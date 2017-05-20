package com.night.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.night.dao.ICustomerDao;

@Service
public class CustomerService implements ICustomerService {
	@Autowired ICustomerDao dao;
	
	@Override
	public boolean checkAccountExist(String account) throws Exception {
		return false;
	}
}
