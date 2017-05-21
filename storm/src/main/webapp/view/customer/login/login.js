var loginCtrl = {
	account_flag : true,
	password_flag : true
}
/**
 * 监听所有*************************
 */
function listenAll() {
	/**
	 * 账号blur
	 */
	$('input[name="customer_account"]').change(function() {
		checkAccount($.trim($(this).val()));
	});
	/**
	 * 密码blur
	 */
	$('input[name="customer_password"]').change(function() {
		checkPassword($(this).val());
	});
	/**
	 * 登录按钮
	 */
	$('#submit').click(function() {
		if (checkForm())	login();
	});
	/**
	 * 回车键
	 */
	$(document).keypress(function(e) {  
		if(e.which == 13) {  
			if (checkForm())	login();
		}  
	}); 
}
/**
 * 检查账号是否存在
 */
function checkAccount(account) {
	var url = 'customer/account/' + account;
	var success = function(json) {
		loginCtrl.account_flag = json.success;
		$('#account_msg').html(json.msg);
	}
	$.get(url, null, success);
}
/**
 * 检查密码
 * @param password
 */
function checkPassword(password) {
	if(!loginCtrl.account_flag) return;
	alert('xxx');
	var account = $.trim($('input[name="customer_account"]').val());
	var password = $('input[name="customer_password"]').val();
	var url = 'customer/password';
	var data = {
		account : account,
		password : password
	}
	var success = function(json){
		loginCtrl.password_flag = json.success;
		$('#password_msg').html(json.msg);
	}
	$.get(url, data, success);
}
/**
 * 登录前检查
 */
function checkForm(){
	var account = $.trim($('input[name="customer_account"]').val());
	var password = $('input[name="customer_password"]').val();
	if(StringUtil.isNone(account)){
		loginCtrl.account_flag = false;
		$('#account_msg').html("账号不能为空");
	}
	if(StringUtil.isNone(password)){
		loginCtrl.password_flag = false;
		$('#password_msg').html("密码不能为空");
	}
	if(!loginCtrl.account_flag || !loginCtrl.password_flag) return false;
	return true;
}
/**
 * 登录
 */
function login(){
	var account = $.trim($('input[name="customer_account"]').val());
	var password = $('input[name="customer_password"]').val();
	var url = 'customer/login';
	var data = {
		account : account,
		password : password
	}
	var success = function(json){
		alert(JSON.stringify(json));
		if(json.success){
			//----------------------
		}else{
			loginCtrl.account_flag = json.account_result;
			$('#account_msg').html(json.account_msg);
			loginCtrl.password_flag = json.password_result;
			$('#password_msg').html(json.password_msg);
		}
	}
	$.get(url, data, success);
}
/**
 * 开始****************************
 */
$(function() {
	$('input[name="customer_account"]').focus();
	listenAll();
});