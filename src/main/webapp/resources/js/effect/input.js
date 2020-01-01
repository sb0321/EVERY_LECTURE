$(document).ready(function() {
	
	$input = $('.eInput');
});


$(document).ready(function() {

	
	$input.on("click", function() {
		
		$(this).css({"border-color":"green", "border-style":"solid"})
		.animate({"border":"3px"});
	});
});

