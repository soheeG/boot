$("#button1").click(function() {
	$.ajax("/sub35/link1", {method:"post"});
});

$("#button2").click(function() {
	$.ajax("/sub35/link2", {method:"post"});
});

$("#button3").click(function() {
	$.ajax("/sub35/link3", {
		method:"post", 
		data: "name=손"
		});
});

$("#button4").click(function() {
	$.ajax("/sub35/link4", {
		method:"post",
		data:"address=seoul"	
	});
});