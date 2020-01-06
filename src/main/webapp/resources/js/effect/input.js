$(document).ready(function() {
	
	$input = $('.eInput');
});


$(document).ready(function() {

	
	$input.on("click", function() {
		
		$(this).css({"border-color":"green", "border-style":"solid"})
		.animate({"border":"3px"});
	});
	
	
	// 입력 창 누르면 변화
	$input.focus(function() {
		$(this).animate({
			"background-color":"#ad65e5"
		});
	})
	.blur(function() {
		$(this).animate({
			"background-color":"#300b4c"
		});
	});
	
	$input.focus(function() {
		$(this).animate({
			"background-color":"#ad65e5"
		});
	})
	.blur(function() {
		$(this).animate({
			"background-color":"#300b4c"
		});
	});
	
});

