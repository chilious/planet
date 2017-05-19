/**
 * 监听所有
 */
function listenAll(){
	/**
	 * menu鼠标悬停事件
	 */
	$('.nav').mouseover(function(){
		$(this).find('a').eq(0).css('color','#019ccf');
	});
	/**
	 * menu鼠标移出事件
	 */
	$('.nav').mouseout(function(){
		$(this).find('a').eq(0).css('color','#979797');
	});
	/**
	 * submenu鼠标悬停事件
	 */
	$('.nav a').mouseover(function(){
		$(this).css('color','#019ccf');
	});
	/**
	 * submenu鼠标移出事件
	 */
	$('.nav a').mouseout(function(){
		$(this).css('color','#979797');
	});
}
/**
 * 打开登录窗口
 */
function gotoLogin(){
	
}
/**
 * 图片轮播
 */
function scrollImg(){
	window.myFlux = new flux.slider('#scroll_image',{
		autoplay: true,
		pagination: true,
		controls:true,
		width:1320,
		height:700
	});
}
/**
 * 开始*****************************************
 */
$(function(){
	listenAll();
	scrollImg();
});