$(document).ready(function(){
	$("#return").click(function(){
		window.location.href="my.html";
	})
	//获取用户uid
	var uid = sessionStorage.uid;
	$.ajax({
		url:'selectUserById/'+uid,
		Type:'post',
		data:{},
		dataType:'json',
		success:function(data){
			$("#name").val(data.name);
			$("#pass").val(data.password);
			$("#add").val(data.address);
			$("#pho").val(data.phone);
			var username=data.name;
			$("#username").html(data.name);
		}
		
	})
	
	
	
	$("#subbt").click(function(){
		$.ajax({
			url:'changeUserById/'+id,
			type:'post',
			data:$("form").serialize(),
			dataType:'json',
			success:function(data){
				alert("更改成功！");
			}
		})
	})
})
