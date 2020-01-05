window.onload = function() {
	
	var object = document.getElementById("countDown");
	
	var before = new Date().getSeconds();
	
	countDown(before, object);
};
function countDown(before, object) {
	
	
	var now = new Date().getSeconds();
	
	var count = now - before;
	
	if(count >= 5)
		window.location.href="/everylecture/";
	else {
		object.innerHTML = count;
		window.setTimeout(function() {
			countDown(before, object);
		});
	}
}