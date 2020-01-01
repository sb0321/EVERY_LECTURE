$(document).ready(function() {
	
	$btn = $('.eBtn');
	
//	$btn.css({"height": "20px", "width":"50px"});
});
$(document).ready(function() {
	
	$btn.mousedown(function(e) {
		
		btnEffect($(this), e);
	});
	
});

function btnEffect(page, e) {
	
	var child = document.createElement("div");
	page.append(child);
	
	var position = page.offset();
//	alert(position.top + " " + position.left);
	
	//생성될 요소의 위치를 마우스 포인터 위치로 설정
	var distance = Math.max(this.clientWidth, this.clientHeight);
	var top = position.top;
	var left = position.left;
	
	child.style.left = (e.pageX - left) + "px";
	child.style.top = (e.pageY - top) + "px";
	
	
	//자식 div의 크기를 정함
	child.style.height = 0 + "px";
	child.style.width = 0 + "px";
	
	// 자식 요소의 스타일을 적용
	child.style.borderRadius = "50%";
	child.style.opacity = "30%";
	
	
	// 원의 크기 선별
	var width = page.width();
	var height = page.height();
	var bigger = (width + height) * 2;
	
	$child = $btn.children();
	$child.animate({ 
					"height": bigger,
					"width": bigger,
					"top": (e.pageY - top) - bigger / 2,
					"left":(e.pageX - left) - bigger / 2}, 300)
					.mouseup(function() {
						$(this).animate({"opacity":"0"}, function() {
							$(this).remove();
						});
					}).mouseleave(function() {
						$(this).animate({"opacity":"0"}, function() {
							$(this).remove();
						});
					});
}