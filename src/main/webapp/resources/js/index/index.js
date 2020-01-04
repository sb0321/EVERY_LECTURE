$(document).ready(function() {
	
	$goTest = $('#testBtn');
	
	$table = $("#showTable");
	$right = $("#head_right")
	
	
	$goTest.mouseup(function() {
		window.location.href="test/test";
	});
	
	$table.delay(100, function() {
		showTable($(this));
	});
	
	$right.animate({
		"opacity":"100%"
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
		"opacity":"0%"
	})
	.animate({
		"opacity":"100%"
		
	}, 2000);
	
	
	
}