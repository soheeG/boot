$("#button1").click(function() {
	$.ajax("sub34/link1");
});

$("button2").click(function() {
	$.ajax("/sub34/link2");
});

$(button3).click(function() {
	$.ajax("/sub34/link3?name=son");
});

$(button4).click(function() {
	$.ajax("/sub34/link4?address=london");
});

$(button5).click(function() {
	$.ajax("/sub34/link5?name=손&age=22");
});
$(button6).click(function() {
	$ajax("/sub34/link6?food=pizza&price=10.99");
});

$(button7).click(function() {
	$.ajax("/sub34/link7?address=seoul&name=park&age=33");
});

$(button8).click(function() {
	$.ajax("/sub34/link8?price=99.99&product=Ipad&category=tablet")
})