$(document).ready(function() {
	$lecture_url = $('#lectureBtn');
	$user_url = $('#profileBtn');
	
	$lecture_url.on("click", function() {
		changePart("/everylecture/mypage/mypageLecture");
	});
	
	$user_url.on("click", function() {
		changePart("/everylecture/mypage/mypageUser");
		
	});
	
});



function changePart(url){
	
    $.ajax({
        type : "POST",
        url : url,
        contentType:"application/x-www-form-urlencoded; charset=UTF-8",
        error : function() {
            alert('통신실패!!');
        },
        success : function(data) {
        	 $("#right_section").html(data);
        }
 
    });
}