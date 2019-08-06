$(document).ready(function(){
	
	//解析二级商品id
	var sid = location.href.substr(location.href.indexOf('=')+1);
	alert(sid);
	//初始化：根据二级商品id查询三级商品返回list（综合排序）
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
									"<div class='commodity_comment'>"+"<span>"+data[i].commentcount+"</span>"+"条评价"+"</div>" +
									"<div class='commodity_shop'>"+"<span>"+data[i].shopname+"</span>"+"</div>" +
								"</div>" +
							"</div>";
			$("#mid").append(cdata);
			}
		}
	});

})
