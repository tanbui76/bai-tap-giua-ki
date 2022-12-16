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
	<script>
	function funcDel() {
		Swal.fire({
			  title: 'Bạn có chắc chắn muốn xóa?',
			  text: "Bạn sẽ không thể khôi phục lại dữ liệu!",
			  icon: 'warning',
			  showCancelButton: true,
			  confirmButtonColor: '#3085d6',
			  cancelButtonColor: '#d33',
			  confirmButtonText: 'Xóa'
			}).then((result) => {
			  if (result.isConfirmed) {
				document.getElementById("checkDel").click();
			  }
			})
	}
		
	</script>
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
	function failDelete() {
		Swal.fire({
			  
			  icon: 'error',
			  title: 'Xóa thất bại',
			  showConfirmButton: false,
			  timer: 1500
			})
		
	}
	function successDelete() {
		Swal.fire({
			  
			  icon: 'success',
			  title: 'Xóa thành công',
			  showConfirmButton: false,
			  timer: 1500
			})
		
	}
	</script>
</body>

</html>