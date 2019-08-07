$(document).ready(function() {

	// 查询热销商品
	var pagesize = 2;
	var pagenum = 1;
	loadCandidtes();

	function loadCandidtes() {
		$.ajax({
			url: 'selectSales/' + pagenum + "/" + pagesize,
			type: 'post',
			data: {},
			dataType: 'json',
			success: function(data) {
				pagenum++;
				console.log(data);
				if (data.length == 0) {
					alert("没有更多数据");
				} else {
					for (var i = 0; i < data.length; i++) {
						var cdata = "<div class='ranking_div' data-id='" + data[i].id + "'><div class='ranking_img'><img src='" + data[i].imgurl + "'>" +
								"</div><div class='ranking_info'><p>名称:" + data[i].name + "</p><p>价格:" + data[i].price + "￥</p><p>销量:" +
							data[i].salesvolume + "</p></div></div>";
						$("#ranking_zhong").append(cdata);
					}
				}
			}
		});
	}

	// 点击更多查询下一页数据
	$("#ranking_bottom").click(function() {
		loadCandidtes();
	})
	
	// 点击销量商品进入详情
	$(document).on("click", ".ranking_div", function() {
		var salesId = $(this).attr("data-id");
		location.href = "页面.html?salesId=" + salesId;
	});

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


onload = function() {
	var arr = document.getElementsByClassName("slide");
	for (var i = 0; i < arr.length; i++) {
		arr[i].style.left = i * 338 + "px";
	}
}

function LeftMove() {
	var arr = document.getElementsByClassName("slide"); //获取三个子div
	for (var i = 0; i < arr.length; i++) {
		var left = parseFloat(arr[i].style.left);
		left -= 2;
		var width = 338; //图片的宽度
		if (left <= -width) {
			left = (arr.length - 1) * width; //当图片完全走出显示框，拼接到末尾
			clearInterval(moveId);
		}
		arr[i].style.left = left + "px";
	}
}

function divInterval() {
	moveId = setInterval(LeftMove, 8); //设置一个10毫秒定时器
}

timeId = setInterval(divInterval, 3000); //设置一个3秒的定时器。

function stop() {
	clearInterval(timeId);
}

function start() {
	clearInterval(timeId);
	timeId = setInterval(divInterval, 2000);
}

//页面失去焦点停止
onblur = function() {
	stop();
}
//页面获取焦点时开始
onfocus = function() {
	start();
}
