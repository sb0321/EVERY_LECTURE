$(document).ready(function() {
	
	$goTest = $('#testBtn');
	
	$top = $(".index_top");
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
