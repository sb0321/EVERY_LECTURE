$(document).ready(function() {
	
	// 변수 선언
	$login = $('#login')
	
	$over = $("#overlay_wrapper");
	$over_sub = $('#index_overlay');
	
	$top = $(".index_top");
	
	$table = $("#showTable");
	
	
	
	// 로그인 버튼 클릭 시 오버레이
	$login.on("click", function() {
		$over.css({"display":"flex"})
		.animate({"opacity":"100%", "top":"50%"});
		
		$over_sub.css({"display":"flex"})
		.animate({"opacity":"40%"});
	});
	
	// 바깥 누르면 나가짐
	$over_sub.on("click", function() {
		$over.animate({"opacity":"0", "top":"25%"}, function() {
			$(this).css({"display":"none"});
		});
		
		$over_sub.animate({"opacity":"0"}, function() {
			$(this).css({"display":"none"});
		})
	});
	
	$top.mouseover(function() {
		$(this).animate({
			"padding-left":"20px",
			"padding-right":"20px"
		}, 200).css({"font-weight":"bold"});
	})
	
	$top.mouseleave(function() {
		$(this).animate({
			"padding-left":"0px",
			"padding-right":"0px"
		}, 200).css({"font-weight":"normal"});
	});
	
	$table.delay(100, function() {
		showTable($(this));
	});
});


function showTable(table) {
	
	var child1 = document.createElement("div");
	var background = document.createElement("div");
	table.append(child1);
	table.before(background);
	
	$child = table.children();
	
	var radius = ($(window).width() + $(window).height()) / 1000;
	
	$child.css({
		"height":"0px",
		"width":"0px",
		"margin":"auto",
		"vertical-align":"middle",
		"border-left":"50px solid",
		"border-top":"30px solid transparent",
		"border-bottom":"30px solid transparent",

	});
	background.style.backgroundColor = "white";
	
	
	
}