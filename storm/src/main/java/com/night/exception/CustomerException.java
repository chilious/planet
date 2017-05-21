package com.night.exception;

/**
 * 用户相关异常
 * @author Chilious
 */
public class CustomerException extends Exception {
	private static final long serialVersionUID = 1L;
	public CustomerException(){
		super();
	}
	public CustomerException(String msg){
		super(msg);
	}
}
