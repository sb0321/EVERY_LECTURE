$(document).ready(function() {
	
	$goTest = $('#testBtn');
	
	$table = $("#showTable");
	$right = $("#head_right")
	
	
	$goTest.mouseup(function() {
		window.location.href="test/test";
	});
	
	$right.animate({
		"opacity":"100%"
	});
});