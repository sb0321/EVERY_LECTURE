$(document).ready(function() {
	
	$submit = $('#submit');
	
	$goBoard = $('#goBoard');
	
	
	// 게시판 페이지로 이동
	$goBoard.on("click", function() {
		location.href="/everylecture/board/boardForm";
	});
	
	$submit.on("click", function() {
		
		var data = {
				"boardName" : String($('input[name=bTitle]').val()),
				"boardText" : String($('textarea[name=bContent]').val())
		};
		
		$.ajax({
			url : "/everylecture/board/writeContent/",
			data : data,
			type : "POST",
			async : true,
			success : function(result) {
				location.href="/everylecture/board/boardForm";
			},
			error : function(result) {
//				alert(result);
			}
		});
		
	});
});