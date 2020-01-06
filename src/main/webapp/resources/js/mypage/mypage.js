$(document).ready(function() {
	
	$changeNameBtn = $('#nameModify');
	
	$changePWBtn = $('#PWModify');
	
	
	// 이름을 수정할 때 보내는 ajax
	$changeNameBtn.on("click", function() {
		
		var changeData = $('#userName').serialize();
		
		$.ajax({
			url : "/everylecture/mypage/changeName",
			data : changeData,
			type : "POST",
			async : true,
			success : function(result) {
				if(result == "1") {
					alert("이름 수정을 완료했습니다.");
					location.reload();
				}
				else {
					
				}
			},
			error : function(result) {
				alert("error");
				
			}
		});
	});
	
	$changePWBtn.on("click", function() {

			var newPW = $("#newUserPW").serialize();
			
			var nowPW = $('#userPWNow').serialize();
			
			$.ajax({
				url : "/everylecture/mypage/checkPassword",
				data : nowPW,
				type : "POST",
				async : true,
				success : function(result) {
					if(result == "1") {
						$.ajax({
							url : "/everylecture/mypage/changePassword",
							data: newPW,
							type : "POST",
							async : true,
							success : function() {
								alert("비밀번호 변경에 성공하였습니다.");
								location.reload();
							},
							error : function() {
								
							}
						});
					}
					else {
						alert("현재 비밀번호가 틀립니다. 다시 입력해주세요.");
						$("#newUserPW").val('');
						$('#userPWNow').val('');
					}
				},
				error : function(result) {
					alert("error");
				}
			});
	});
	
});