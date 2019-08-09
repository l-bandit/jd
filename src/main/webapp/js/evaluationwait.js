$(document).ready(function(){
	$("#return").click(function(){
		window.location.href="my.html";
	})
	$("#all").click(function(){
		window.location.href="order.html"
	})
	//获取用户uid
	var uid = sessionStorage.uid;
	//查询未评价的商品信息，第一页  2个商品
	var pagesize=2;
	var pagenum=1;
	loadEvaluations();
	function loadEvaluations(){
	$.ajax({
		url:'selectEvaluation/'+uid+"/"+pagenum+"/"+pagesize,
		type:'post',
		data:{},
		dataType:'json',
		success:function(data){
			pagenum++;
			console.log(data)
			if(data.length==0){
				alert("没有更多选手数据")
			}
			else{
			for(var j=0;j<data.length;j++){
				for(var i=0;i<data[j].list.length;i++){
					$("#center").append("<div id='pro'><img src='"+data[j].list[i].imgurl+ "'/><p id='prodes'>"+data[j].list[i].description+"</p><p id='prom'>￥"+data[j].price+"</p></div><div id='bt'><button class='eva' data-id='"+data[j].list[i].id+"'>评价</button></div>");
				}
			}
			}
		}
	})
	}
	$("#more").click(function(){
		loadEvaluations();
	})
	var cid=0;
	$(document).on("click",".eva",function(){
		cid = $(this).attr("data-id");
		location.href="eva.html?cid="+cid;
	})
})
