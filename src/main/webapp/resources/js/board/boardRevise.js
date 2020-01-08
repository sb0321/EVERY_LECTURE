$(document).ready(function() {
	
	$submit = $('#submit');
	
	$goBoard = $('#goBoard');
	
	
	// 게시판 페이지로 이동
	$goBoard.on("click", function() {
		location.href="/everylecture/board/boardForm";
	});
	
	$submit.on("click", function() {
		
		var data = {
				"boardID" : String($('input[name=boardID]').val()),
				"boardName" : String($('input[name=bTitle]').val()),
				"boardText" : String($('textarea[name=bContent]').val())
		};
		
		$.ajax({
			url : "/everylecture/board/boardUpadte",
			data : data,
			type : "POST",
			async : true,
			success : function(result) {
				
				if(result == "1") {
					alert("수정하였습니다.");
					location.href="/everylecture/board/boardView/" + $('input[name=boardID]').val();
				}
			},
			error : function(result) {
				alert("ERROR");
			}
		});
		
	});
});