<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body onload="<%= request.getParameter("msg")%>">
	<%@include file="includes/includeAdminStyle.jsp"%>
	<div id="wrapper">
		<%@include file="includes/sliderbar.jsp"%>
		<%@include file="includes/Topbar.jsp"%>
		<%@include file="Admin/AccountManager.jsp"%>
	</div>
	<%@include file="includes/script.jsp"%>
	<script type="text/javascript">

	function successUpdate() {
		Swal.fire({
			  
			  icon: 'success',
			  title: 'Cập nhật thành công',
			  showConfirmButton: false,
			  timer: 1500
			})
		
	}
	function failUpdate() {
		Swal.fire({
			  
			  icon: 'error',
			  title: 'Cập nhật thất bại',
			  showConfirmButton: false,
			  timer: 1500
			})
		
	}
	</script>
</body>

</html>