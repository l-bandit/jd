$(document).ready(function(){
	
	$(document).on("focus",".input_type",function(){

		if($(this).val()=="商家"){
			$("#input_data").append("<div><input type='text' id='shop_name' class='input_text' placeholder='请输入店铺名称' required='required' /></div>");
		}
		else{
			$("#shop_name").remove();
		}
	})
	
	
})
