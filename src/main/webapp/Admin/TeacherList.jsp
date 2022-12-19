<%@page import="QuanliCLB.dao.TeacherListDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div class="content-wrapper">
		<div class="container-fluid">
			<div class="card">
				<div class="card-body">
					<div class="row mt-3">
						<div class="col-lg-2">

							<button type="submit" class="btn btn-light px-5"
								data-toggle="modal" data-target="#myModal1">
								<i class="bi bi-person-add"></i> Thêm
							</button>
						</div>
						<div class="col-lg-2">
							<button type="submit" class="btn btn-light px-5" data-toggle="modal" data-target="#myModalUpdate">
								<i class="bi bi-wrench-adjustable-circle"></i> Sửa
							</button>
						</div>
						<div class="col-lg-2">
							<form action="DeleteTeacherServlet" method="post">
							<button style="display:none;" type="submit" class="btn btn-light px-5" id="deleteAction">
							<i class="bi bi-person-x"></i> Xóa
							</button>
							<a  class="btn btn-light px-5" onclick="funcDel()">
								<i class="bi bi-person-x"></i> Xóa
							</a>
						<input style="display: none;" type="text" name="txtIDGiaoVienDelete" id="txtIDGiaoVienDelete" style="display: block;"/>
						</form>
					</div>
					<div class="col-lg-2" style="margin-left: 10px;">
						<form action="UploadListTeacherServlet" method="post" enctype="multipart/form-data"> 
						<div>
						
						Chọn file :<input type="file" name="file">
						<button type="submit" class="btn btn-light px-5">
								<i class="bi bi-person-add"></i> Upload
							</button>
						
					</div>
						
<!-- Capnhat -->			
<div class="modal fade" id="myModalUpdate" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document"
		style="position: relative; top: 10%;">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel"
					style="font-size: 20px; font-weight: 600; color: #000;">Cập nhật giáo viên</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form action="UpdateTeacherServlet" method="post">
				<div class="modal-body">
					<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">ID giáo viên: </label> <input type="text" readonly 
							id="idgvUpdate" name="txtIDGiaoVienUpdate" style="width: 100%;" value="" >
					</div>
					<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Họ tên giáo viên: </label> <input
							type="text" id="hotengvUpdate" name="txtTenGiaoVienUpdate"
							style="width: 100%;">
					</div>
					<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Email: </label> <input type="text"
							id="emailgvUpdate" name="txtEmailGiaoVienUpdate" style="width: 100%;">
					</div>
					<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Địa chỉ: </label> <input type="text"
							id="diachigvUpdate" name="txtDiaChiGiaoVienUpdate" style="width: 100%;">
					</div>
					
					<div class="form-group" style="display: flex; flex-direction: column;">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Tài Khoản: </label> <select style="height: 4vh;" id="idtkgvUpdate"
							class="form-select" name="txtMaTaiKhoanUpdate">
							<option style="background: #fff !important;" selected>Chọn
								tài khoản</option>
							<c:forEach var="tk" items="${tklist}">
								<option style="background: #fff !important;"
									value="${tk.idTaiKhoan}">${tk.tenDangNhap}</option>
							</c:forEach>
						</select>
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
					<h5 class="card-title">Danh sách giáo viên</h5>
					<div class="table-responsive">
						<table class="table">
							<thead>
								<tr>
									<th scope="col">#</th>
									<th scope="col">Mã giáo viên</th>
									<th scope="col">Họ và tên</th>
									<th scope="col">Hành Động</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="item" items="${list}">
									<tr>
										 <th scope="row">
										 	<div class="icheck-material-white" style="margin: 0">
											<input class="form-check-input" type="radio" name="selectGiaoVien" id="user-checkbox${item.idGiaoVien }" value="${item.idGiaoVien}"  aria-label="..." onclick="GetDataUpdate('${item.idGiaoVien}')" >
											<label for="user-checkbox${item.idGiaoVien }" name="selectedList"></label>	
									</div>
										 </th>
										<td>${item.idGiaoVien}</td>
										<td>${item.hoTenGiaoVien}
											<input style="display: none;" type="text" id="hotengvdata${item.idGiaoVien }" value="${item.hoTenGiaoVien}">
											<input style="display: none;" type="text" id="emailgvdata${item.idGiaoVien }" value="${item.emailGiaoVien}">
											<input style="display: none;" type="text" id="diachigvdata${item.idGiaoVien }" value=${item.diaChiGiaoVien }>
											<input style="display: none;" type="text" id="idtaikhoandata${item.idGiaoVien }" value="${item.idTaiKhoan }">
										</td>
										<td>
											<button type="submit" class="btn btn-light px-5"
												data-toggle="modal" data-target="#myModal3">
												<i class="bi bi-person-add"></i> Chi tiết
											</button>
										</td>
									</tr>

								</c:forEach>

							</tbody>
						</table>
					</div>
				</div>
			</div>

		</div>
