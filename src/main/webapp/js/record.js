$(document).ready(function(){
	$("#return").click(function(){
		window.location.href="my.html";
	})
	//获取用户uid
	var uid = sessionStorage.uid;
	var pagesize=3;
	var pagenum=1;
	loadRecords();
	function loadRecords(){
	$.ajax({
		url:'selectRecord/'+uid+"/"+pagenum+"/"+pagesize,
		type:'post',
		data:{},
		dataType:'json',
		success:function(data){
			pagenum++;
			if(data.length==0){
				alert("没有更多浏览记录")
			}
			else{
			for(var j=0;j<data.length;j++){
				for(var i=0;i<data[j].commodity.length;i++){
					var cdata = "<div class='commodity' data-id='"+data[j].commodity[i].id+"'>" +
					"<div class='commodity_left'>" + "<img src='"+data[j].commodity[i].imgurl+"' />" + "</div>" + 
					"<div class='commodity_right'>" + 
						"<div class='commodity_name'>"+data[j].commodity[i].name+"</div>" +
						"<div class='commodity_price'>"+"&yen;"+"<span>"+data[j].commodity[i].price+"</span>"+".00"+"</div>"  +
					"</div>" +"</div>";
                 $("#center").append(cdata);	}
			}
			}
		}
	})
	}
	$("#more").click(function(){
		loadRecords();
	})
})
