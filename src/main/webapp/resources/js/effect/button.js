$(document).ready(function() {
	
	$btn = $('.eBtn');
	
	btnEffect($btn)
	
});

function btnEffect(btn) {
	
	$b = btn;
	
	$b.mouseenter(function() {
		$(this).css({'border' : '1'});
	}).mouseleave(function() {		
		$(this).css({'border' : '3'});
	});
}