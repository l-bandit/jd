$(document).ready(function(){
	
	//解析二级商品id
	var sid = location.href.substr(location.href.indexOf('=')+1);
	
	//初始化：根据二级商品id查询三级商品返回list（综合排序，id排序）	
	var multiple = 0;	
	$.ajax({
		url: 'selectCommodityBySid/' + sid,
		type: 'post',
		data: {},
		dataType: 'json',
		success: function(data) {
			console.log(data);
			for(var i=0;i<data.length;i++){
				var cdata = "<div class='commodity'>" +
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
			multiple=1;
		}
	});	
	//点击综合重新排序（综合排序，id排序）
	$("#order_multiple").click(function(){
		if(multiple==0){
			$(".commodity").remove();
			$.ajax({
				url: 'selectCommodityBySid/' + sid,
				type: 'post',
				data: {},
				dataType: 'json',
				success: function(data) {
					console.log(data);
					for(var i=0;i<data.length;i++){
						var cdata = "<div class='commodity'>" +
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
					multiple=1;
				}
			});
		}else if(multiple==1){
			$(".commodity").remove();
			$.ajax({
				url: 'selectCommodityBySid/' + sid,
				type: 'post',
				data: {},
				dataType: 'json',
				success: function(data) {
					console.log(data);
					for(var i=0;i<data.length;i++){
						var cdata = "<div class='commodity'>" +
										"<div class='commodity_left'>" + "<img src='"+data[i].imgurl+"' />" + "</div>" + 
										"<div class='commodity_right'>" + 
											"<div class='commodity_name'>"+data[i].name+"</div>" +
											"<div class='commodity_price'>"+"&yen;"+"<span>"+data[i].price+"</span>"+".00"+"</div>" +
											"<div class='commodity_comment'>"+"<span>"+data[i].commentcount+"</span>"+"万+条评价&nbsp;&nbsp;&nbsp;&nbsp;销量"+"<span>"+data[i].salesvolume+"</span>"+"万+"+"</div>" +
											"<div class='commodity_shop'>"+"<span>"+data[i].shop.shopname+"</span>"+"</div>" +
										"</div>" +
									"</div>";
					$("#mid").prepend(cdata);
					}
					multiple=0;
				}
			});
		}
	})

	//根据二级商品id查询三级商品返回list（销量排序，salesvolume排序）
	$("#order_sale").click(function(){
		if(multiple==0){
			$(".commodity").remove();
			$.ajax({
				url: 'selectCommodityBySidAndSales/' + sid,
				type: 'post',
				data: {},
				dataType: 'json',
				success: function(data) {
					console.log(data);
					for(var i=0;i<data.length;i++){
						var cdata = "<div class='commodity'>" +
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
					multiple=1;
				}
			});
		}else if(multiple==1){
			$(".commodity").remove();
			$.ajax({
				url: 'selectCommodityBySidAndSales/' + sid,
				type: 'post',
				data: {},
				dataType: 'json',
				success: function(data) {
					console.log(data);
					for(var i=0;i<data.length;i++){
						var cdata = "<div class='commodity'>" +
										"<div class='commodity_left'>" + "<img src='"+data[i].imgurl+"' />" + "</div>" + 
										"<div class='commodity_right'>" + 
											"<div class='commodity_name'>"+data[i].name+"</div>" +
											"<div class='commodity_price'>"+"&yen;"+"<span>"+data[i].price+"</span>"+".00"+"</div>" +
											"<div class='commodity_comment'>"+"<span>"+data[i].commentcount+"</span>"+"万+条评价&nbsp;&nbsp;&nbsp;&nbsp;销量"+"<span>"+data[i].salesvolume+"</span>"+"万+"+"</div>" +
											"<div class='commodity_shop'>"+"<span>"+data[i].shop.shopname+"</span>"+"</div>" +
										"</div>" +
									"</div>";
					$("#mid").prepend(cdata);
					}
					multiple=0;
				}
			});
		}
	})
	
	//根据二级商品id查询三级商品返回list（价格排序，price排序）	
	$("#order_price").click(function(){
		if(multiple==0){
			$(".commodity").remove();
			$.ajax({
				url: 'selectCommodityBySidAndPrice/' + sid,
				type: 'post',
				data: {},
				dataType: 'json',
				success: function(data) {
					console.log(data);
					for(var i=0;i<data.length;i++){
						var cdata = "<div class='commodity'>" +
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
					multiple=1;
				}
			});
		}else if(multiple==1){
			$(".commodity").remove();
			$.ajax({
				url: 'selectCommodityBySidAndPrice/' + sid,
				type: 'post',
				data: {},
				dataType: 'json',
				success: function(data) {
					console.log(data);
					for(var i=0;i<data.length;i++){
						var cdata = "<div class='commodity'>" +
										"<div class='commodity_left'>" + "<img src='"+data[i].imgurl+"' />" + "</div>" + 
										"<div class='commodity_right'>" + 
											"<div class='commodity_name'>"+data[i].name+"</div>" +
											"<div class='commodity_price'>"+"&yen;"+"<span>"+data[i].price+"</span>"+".00"+"</div>" +
											"<div class='commodity_comment'>"+"<span>"+data[i].commentcount+"</span>"+"万+条评价&nbsp;&nbsp;&nbsp;&nbsp;销量"+"<span>"+data[i].salesvolume+"</span>"+"万+"+"</div>" +
											"<div class='commodity_shop'>"+"<span>"+data[i].shop.shopname+"</span>"+"</div>" +
										"</div>" +
									"</div>";
					$("#mid").prepend(cdata);
					}
					multiple=0;
				}
			});
		}
	})
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
})
