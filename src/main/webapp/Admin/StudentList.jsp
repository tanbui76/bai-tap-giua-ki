<%@page import="QuanliCLB.dao.StudentListDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
						<button type="submit" class="btn btn-light px-5">
							<i class="bi bi-wrench-adjustable-circle"></i> Sửa
						</button>
					</div>
					<div class="col-lg-2">
						<button type="submit" class="btn btn-light px-5">
							<i class="bi bi-person-x"></i> Xóa
						</button>
					</div>
				</div>
			</div>
		</div>
		<div class="card">
			<div class="card-body">
				<h5 class="card-title">Danh sách sinh viên</h5>
				<div class="table-responsive">
					<table class="table">
						<thead>

							<tr>
								<th scope="col">#</th>
								<th scope="col">Mã sinh viên</th>
								<th scope="col">Họ và tên</th>
								<th scope="col">Hành động</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${list}">
								<tr>
									<th scope="row"><div class="icheck-material-white"
											style="margin: 0">
											<input type="checkbox" id="user-checkbox${item.idSinhVien }" />
											<label for="user-checkbox${item.idSinhVien }"
												name="selectedList"></label>
										</div></th>
									<td>${item.idSinhVien}</td>
									<td>${item.hoTenSinhVien}</td>
									<td><button type="submit" class="btn btn-light px-5"
											onclick="funcDel()">
											<i class="bi bi-person-x"></i> Xóa
										</button></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>

	</div>
</div>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
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
				StudentListDAO studentListDAO = new StudentListDAO();
			
			%>
			<form action="AddTeacher" method="post">
				<div class="modal-body">
					<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">ID sinh viên: </label> <input type="text"
							id="recipient-name" name="txtIDSinhVien" style="width: 100%;" value="<%= studentListDAO.Matutang() %>" >
					</div>
					<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Họ tên sinh viên: </label> <input
							type="text" id="recipient-name" name="txtTenSinhVien"
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
					<!--  	<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Mã Tài Khoản: </label> <input type="text"
							id="recipient-name" name="txtMaTaiKhoan" style="width: 100%;">
					</div>-->
					<div class="form-group" style="display: flex; flex-direction: column;">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Tài Khoản: </label> <select style="height: 4vh;"
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

					<button class="btn btn-success">Thêm</button>
				</div>
			</form>
		</div>
	</div>
</div>

