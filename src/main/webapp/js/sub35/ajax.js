$("#button1").click(function() {
	$.ajax("/sub35/link1", {method:"post"});
});

$("#button2").click(function() {
	$.ajax("/sub35/link2", {method:"post"});
});

$("#button3").click(function() {
	$.ajax("/sub35/link3", {
		method: "post", 
		data: "name=손"
		});
});

$("#button4").click(function() {
	$.ajax("/sub35/link4", {
		method: "post",
		data: "address=seoul&price=99.99"	
	});
});

$("#button5").click(function() {
	$.ajax("/sub35/link5", {
		method: "post",
		data: "name=park&score=8.5&email=park@naver.com"
	});
});

$("#button6").click(function() {
	$.ajax("/sub35/link6", {
		method: "post",
		data: "address=jeju&product=fruit&price=99.99"
	});
});

$("#button7").click(function() {
	$.ajax("/sub35/link7", {
		method: "post",
		data: '{"name" : "son"}',
		contentType: "application/json"
	});
});