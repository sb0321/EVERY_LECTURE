$(document).ready(function() {
	
	$changeNameBtn = $('#nameModify');
	
	$changePWBtn = $('#PWModify');
	
	$expire = $('#expireUser');
	
	$deleteLec = $('#but2');
	
	
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
	
	// 사용자 탈퇴
	$expire.on("click", function() {
		
		var ok = confirm("정말로 회원 탈퇴를 하시겠습니까? 이 작업은 되돌릴 수 없습니다.");
		
		if(ok == true) {
			
			// 사용자 id 가져옴
			$.ajax({
				url : "/everylecture/mypage/expireUserCheck",
				type : "POST",
				async : true,
				success : function(userID) {
					console.log(userID);
					var data = {
							"userID" : String(userID)
					}
					
					// 사용자 삭제
					$.ajax({					
						url : "/everylecture/mypage/expireUser",
						data: data,
						type : "POST",
						async : true,
						success : function(result) {
							alert("회원탈퇴를 했습니다.");
							location.href="/everylecture/logout";
						},
						error : function(userID) {
							alert("사용자를 지우는 데 실패했습니다.");
						}
					});
				},
				error : function(result) {
					alert("사용자 정보 접근이 불가능합니다.");
				}
			});
		}
		
	});
	
});


// 등록된 게시판 삭제
function deleteLecture(lectureID) {
	
	location.href='/everylecture/mypage/deleteRegisteredLecture/' + String(lectureID);
	
}