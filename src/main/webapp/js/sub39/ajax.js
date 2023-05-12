$("#btn1").click(function() {
	$.ajax("/sb39/link1", {
		success: function() {
			console.log("성공");
		},
		error: function() {
			console.log("실패");
		},
		complete: function() {
			console.log("성공이든 실패든")
		}
	});
});

$("#btn2").click(function() {
	$.ajax("/sb39/link2", {
		success: function() {
			console.log("성공");
		},
		error: function() {
			console.log("실패");
		},
		complete: function() {
			console.log("성공이든 실패든")
		}
	});
});

$("#btn3").click(function() {
	// 성공 응답을 받아서 콘솔에 성공 출력
	$.ajax("/sub39/link3", {
		success: function() {
			console.log("성공");
		}
	});
});

$("#btn4").click(function() {
	// 실패(500) 응답을 받아서 콘솔에 실패 출력
	$.ajax("/sub39/link4", {
		error: function() {
			console.log("실패")
		}
	});
});

$("#btn5").click(function() {
	$.ajax("/sub39/link1")
	.done(function() {
		console.log("done 메소드 사용, 성공")
	})
	.fail(function() {
		console.log("fail 메소드 사용, 실패")
	})
	.always(function() {
		console.log("always 메소드 사용")
	});
});

$("#btn6").click(function() {
	$.ajax("/sub39/link2")
	.done(function() {
		console.log("done 메소드 사용, 성공")
	})
	.fail(function() {
		console.log("fail 메소드 사용, 실패")
	})
	.always(function() {
		console.log("always 메소드 사용")
	});
});

$("#btn7").click(function() {
	$.ajax("/sub39/link3")
	.done(function() {
		console.log("성공")
	})
});

$("#btn8").click(function() {
	$.ajax("/sub39/link4")
	.fail(function() {
		console.log("실패")
	});
});

$("#btn9").click(function() {
	$.ajax("/sub39/link9", {
		success: function(data) {
			console.log("링크9 성공");
			console.log(data);
			$("#res9").text(data);
		}
	});
});

$("#btn10").click(function() {
	// 응답 본문(현재시간)이 콘솔에 출력
	$.ajax("/sub39/link10", {
		success: function(data) {
			// console.log(data);
			$("#res10").text(data);
		}
	});
});

$("#btn11").click(function() {
	// 응답 본문(현재시간)이 콘솔에 출력
	$.ajax("/sub39/link11", {
		success: function(data) {
			$("#res11").text(data);
		}
	});
});

$("#btn12").click(function() {
	$.ajax("/sub39/link12", {
		//content-type : application/json
		//body : {"address", "gangnam", "city", "seoul", "phone", "iphone"}
		success: function(data) {
			console.log(data.address);
			console.log(data.city);
			console.log(data.phone);
		}
	});
});

$("#btn13").click(function() {
	$.ajax("/sub39/link13", {
		success: function() {
			for (let i = 0; i < data.length; i++) {
				console.log(i);
			}
		}
	});
});

$("#btn14").click(function() {
	const cid = $("#categoryIdInput").val();
	$.ajax("/sub39/link14?cid=" + cid, {
		success: function(data) {
			$("#res14").empty();
			for (let i = 0; i < data.length; i++) {
				$("res14").append(data[i].productName + "<br>");
			}
		}
	});
});

$("#btn15").click(function() {
	const cid = $("#categoryIdInput").val();
	$.ajax("/sub39/link14?cid=" + cid, {
		success: function(data) {
			$("#res15").empty();
			$("#res15").appemd(`
				<table class="table">
					<thead>
						<tr>
							<th>
							<th>
								상품명
							</th>
							<th>
								가격
							</th>
						</tr>
					</thead>
				</table>
			`);
			$("#res15 >.table").append("<tbody />");
			for (let i = 0; i < data.length; i++) {
				$("#res15 tbody")
				.append(`
					<tr>
						<td>
							${data[i].productName}
						</td>
						<td>
							${data[i].price}
						</td>
					</tr>
				`);
			}
		}
	});
});