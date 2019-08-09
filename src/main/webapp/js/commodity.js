$(document).ready(function(){
	
	//解析二级商品id
	var sid = location.href.substr(location.href.indexOf('=')+1);
	
	//初始化：根据二级商品id查询三级商品返回list（综合排序，id排序）
	var multiple = 0;
	var sale = 0;
	var price = 0;
	$.ajax({
		url: 'selectCommodityBySid/' + sid,
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
									"<div class='commodity_shop'><span>"+data[i].shop.shopname+"</span>"+"</div>" +
								"</div>" +
							"</div>";
			$("#mid").append(cdata);
			}
			multiple=1;
		}
	});	
	//点击综合重新排序（综合排序，id排序）
	$("#order_multiple").click(function(){
		sale = 0;
		price = 0;
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
						var cdata = "<div class='commodity' data-id='"+data[i].id+"'>" +
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
		multiple = 0;
		price = 0;
		if(sale==0){
			$(".commodity").remove();
			$.ajax({
				url: 'selectCommodityBySidAndSales/' + sid,
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
					sale=1;
				}
			});
		}else if(sale==1){
			$(".commodity").remove();
			$.ajax({
				url: 'selectCommodityBySidAndSales/' + sid,
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
					$("#mid").prepend(cdata);
					}
					sale=0;
				}
			});
		}
	})
	
	//根据二级商品id查询三级商品返回list（价格排序，price排序）		
	$("#order_price").click(function(){
		multiple = 0;
		sale = 0;
		if(price==0){
			$(".commodity").remove();
			$.ajax({
				url: 'selectCommodityBySidAndPrice/' + sid,
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
					price=1;
				}
			});
		}else if(price==1){
			$(".commodity").remove();
			$.ajax({
				url: 'selectCommodityBySidAndPrice/' + sid,
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
					$("#mid").prepend(cdata);
					}
					price=0;
				}
			});
		}
	})
	
	//上方查询功能，根据商品名称模糊查询
	$("#search_btn").click(function(){
		var search = $("#search").val();		
		if(search==""){
			alert("请输入您要查询的条件");
		}else{
			$.ajax({
				url:'selectCommodityByName/'+search,
				type:'post',
				data:{},
				dataType:'json',
				success:function(data){
					console.log(data);
					$("#mid").empty();
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
		}
		
	})
	
	//追加出的商品元素，点击div进入商品信息界面，传入三级商品cid
	$(document).on("click",".commodity",function(){
		var cid = $(this).attr("data-id");
		location.href="product.html?cid="+cid;
	})
	
	//上方返回功能
	$("#top_return").click(function(){
		history.back();
	})
	//下方导航栏页面跳转功能
	$("#home").click(function(){
		location.href="home.html";
	})
	$("#sort").click(function(){
		location.href="sort.html";
	})
	$("#home").click(function(){
		location.href="home.html";
	})
	$("#home").click(function(){
		location.href="home.html";
	})
	$("#home").click(function(){
		location.href="home.html";
	})	
	
})
