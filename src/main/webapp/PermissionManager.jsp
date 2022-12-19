<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>QUẢN LÍ PHÂN QUYỀN</title>
</head>
<%@include file="includes/includeAdminStyle.jsp"%>
<body>
	<div id="wrapper">
		<%@include file="includes/sliderbar.jsp"%>
		<%@include file="includes/Topbar.jsp"%>
		<%@include file="Admin/PermissionManager.jsp"%>
	</div>
	<%@include file="includes/script.jsp"%>
</body>
</html>