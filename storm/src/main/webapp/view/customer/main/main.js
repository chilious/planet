/**
 * 监听所有
 */
function listenAll(){
	/**
	 * submenu鼠标悬停事件
	 */
	$('.nav').mouseover(function(){
		$(this).find('a').eq(0).addClass('chosen_nav');
	});
	/**
	 * submenu鼠标移出事件
	 */
	$('.nav').mouseout(function(){
		$(this).find('a').eq(0).removeClass('chosen_nav');
	});
}
/**
 * 开始*****************************************
 */
$(function(){
	listenAll();
});