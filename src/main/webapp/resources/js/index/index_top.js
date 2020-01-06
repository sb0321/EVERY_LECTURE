$(document).ready(function() {
	
	// 변수 선언
	$login = $('#login')
	
	$over = $("#overlay_wrapper");
	$over_sub = $('#index_overlay');
	
	$top = $(".index_top");
	
	$userID = $('#userID');
	$userPW = $('#userPW');
	
	$submit = $('#loginSubmit');
	$loginForm = $('#loginForm');
	
	$navi = $('#navi');
	
	
	
	// 로그인 버튼 클릭 시 오버레이
	$login.on("click", function() {
		
//		var nowPosition = ($(window).height()) / 2 - $over.outerHeight() + $(window).scrollTop();
		var nowPosition = window.innerHeight / 2;
		
		$over.css({
			"display":"flex",
			"top": (nowPosition - 200) + "px"
		})
		.animate({
			"opacity":"95%",
			"top": nowPosition + "px"
		});
		
		$over_sub.css({"display":"flex"})
		.animate({"opacity":"40%"});
		
	});
	
	// 바깥 누르면 나가짐
	$over_sub.on("click", function() {
		
		// 현재 위치
//		var nowPosition = ($(window).height()) / 2 - $over.outerHeight() + $(window).scrollTop();
		var nowPosition = 300;
		
		$over.animate({
			"opacity":"0",
			"top":(nowPosition - 100) + "px"
		}, function() {
			$(this).css({"display":"none"});
		});
		
		$over_sub.animate({"opacity":"0"}, function() {
			$(this).css({"display":"none"});
		})
	});
	// 입력 창 누르면 변화
	$userID.focus(function() {
		$(this).animate({
			"background-color":"#ad65e5"
		});
	})
	.blur(function() {
		$(this).animate({
			"background-color":"#300b4c"
		});
	});
	
	$userPW.focus(function() {
		$(this).animate({
			"background-color":"#ad65e5"
		});
	})
	.blur(function() {
		$(this).animate({
			"background-color":"#300b4c"
		});
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
	
	
	// 네비게이션 스크롤 할 경우 fixed 시키도록 함
	var on = false;
	$(window).scroll(function() {
		
		var scrollNow = $(window).scrollTop();
		
//		alert(scrollNow);
		
		if(scrollNow >= 100 && on == false) {
			$navi.css({
				"position":"fixed",
				"top":"-100px",
				"opacity":"0",
			})
			.animate({
				"top":"0",
				"opacity":"100%"
			});
			on = true;
		}
		
		if(scrollNow <= 0 && on ==true) {
			$navi.animate({
				"top":"-100px",
				"opacity":"100"
			})
			.css({
				"position":"inherit",
				"top":"0"
			});
			on = false;
		}
			
	});
	

});


