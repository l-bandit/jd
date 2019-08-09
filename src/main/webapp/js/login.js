$(document).ready(function(){

	//登录，并往html5作用域储存用户id
	var uid = 0;
	$(document).on("click","#login_button",function(){
		$.ajax({
			type:"post",
			url:"login",
			data:$("form").serialize(),
			datatype:"json",
			success:function(data){
				uid = data.id;

				if(uid!=undefined){
					alert("登录成功");
					sessionStorage.uid = uid;
					location.href = "home.html";
				}
				else{
					alert("账号或密码错误");
					location.href = "login.html";
				}
			}
		});
	});
	
	
	//点击注册按钮跳转到注册页面
	$(document).on("click","#register_p",function(){
		location.href = "home.html";
	});
	
	
	
	
})