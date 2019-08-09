$(document).ready(function(){
	//获取用户uid
	var uid = sessionStorage.uid;
	$.ajax({
		url:'selectUserById/'+uid,
	    type:'post',
	    data:{},
	    dataType:'json',
	    success:function(data){
	    	$("#bla").append(data.balance);
	    	$("#wechat").click(function(){
	    		$("#wechat").append("<input class='eva' data-id='"+0+"'>")
	    	})
	    }
	})
	
	$("#index").click(function(){
		window.location.href="index.html";
	})
	$("#my").click(function(){
		window.location.href="my.html";
	})

	
		$(document).on("click",".eva",function(){
		cid = $(this).attr("data-id");
		alert(cid)
		location.href="eva.html?cid="+cid;
	})
})