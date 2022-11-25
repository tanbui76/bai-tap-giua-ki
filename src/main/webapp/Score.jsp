<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="includes/includeAdminStyle.jsp" %>
<style>
	body{
	 	background-color: #39414c;
	}
</style>
</head>
<body>
	<div id="wrapper">
		<%@include file="includes/sliderbar.jsp" %>
		<%@include file="includes/Topbar.jsp" %>
		<%@include file="CollegeStudent/StudentScore.jsp" %>
	</div>
	<%@include file="includes/script.jsp" %>
</body>
</html>