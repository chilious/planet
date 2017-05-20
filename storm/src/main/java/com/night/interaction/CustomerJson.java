package com.night.interaction;

import java.util.HashMap;

public class CustomerJson extends HashMap<String,Object>{
	private static final long serialVersionUID = 8084663215902248206L;
	public CustomerJson(){}
	public CustomerJson(boolean success,String msg){
		this.put("success", success);
		this.put("msg", msg);
	}
	public void setSuccess(boolean success){
		this.put("success", success);
	}
	public void setMsg(String msg){
		this.put("msg", msg);
	}
	public void setAttribue(String key,Object value){
		this.put(key, value);
	}
}
