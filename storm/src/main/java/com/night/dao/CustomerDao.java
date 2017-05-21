package com.night.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.night.entity.Customer;

@Repository
public class CustomerDao implements ICustomerDao {
	@Autowired HibernateTemplate tem;
	
	@Override
	public Customer findUserByAccount(String account) throws Exception {
		List<Customer> list = (List<Customer>) tem.find("from Customer where account = ?", account);
		if(list.size() == 0) return null;
		return list.get(0);
	}

	@Override
	public Customer findUserByAccountAndPassword(String account, String password) throws Exception {
		String hql = "from Customer where account = ? and password = ?";
		List<Customer> list = (List<Customer>) tem.find(hql, account, password);
		if(list.size() == 0) return null;
		return null;
	}
	
}
