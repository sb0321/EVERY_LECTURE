$(document).ready(function() {
	$id = $('#id');
	
	$pw = $('#pw');
	$pwc = $('#pwc');
	
	$userName = $('#name');
	
	$checkID = $('#checkID');
	
	$submit = $('#submit');
	
	$OK = false;
	
	// 아이디 중복 체크
	$checkID.on("click", function() {
		
		var data = $id.serialize();
		
		$.ajax({
			url : "/everylecture/join/IDCheck",
			type : "POST",
			data : data,
			async : true,
			success : function(result) {
				if(result == "0") {
					$('#temp').remove();
					$id.before("<div id='temp' style='font-size:1.2em;" +
							"padding-left:100px;text-align:left;" +
							"color:blue;'>사용 가능한 ID 입니다.</div>");
					$OK = true;
				}
				else {					
					$('#temp').remove();
					$id.before("<div id='temp' style='font-size:1.2em;" +
							"padding-left:100px;text-align:left;" +
							"color:red;'>사용 불가능한 ID 입니다.</div>");
					$OK = false;
					
				}
			},
			error : function(result) {
				alert("ERROR");
			}
		});
		
	});
	
	
	// 제출
	$submit.on("click", function() {
		
		if($OK == true && $pw.val() == $pwc.val()) {
			
			// 보낼 데이터 추합
			var data = {
					"userID" : String($id.val()),
					"userPW" : String($pw.val()),
					"userName" : String($userName.val())
			};
			
			
			$.ajax({
				url : "/everylecture/join/userJoin",
				type : "POST",
				data : data,
				async : true,
				success: function(result) {
					if(result == "1") {
						alert("회원 가입을 완료했습니다.");
						location.href="/everylecture/login/login";
					}
					else {
						alert("회원가입에 실패했습니다. 관리자에게 문의하세요.");
					}
					
				},
				error : function(result) {
					alert("ERROR");
				}
			});
		}
		else {
			alert("확인 비밀번호를 잘못 적으셨거나, 아이디 중복체크를 만족하지 못했습니다.");
		}
		
	});
	
});
	