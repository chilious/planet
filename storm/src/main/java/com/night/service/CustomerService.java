package com.night.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.night.dao.ICustomerDao;
import com.night.entity.Customer;
import com.night.exception.CustomerException;

@Service
@Transactional
public class CustomerService implements ICustomerService {
	@Autowired ICustomerDao dao;
	
	@Override
	public void checkAccountExist(String account) throws Exception {
		Customer customer = dao.findUserByAccount(account);
		if(customer == null) throw new CustomerException("account_not_exist");
		if(customer.getFrozen() == 1) throw new CustomerException("account_frozen");
	}

	@Override
	public void checkPassword(String account, String password) throws Exception {
		Customer customer = dao.findUserByAccountAndPassword(account,password);
		System.out.println(account + "----"+password);
		if(customer == null) throw new CustomerException("password_wrong");
	}

	@Override
	public void login(Customer customer) throws Exception {
		this.checkAccountExist(customer.getAccount());
		this.checkPassword(customer.getAccount(), customer.getPassword());
	}
}
