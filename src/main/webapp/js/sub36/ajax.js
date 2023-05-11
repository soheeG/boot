$("#btn1").click(function() {
	const obj = {
		name: "정대만",
		age: 40
	}
	
	$.ajax("/sub36/link1", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	});
});

$("#btn2").click(function() {
	const obj = {
		name: "채치수",
		email: "333@adjf.com",
		score: 9.8,
		married: false
	}
		
	$.ajax("/sub36/link2", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	});
});

$("#btn3").click(function() {
	const data = {
		name: "태웅",
		hobbyy: [
			"독서",
			"농구",
			"음악감상"
		]
	};
	
	$.ajax("/sub36/link3", {
		method: "post",
		contentType: "application/json",
		data: JSON.spstringify(data)
	});
});

$("#btn4").click(function() {
	const data = {
		phone: [
		"samsung",
		"apple",
		"LG"
		]
	};
	
	$.ajax("/sub36/link4", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
});

$("#btn5").click(function() {
	const data = {
		title : "java",
		publisher : "한빛",
		writer: {
			name: "정대만",
			age: 44
		}
	};
	
	$.ajax("/sub36/link5", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
});

$("#btn6").click(function() {
	const data = {
		city: "Incheon",
		price: 4000,
		etc: {
			name: "문동은",
			email: "Yeonjin@google.com",
			score: 100.00,
			married: false
		}
	};
	
	$.ajax("/sub36/link6", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
});

$("#btn7").click(function() {
	const data =[
		{
			name: "이강인",
			age: 22
		},
		{	name: "김민재",
			age: 28
		},
		{
			name: "황희찬",
			age: 27
		}
		]
	
	$.ajax("/sub36/link7", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
});

$("#btn8").click(function() {
	const name = $("#inputName").val();
	const age = $("#inputAge").val();
	
	const data = {
		name: name,
		age: age
	};
	
	$.ajax("/sub36/link1", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
});

$("#btn9").click(function() {
	const name = $("#inputName2").val();
	const email = $("#inputEmail").val();
	const score = $("#inputScore").val();
	const married = $("#inputMarried").val();
	
	const data = {
		name: name,
		email: email,
		score: score,
		married: married
	};
	
	$.ajax("/sub36/link2", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
});
