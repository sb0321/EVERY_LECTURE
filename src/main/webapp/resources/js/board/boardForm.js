$(document).ready(function() {
	
	
	$goWrite = $('#goWrite');
	
	
	
	
});

function goPagination(goPage) {
	
	var data = {
			"curPage" : goPage
	}
	
	$.ajax({
		url : "/everylecture/board/pagination",
		type : "POST",
		data : data,
		async : true,
		success : function(result) {
//			alert(result);
			location.reload();
		},
		error : function() {}
	})
	
	
	
}