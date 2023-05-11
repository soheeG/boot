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
	const obj = {name: "son"};
	
	$.ajax("/sub35/link7", {
		method: "post",
		// data: '{"name" : "son"}',
		data: JSON.stringify(obj),
		contentType: "application/json"
	});
});

$("#button8").click(function() {
	const data = {
			address: "busan",
			name: "박지성"
			};
			
	$.ajax("/sub35/link8", {
		method: "post",
		// data: '{"address" : "busan", "name" : "박지성"}',
		data: JSON.stringify(data),
		contentType : "application/json"
	});
});

$("#button9").click(function() {
	const data = {
		age: 40,
		name: "차범근",
		married: true
	};
	
	$.ajax("/sub35/link9", {
		method: "post",
		contentType: "application/json",
		// data: `{"age" : "32", "name" : "son", "marreid" : "false"}`
		data: JSON.stringify(data)
	});
});

$("#button10").click(function() {
	const obj = {
		address: null,
		age: 30,
		name: "손흥민"
	}
	
	$.ajax("/sub35/link10", {
	method: "post",
	contentType: "application/json",
	// data : `{"address" : null, "age" : 30, "name" : "손흥민"}`
	data: JSON.stringify(obj)
	});
});

$("#button11").click(function() {
	const data = {
		book: {
			title: "java",
			price: 30000
		},
		address: "seoul"
	}
	
	$.ajax("/sub35/link11", {
		method: "post",
		contentType: "application/json",
		// data: '{"book" : {"title" : "java", "price" : 30000}, "address" : "seoul"}'
		data: JSON.stringify(obj)
	});
});

$("#button12").click(function() {
	const data = {
		food : [
			"pizza", "coke", "coffee"
		],
		store: "피자스쿨"
	}
	
	$.ajax("/sub35/link12", {
		method: "post",
		contentType: "applicatin/json",
		// data: `{"food" : ["pizza", "coke", "coffee"], "store" : "피자스쿨"}`
		data: JSON.stringify(data)
	});
});

$("#button13").click(function() {
	const obj = ["pizza", "coke", "coffee"]
	
	$.ajax("/sub35/link", {
		method: "post",
		contentType: "applicatiin/json",
		// data: `["pizza", "coke", "coffe"]`
		data: JSON.stringify(obj)
	});
});

$("#button14").click(function() {
	const data = [
		{
			name: "강백호",
			position: "파워포워드"
		},
		{
			name: "서태웅",
			position: "스몰포워드"
		},
		{
			name: "송태섭",
			position: "포인트가드"
		}
	]
	
	$.ajax("/sub35/link", {
		method: "post",
		contentType: "applicatiin/json",
		// data: `[{"name" : "강백호", "position" : "파포"}, {"name" : "서태웅", "position" : "스포}]`
		data: JSON.stringify(data)
	});
});