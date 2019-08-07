$(document).ready(function(){
	
	//获取用户uid
	var uid = sessionStorage.uid;
	//获取三级商品cid
	var cid = location.href.substr(location.href.indexOf('=')+1);
	
	//初始化：根据传入的三级商品cid，查询三级商品表信息、用户表信息、颜色表信息、型号表信息
	$.ajax({
		url: 'selectCommodityByCid/' + cid,
		type: 'post',
		data: {},
		dataType: 'json',
		success: function(data) {
			console.log(data);
			for(var i=0;i<data.length;i++){
				var cdata = "<div class='commodity' data-id='"+data[i].id+"'>" +
								"<div class='commodity_left'>" + "<img src='"+data[i].imgurl+"' />" + "</div>" + 
								"<div class='commodity_right'>" + 
									"<div class='commodity_name'>"+data[i].name+"</div>" +
									"<div class='commodity_price'>"+"&yen;"+"<span>"+data[i].price+"</span>"+".00"+"</div>" +
									"<div class='commodity_comment'>"+"<span>"+data[i].commentcount+"</span>"+"万+条评价&nbsp;&nbsp;&nbsp;&nbsp;销量"+"<span>"+data[i].salesvolume+"</span>"+"万+"+"</div>" +
									"<div class='commodity_shop'>"+"<span>"+data[i].shop.shopname+"</span>"+"</div>" +
								"</div>" +
							"</div>";
			$("#mid").append(cdata);
			}
		}
	});	
	
	//购物车购买动画效果
	$("#mid_purchase").click(function(){
		$("#slide").slideToggle("slow");
		$("#mid").css("filter","brightness(0.6)");
	})	
	$("#bottom_right").click(function(){
		$("#slide").slideToggle("slow");
		$("#mid").css("filter","brightness(0.6)");
	})
	$("#slide_close").click(function(){
		$("#slide").slideToggle("slow");
		$("#mid").css("filter","none");
	})
	
	//上方返回功能
	$("#top_return").click(function(){
		history.back();
	})	
	
})
