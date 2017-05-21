<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/view/base/base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css"
	href="view/customer/login/login.css" />
<title>customer_login</title>
</head>
<body>
	<div class="top"></div>
	<div class="msg" id="account_msg"></div>
	<div class="row">
		<input type="text" class="fillin" name="customer_account"
			placeholder="账号" maxlength="50" />
	</div>
	<div class="msg" id="password_msg"></div>
	<div class="row">
		<input type="password" class="fillin" name="customer_password"
			placeholder="密码" maxlength="50" />
	</div>
	<div class="msg"></div>
	<div class="row" id="other_option">
		<input type="checkbox" name="auto_login" /> <span>下次自动登录</span> <a
			href="customer/forget_password">忘记密码？</a>
	</div>
	<div class="row" id="submit">
		<span>登录</span>
	</div>
</body>

<script type="text/javascript" src="plugin/jquery/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="view/util/string_util.js"></script>
<script type="text/javascript" src="view/customer/login/login.js"></script>
</html>