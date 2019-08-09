$(document).ready(function() {

	// 查询一级分类
	$.ajax({
		url: 'selectPrimaryclassification1',
		type: 'post',
		data: {},
		dataType: 'json',
		success: function(data) {
			console.log(data);
			for (var i = 0; i < data.length; i++) {
				var cdata = "<div class='firstSort' data-id='" + data[i].id + "'>" + data[i].firstname + "</div>";
				$("#left_div").append(cdata);
			}
		}
	});

	// 点击一级分类查询二级分类
	$(document).on("click", ".firstSort", function() {
		$(".firstSort").css("background-color", "#F2F2F2");
		$(this).css("background-color", "white");
		$(".secondarySort").remove();
		var sort1id = $(this).attr("data-id");
		$.ajax({
			url: 'selectSecondaryClassification/' + sort1id,
			type: 'post',
			data: {},
			dataType: 'json',
			success: function(data) {
				console.log(data);
				for (var i = 0; i < data.length; i++) {					
					var cdata = "<div class='secondarySort' data-sid='" + data[i].id +
						"'><div class='img_div'><img class='sortImg' src='" + data[i].imgurl +
						"'></div><div class='name_div'><span class='sortName'>" + data[i].secondaryname + "</span></div></div>";
					$("#right_div").append(cdata);
				}
			}
		});
	});

	// 点击二级分类进入商品列表
	$(document).on("click", ".secondarySort", function() {
		var sort2id = $(this).attr("data-sid");
		location.href = "commodity.html?sort2id=" + sort2id;
	});
	
	//下方导航栏页面跳转功能
	$("#home").click(function(){
		location.href="home.html";
	})
	$("#sort").click(function(){
		location.href="sort.html";
	})
	$("#community").click(function(){
		location.href="community.html";
	})
	$("#shoppingcart").click(function(){
		location.href="shoppingcart.html";
	})
	$("#my").click(function(){
		location.href="my.html";
	})


})
