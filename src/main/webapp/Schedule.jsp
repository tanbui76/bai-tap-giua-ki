<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="/QuanLiCLB/src/main/webapp/assets/fonts/FontAwesome.otf">
<style>
h2 {
	text-align: center;
	color: #f8f9fa;
	font-size: 30px;
}
</style>
</head>
<body>
<%@include file="includes/includeAdminStyle.jsp" %>


<div id="wrapper">
		<%@include file="includes/sliderbar.jsp" %>
		<%@include file="includes/Topbar.jsp" %>
		<%@include file="scheduleStudent/Schedule.jsp" %>
		
	<%@include file="includes/script.jsp" %>
	</div>
</body>
</html>