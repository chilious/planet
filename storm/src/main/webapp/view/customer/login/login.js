var loginCtrl = {
	errorCount : 0
}
/**
 * 监听所有*************************
 */
function listenAll(){
	/**
	 * 账号blur
	 */
	$('input[name="customer_account"]').blur(function(){
		checkAccount($.trim($(this).val()));
	});
	/**
	 * 密码blur
	 */
	$('input[name="customer_account"]').blur(function(){
		checkPassword();
	});
	/**
	 * 登录按钮
	 */
	$('#submit').click(function(){
		if(checkForm()) login();
	});
}
/**
 * 检查账号是否存在
 */
function checkAccount(account){
	var url = 'customer/account/'+account;
	var success = function(json){
		if(!json.success){
			$('#account_msg').html(json.msg);
			loginCtrl.errorCount++;
		}else{
			loginCtrl.errorCount--;
		}
	}
	$.get(url,null,success);
}
/**
 * 开始****************************
 */
$(function(){
	listenAll();
});