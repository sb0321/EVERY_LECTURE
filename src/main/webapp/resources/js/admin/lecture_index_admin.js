$(document).ready(function() {
	
	$delete = $('.eBtn');
	
	$delete.on("click", function() {
		
		var lectureID = $(this).val();
		
		var data = {
				"lectureID" : lectureID
		}
		
		$.ajax({
			url : "/everylecture/admin/deleteLecture",
			type : "POST",
			data : data,
			success : function(result) {
				alert("강의를 삭제했습니다.");
				location.reload();
			},
			error : function(result) {alert("실패")}
			
		});
		
		
	});
	
});