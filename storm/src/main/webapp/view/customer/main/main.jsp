<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/view/base/base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="view/customer/main/main.css"></link>

<title>用户主页</title>
</head>
<body>
	<div class="head">
		<div>
			<img id="gamelogo" alt="gun" src="image/game/gun1.png" />
			<div class="nav">
				<a href="#" target="_self">首页<br/><span>HOME</span></a>
				<a href="customer/person_center">个人中心</a>
				<a href="customer/store">商城</a>
				<a href="customer/players_workshop">玩家工坊</a>
			</div>
			<div class="nav">
				<a href="customer/news">新闻<br/><span>NEWS</span></a>
				<a href="customer/official_news">官方新闻</a>
				<a href="customer/match_news">赛事新闻</a>
				<a href="customer/update_log">更新日志</a>
				<a href="customer/game_strategy">游戏攻略</a>
			</div>
			<div class="nav">
				<a href="customer/match">赛事<br/><span>MATCH</span></a>
				<a href="customer/match_center">赛事中心</a>
				<a href="customer/match_pandect">赛事总览</a>
				<a href="customer/match_subject">赛事专题</a>
			</div>
			<div class="nav">
				<a href="customer/interaction">互动<br/><span>INTERACION</span></a>
				<a href="customer/excellent_comprehensive">精彩综合</a>
				<a href="customer/official_activity">官方活动</a>
				<a href="customer/players_bbs">玩家论坛</a>
				<a href="customer/sina_microblog">新浪微博</a>
				<a href="customer/official_wechat">官方微信</a>
			</div>
			<div class="nav">
				<a href="customer/data">资料<br/><span>DATA</span></a>
				<a href="customer/heros_data">英雄资料</a>
				<a href="customer/items_data">物品资料</a>
				<a href="customer/video_center">视频中心</a>
				<a href="customer/custom_map">自定义地图</a>
				<a href="customer/novice_guide">新手引导</a>
			</div>
			<div class="nav">
				<a href="customer/service">服务<br/><span>SERVICE</span></a>
				<a href="customer/service_center">客服中心</a>
				<a href="customer/online_service">在线客服</a>
				<a href="customer/cafes_privileges">网吧特权</a>
				<a href="customer/communication_verification">通信证查证</a>
			</div>
			<div class="nav">
				<a href="customer/download">下载<br/><span>DOWNLOAD</span></a>
				<a href="customer/game_download">游戏下载</a>
				<a href="customer/app_assitance">APP助手</a>
				<a href="customer/beautiful_wallpaper">精美壁纸</a>
				<a href="customer/official_comics">官方漫画</a>
			</div>
			
			
			<img id="customer_default_avatar" alt="avatar" src="image/customer/default_ava.png" />
			
			<div class="nav_login">
				您好，请<a href="javascript:gotoLogin();">登录</a><br/>
				<span>登录后可进入您的个人中心</span>
			</div>
		</div>
	</div>
	<div class="holy">
		<div id="scroll_image">
			<img src="image/customer/main_scroll_1/1.jpg" alt="1" />
			<img src="image/customer/main_scroll_1/2.jpg" alt="2" />
			<img src="image/customer/main_scroll_1/3.jpg" alt="3" />
		</div>
	</div>
	<iframe id="bottomIframe" name="bottomIframe" src="customer/bottom" 
		scrolling="no" frameborder="no" border="0" marginwidth="0" marginheight="0">
	</iframe>
</body>

<script type="text/javascript" src="plugin/jquery/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="plugin/Flux-Slider-master/js/flux.js"></script>
<script type="text/javascript" src="view/customer/main/main.js"></script>
</html>