<!-- myModal1: Thêm Giao Vien -->
		<div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
							aria-labelledby="exampleModalLabel" aria-hidden="true">
							<div class="modal-dialog" role="document"
								style="position: relative; top: 10%;">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel"
											style="font-size: 20px; font-weight: 600; color: #000;">Thêm
											Giáo Viên</h5>
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>
									<%
										TeacherListDAO sDao = new TeacherListDAO();
									%>
									<form action="AddTeacherServlet" method="post">
										<div class="modal-body">
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">ID giáo viên: </label> <input
													type="text" id="recipient-name" name="txtIDGiaoVien" value="<%= sDao.Matutang()%>"
													style="width: 100%;">
											</div>
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">Tên giáo viên: </label> <input
													type="text" id="recipient-name" name="txtTenGiaoVien"
													style="width: 100%;">
											</div>
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">Email: </label> <input type="text"
													id="recipient-name" name="txtEmail" style="width: 100%;">
											</div>
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">Địa chỉ: </label> <input type="text"
													id="recipient-name" name="txtDiachi" style="width: 100%;">
											</div>
											<div class="form-group" style="display: flex; flex-direction: column;">
												<label for="message-text" class="col-form-label"
													style="color: #000;">Tài Khoản: </label> <select style="height: 4vh;" id="idtksv"
													class="form-select" name="txtMaTaiKhoan">
													<option style="background: #fff !important;" selected>Chọn
														tài khoản</option>
														<c:forEach var="tk" items="${tklist}">
															<option style="background: #fff !important;"
																value="${tk.idTaiKhoan}">${tk.tenDangNhap}</option>
														</c:forEach>
						</select>
					</div>

										</div>
										<div class="modal-footer">

											<button  class="btn btn-success">Thêm
											</button>
										</div>
									</form>
								</div>
							</div>
						</div>
	<!-- myModel3: Chi tiết giáo viên -->					
		
			<div class="modal fade" id="myModal3" tabindex="-1" role="dialog"
							aria-labelledby="exampleModalLabel" aria-hidden="true">
							<div class="modal-dialog" role="document"
								style="position: relative; top: 10%;">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel"
											style="font-size: 20px; font-weight: 600; color: #000;">
											Giáo Viên </h5>
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>
									<form action="DetailTeacherServlet" method="post">
										<c:forEach var="item" items="${list}">
											
											<div class="modal-body">
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">ID giáo viên: ${item.idGiaoVien} </label> 
											</div>
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">Tên giáo viên:  ${item.hoTenGiaoVien}</label> 
											</div>
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">Link github: ${item.github}</label>
											</div>
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">Email: ${item.emailGiaoVien}</label> 
											</div>
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">Địa chỉ: ${item.diaChiGiaoVien}</label> 
											</div>
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">Mã Tài Khoản: ${item.idTaiKhoan}</label>
											</div>

										</div>
										</c:forEach>
										
									</form>
								</div>
							</div>
						</div>
	</div>
	<script>
	function funcIn(){	   
		   Swal.fire({
				position : 'center',
				icon : 'success',
				title : 'Thêm thành công',
				showConfirmButton : false,
				timer : 1500
			})
		}
	function funcUp() {
		   Swal.fire({
				position : 'center',
				icon : 'success',
				title : 'Cập nhật thành công',
				showConfirmButton : false,
				timer : 1500
			})	
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
	
	function GetDataUpdate(id){
		/*
		<input type="text" id="hotengvdata" value="${item.hoTenGiaoVien}">
		<input type="text" id="emailgvdata" value="${item.email}">
		<input type="text" id="diachigvdata" value=${item.diaChiGiaoVien }>
		<input type="text" id="idtaikhoandata" value="${item.idTaiKhoan }">
		*/
		var getidgv = "user-checkbox"+id;
		var idGiaoVien = document.getElementById(getidgv).value;
		var hotengv = document.getElementById("hotengvdata"+id).value;
		var emailGiaoVien= document.getElementById("emailgvdata"+id).value;
		var diachi = document.getElementById("diachigvdata"+id).value;
		var idtaikhoan = document.getElementById("idtaikhoandata"+id).value;

		document.getElementById("idgvUpdate").value = idGiaoVien;
		document.getElementById("txtIDGiaoVienDelete").value = idGiaoVien;
		document.getElementById("hotengvUpdate").value = hotengv;
		document.getElementById("emailgvUpdate").value = emailGiaoVien;
		document.getElementById("diachigvUpdate").value = diachi;
		document.getElementById("idtkgvUpdate").value = idtaikhoan;

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
	</script>


