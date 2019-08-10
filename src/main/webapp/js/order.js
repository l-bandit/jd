$(document).ready(function(){
	$("#return").click(function(){
		window.location.href="my.html";
	})
	//获取用户uid
	var uid = sessionStorage.uid;
	
	var pagesize=3;
	var pagenum=1;
	loadOrders();
	function loadOrders(){
	$.ajax({
		url:'selectOrders/'+uid+"/"+pagenum+"/"+pagesize,
		type:'post',
		data:{},
		dataType:'json',
		success:function(data){
			pagenum++;
			console.log(data)
			if(data.length==0){
				alert("没有更多订单信息")
			}
			else{
			for(var j=0;j<data.length;j++){
				for(var i=0;i<data[j].list.length;i++){
					$("#center").append("<div id='pro'><img src='"+data[j].list[i].imgurl+ "'/><p id='pro_1'>"+data[j].list[i].description+"</p><p id='pro_m'>￥"+data[j].price+"</p></div>");
				}
			}
			}
		}
	})
	}
	$("#more").click(function(){
		loadOrders();
	})
})