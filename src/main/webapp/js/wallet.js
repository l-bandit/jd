$(document).ready(function() {
	// 获取用户uid
	var uid = sessionStorage.uid;
	$.ajax({
		url : 'selectUserById/' + uid,
		type : 'post',
		data : {},
		dataType : 'json',
		success : function(data) {
			$("#bla").append(data.balance);
			$("#wechat").click(function() {
				$("#wechat").append("<input class='eva' data-id='" + 0 + "'>")
			})
		}
	})

	// 下方导航栏页面跳转功能
	$("#home").click(function() {
		location.href = "home.html";
	})
	$("#sort").click(function() {
		location.href = "sort.html";
	})
	$("#community").click(function() {
		location.href = "community.html";
	})
	$("#shoppingcart").click(function() {
		location.href = "shoppingcart.html";
	})
	$("#my").click(function() {
		location.href = "my.html";
	})

	$(document).on("click", ".eva", function() {
		cid = $(this).attr("data-id");
		alert(cid)
		location.href = "eva.html?cid=" + cid;
	})
})