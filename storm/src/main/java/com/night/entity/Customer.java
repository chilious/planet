package com.night.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户实体类
 * @author Chilious
 *
 */
@Entity
@Table(name="customer")
public class Customer {
	@Id
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="sex")
	private Integer sex;
	
	@Column(name="email")
	private String email;
	
	@Column(name="account")
	private String account;
	
	@Column(name="password")
	private String password;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
