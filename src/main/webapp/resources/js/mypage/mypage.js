$(document).ready(function() {
	
	$changeNameBtn = $('#nameModify');
	
	
	// 이름을 수정할 때 보내는 ajax
	$changeNameBtn.on("click", function() {
		
		var changeData = $('#userName').serialize();
		
		$.ajax({
			url : "/everylecture/mypage/changeName",
			data : changeData,
			type : "POST",
			async : true,
			success : function(result) {
				if(result == "1")
					location.href="/everylecture/login/login";
			},
			error : function(result) {
				alert("error");
				
			}
		});
	});
	
});