<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FileUploadBoard</title>
<link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<article>
	<div>
		<input type="button" onclick="location.href='${pageContext.request.contextPath}/list.board'" value="HOME">
		<input type="button" onclick="location.href='${pageContext.request.contextPath}/writeForm.board'" value="WRITE">
	</div>
</article>
