<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
	<!-- model attribute와 price attribute에 추가한 적 없기 때문에 값이 안나옴 -->
	<h1>\${model } : ${model }</h1> 
	<h1>\${price } : ${price }</h1>
	<h1>\${dto04.name } : ${dto04.name }</h1>
	<h1>\${dto04.age } : ${dto04.age }</h1>
	
	<hr />
	
	<h1>\${param.model } : ${param.model }</h1>
	<h1>\${param.price } : ${param.price }</h1>
	<h1>\${string } : ${string }</h1>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>