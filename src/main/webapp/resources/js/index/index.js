$(document).ready(function() {
	
	$goTest = $('#testBtn');
	
	$top = $(".index_top");
	
	$login = $('#login')
	
	$over = $("#overlay_wrapper");
	$over_sub = $('#index_overlay');
	
});

$(document).ready(function() {
	
	$goTest.mouseup(function() {
		window.location.href="test/test";
	});
});


// index_top 버튼 효과
$(document).ready(function() {
	
	$top.mouseover(function() {
		$(this).animate({
			"padding-left":"20px",
			"padding-right":"20px"
		}).css({"font-weight":"bold"});
	}).mouseleave(function() {
		$(this).animate({
			"padding-left":"0px",
			"padding-right":"0px"
		}).css({"font-weight":"normal"});
	});
});

// 오버레이 관련 함수
$(document).ready(function() {
	
	// 로그인 버튼 클릭 시 오버레이
	$login.on("click", function() {
		$over.css({"display":"flex"})
		.animate({"opacity":"100%"});
		
		$over_sub.css({"display":"flex"})
		.animate({"opacity":"40%"});
	});
	
	// 바깥 누르면 나가짐
	$over_sub.on("click", function() {
		$over.animate({"opacity":"0"}, function() {
			$(this).css({"display":"none"});
		});
		
		$over_sub.animate({"opacity":"0"}, function() {
			$(this).css({"display":"none"});
		})
	});
	
});
