$(document).ready(function() {
	
	$lectureName = $('#lectureName');
	
	$lectureExplain = $('#lectureExplain');
	
	$lectureImg = $('#lectureImg');
	
	$submit = $('#submit');
	
	
	$submit.on("click", function() {
		
		// form 이벤트 막아줌
		event.preventDefault();
		
		var form = $('#lectureUploadForm')[0];
		
		var data = new FormData(form);
		
		console.log(form);
		
		var check = $lectureImg.val().split('.').pop().toLowerCase();
		if($.inArray(check, ['gif','jpg','jpeg','png']) == -1) {
			alert("이미지 파일의 확장자는 gif, jpg, jpeg, png만 가능합니다.");
		}
		else {
			$.ajax({
				url : "/everylecture/admin/uploadLecutureInfo",
				enctype : "multipart/form-data",
				type : "POST",
				data : data,
	            processData: false,
	            contentType: false,
				async : true,
				success : function(result) {
					alert("강의 등록에 성공했습니다.");
					location.href="/everylecture/admin/goDeleteLecture"
				},
				error : function() {
					alert("실패");
				}
			});
			
		}
		
		
	});
	
});