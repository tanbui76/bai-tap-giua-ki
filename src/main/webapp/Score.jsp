<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ĐIỂM CỦA SINH VIÊN</title>
<%@include file="includes/includeAdminStyle.jsp" %>

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