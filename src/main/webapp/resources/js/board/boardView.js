$(document).ready(function() {
	
	$revise = $('#revise');
	$delete = $('#delete');
	$boardForm = $('#boardForm');
	$comSubmit = $('#comSubmit');
	
	$delete.on("click", function() {
		
		if(confirm("정말로 삭제하시겠습니까?")) {
			
			var boardID = $('input[name=boardID]').serialize();
			
			$.ajax({
				url : "/everylecture/board/boardDelete",
				data : boardID,
				async : true,
				success : function(result) {
					
					if(result == "1") {
						alert("삭제하였습니다.");
						location.href="/everylecture/board/boardForm";
					}
					else {
						alert("삭제 실패");
					}
					
				},
				error : function(result) {
					alert("ERROR");
				}
			});
		}
	});
	
	// 댓글 달기
	$comSubmit.on("click", function() {
		
		var content = $('textarea[name=commentText]').val();
		
		var data = {
				"comText" : String(content),
				"boardID" : String($('input[name=boardID]').val())
		}
		
		$.ajax({
			url : "/everylecture/comment/writeComment",
			data : data,
			async : true,
			type : 'POST',
			success : function () {
				alert("댓글 작성 완료");
				location.reload();
			},
			error : function() {
				alert("실패");
			}
		});
		
	});
	
	// 댓글창 크기 조절
	$commentWrite = $('#commentWrite');
	$('#commentBox').on("keydown", function() {
		
		$commentWrite.css({"height":(2 + $(this).prop('scrollHeight'))+"px"});
	});
	
	// 댓글 삭제
	$
	
});

function delComment(comID) {
	
	var data = {
			"comID" : String(comID)
	}

	$.ajax({
		url : "/everylecture/comment/deleteComment/",
		data : data,
		type : "POST",
		async : true,
		contentType : "application/x-www-form-urlencoded; charset=UTF-8",
		success : function(result) {
			alert("댓글을 삭제했습니다.");
			location.reload();
		},
		error : function(result) {
			alert("실패");
		}
	});
}


function resize(obj) {
	  obj.style.height = "1px";
	  obj.style.height = (12+obj.scrollHeight)+"px";
	}