
<%@page import="QuanliCLB.dao.CourseDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<%-- <%@include file="Teacher/MangementCourse.jsp" %> --%>
		<div class="content-wrapper">
			<div class="container-fluid">
				<div class="card">
					<div class="card-body">
						<div class="row mt-3">
					<div class="col-lg-2">
						<button type="submit" class="btn btn-light px-5"
							data-toggle="modal" data-target="#myModal">
							<i class="bi bi-person-add"></i> Thêm
						</button>
					</div>
					<div class="col-lg-2">
						<button type="submit" class="btn btn-light px-5" data-toggle="modal" data-target="#myModalUpdate">
							<i class="bi bi-wrench-adjustable-circle"></i> Sửa
						</button>
					</div>
					<!--  
					<div class="col-lg-2">
						<form action="DeleteStudentServlet" method="post">
						<button style="display:none;" type="submit" class="btn btn-light px-5" id="deleteAction">
							<i class="bi bi-person-x"></i> Xóa
						</button>
						<a  class="btn btn-light px-5" onclick="funcDel()">
							<i class="bi bi-person-x"></i> Xóa
						</a>
						<input style="display: none;" type="text" name="txtIDSinhVienDelete" id="txtIDSinhVienDelete" style="display: block;"/>
						</form>
					</div>
					-->
				</div>
						<!-- THEM MON HOC -->
							<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
								aria-labelledby="exampleModalLabel" aria-hidden="true">
								<div class="modal-dialog" role="document"
									style="position: relative; top: 10%;">
									<div class="modal-content">
										<div class="modal-header">
											<h5 class="modal-title" id="exampleModalLabel"
												style="font-size: 20px; font-weight: 600; color: #000;">Thêm
												môn học</h5>
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
										</div>
										<%
											CourseDAO courseDAO = new CourseDAO();
										%>
										<form action="AddCourseServlet" method="post">
											<div class="modal-body">
												<div class="form-group">
													<label for="message-text" class="col-form-label"
														style="color: #000;">ID môn học: </label> <input type="text" readonly
														id="idsv" name="txtIDMonHoc" style="width: 100%;" value="<%= courseDAO.Matutang() %>" >
												</div>
												<div class="form-group">
													 <label for="message-text"
														class="col-form-label" style="color: #000;">Tên
														môn học
													</label> 
													<input type="text" name="txtTenMonHoc" id="recipient-name" style="width: 100%;">
												</div>
											</div>
											<div class="modal-footer">
												<button class="btn btn-success">Thêm</button>

											</div>
										</form> 
									
									</div>
								</div>
							</div>
						<!-- Cập nhật môn học -->
							<div class="modal fade" id="myModalUpdate" tabindex="-1" role="dialog"
								aria-labelledby="exampleModalLabel" aria-hidden="true">
								<div class="modal-dialog" role="document"
									style="position: relative; top: 10%;">
									<div class="modal-content">
										<div class="modal-header">
											<h5 class="modal-title" id="exampleModalLabel"
												style="font-size: 20px; font-weight: 600; color: #000;">Cập
												nhật môn học</h5>
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
										</div>
										<form action="UpdateCourseServlet" method="post">
											<div class="modal-body">
												<div class="form-group">
													<label for="message-text" class="col-form-label"
														style="color: #000;">ID môn học: </label> <input type="text" readonly 
														id="idmhUpdate" name="txtIDMonHocUpdate" style="width: 100%;" value="" >
												</div>
												<div class="form-group">
													<label for="message-text" class="col-form-label"
														style="color: #000;">Tên môn học: </label> <input
														type="text" id="tenmhUpdate" name="txtTenMonHocUpdate"
														style="width: 100%;">
												</div>
											</div>
											<div class="modal-footer">
												<button class="btn btn-success">Cập nhật</button>
											</div>
										</form>
									</div>
								</div>
							</div>


						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Thông tin môn học</h5>
						<div class="table-responsive">
							<table class="table">
								<thead>
									<tr>
										<th scope="col">#</th>
										<th scope="col">STT</th>
										<th scope="col">Tên môn học</th>
									</tr>
								</thead>
								<tbody>
								<c:forEach var="o" items="${listMon}" varStatus="i">
										<tr>
											<th scope="row">
												<div class="icheck-material-white" style="margin: 0">
												<input class="form-check-input" type="radio" name="selectMonHoc" id="user-checkbox${o.idMonHoc}" value="${o.idMonHoc}"  aria-label="..." onclick="GetDataUpdate('${o.idMonHoc}')" >
												<label for="user-checkbox${o.idMonHoc }" name="selectedList"></label>	
												</div>
											</th>
											<td>${i.index+1}</td>
											<td>${o.tenMonhoc}
												
												<input style="display: none;" type="text" id="tenmhdata${o.idMonHoc }" value="${o.tenMonhoc}">
											</td>
											
										</tr>

									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
	<%@include file="includes/script.jsp"%>
	<script>
	function GetDataUpdate(id){
		var getidmh = "user-checkbox"+id;
		var idMonHoc = document.getElementById(getidmh).value;
		var tenMonHoc = document.getElementById("tenmhdata"+id).value;
		

		document.getElementById("idmhUpdate").value = idMonHoc;
		//document.getElementById("txtIDGiaoVienDelete").value = idGiaoVien;
		document.getElementById("tenmhUpdate").value = tenMonHoc;

	}
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
				document.getElementById("deleteAction").click();
			  }
			})
		
	}
	</script>
	<script type="text/javascript">
	
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
	<script type="text/javascript">
	
	function successUpdate() {
		Swal.fire({
			  
			  icon: 'success',
			  title: 'Cập nhật thành công',
			  showConfirmButton: false,
			  timer: 1500
			})
		
	}
	function AddSucc() {
		Swal.fire({
			  
			  icon: 'success',
			  title: 'Thêm thành công',
			  showConfirmButton: false,
			  timer: 4000
			})
		
	}
	function AddErr() {
		Swal.fire({
			  
			  icon: 'error',
			  title: 'Thêm thất bại',
			  showConfirmButton: false,
			  timer: 4000
			})
		
	}
	</script>
</body>
</html>