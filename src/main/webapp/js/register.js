$(document).ready(function(){
	
	$(document).on("click","#top_back",function(){
		history.go(-1);
	});
	
	$(document).on("focus",".input_type",function(){

		if($(this).val()=="商家"){
			$("#input_data").append("<div><input type='text' id='shop_name' class='input_text' name='shopname' placeholder='请输入店铺名称' required='required' /></div>");
		}
		else{
			$("#shop_name").remove();
		}
	});
	
	
	
	
	
	
	//提交表单（注册）
	$(document).on("click","#butt",function(){
		
		var key = 0;
		
		//校验功能（查看用户名是否已注册）
		$.ajax({
			type:"post",
			url:"check",
			data:$("form").serialize(),
			dataType:"json",
			success:function(data){
				if("重复"==data.flag){
					key = 2;//重复
				}
				else{
					key = 1;//正确
				}
				
				
				if(key==1){
					//提交表单（注册）
					$.ajax({
						type:"post",
						url:"register",
						data:$("form").serialize(),
						dataType:"json",
						success:function(data){
							alert("注册成功");
							location.href = "login.html";
							
						}
					});
				}
				else if(key==2){
					alert("该用户名以被注册");
				}
				
				
				
			}
		});
		
		
		
		
		
	});
	
	
})
