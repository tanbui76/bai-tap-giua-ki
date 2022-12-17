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
						<button type="submit" class="btn btn-light px-5"
							data-toggle="modal" data-target="#myModalUpdate">
							<i class="bi bi-wrench-adjustable-circle"></i> Sửa
						</button>
					</div>
					
					<div class="col-lg-2">
						<form action="DeleteAccountServlet" method="post">
						<button style="display:none;" type="submit" class="btn btn-light px-5" id="checkDel">
							<i class="bi bi-person-x"></i> Xóa
						</button> 
						<a  class="btn btn-light px-5" onclick="funcDel()">
							<i class="bi bi-person-x"></i> Xóa
						</a>
						<input style="display: block;" type="text" name="txtIDTaiKhoanDelete" id="txtIDTaiKhoanDelete"/>
					</form>
					</div>

				</div>
			</div>
		</div>
		<div class="card">
			<div class="card-body">
				<h5 class="card-title">Phân quyền của sinh viên</h5>
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">ID Phân quyền</th>
								<th scope="col">Tên  module</th>
								<th scope="col">Path</th>
							</tr>
						</thead>
						<tbody>
						
								<tr>
									<th scope="row">
										<div class="icheck-material-white" style="margin: 0">
											<input class="form-check-input" type="radio"
												name="selectSinhVien" id="user-checkbox${item.idTaiKhoan }"
												value="${item.idTaiKhoan}" aria-label="..."
												onclick="GetDataUpdate('${item.idTaiKhoan}')"> <label
												for="user-checkbox${item.idTaiKhoan}" name="selectedList"></label>
										</div>

									</th>
									<td>${item.idTaiKhoan}</td>
									<td>${item.tenDangNhap}<input hidden="hidden" type="text"
										id="txtDataIdTaiKhoan${item.idTaiKhoan}"
										value="${item.idTaiKhoan}"> <input hidden="hidden" type="text"
										id="txtDataTenDangNhap${item.idTaiKhoan}"
										value="${item.tenDangNhap}"> <input hidden="hidden" type="text"
										id="txtDataMatKhau${item.idTaiKhoan}" value="${item.matKhau}">
										 <input hidden="hidden" type="text" id="txtDataPhanQuyen${item.idTaiKhoan}" value="${item.phanQuyen}">
										<%-- <input type="text" id="txtDataPhanQuyen${item.idTaiKhoan}"> --%>

									</td>
									
									<td></td>
								</tr>

							

						</tbody>
					</table>
				</div>
			</div>
		</div>
		
		
		<div class="card">
			<div class="card-body">
				<h5 class="card-title">Phân quyền của giáo viên</h5>
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">ID Phân quyền</th>
								<th scope="col">Tên  module</th>
								<th scope="col">Path</th>
							</tr>
						</thead>
						<tbody>
					
								<tr>
									<th scope="row">
										<div class="icheck-material-white" style="margin: 0">
											<input class="form-check-input" type="radio"
												name="selectPhanQuyen" id="user-checkbox${item.idTaiKhoan }"
												value="${item.idTaiKhoan}" aria-label="..."
												onclick="GetDataUpdate('${item.idTaiKhoan}')"> <label
												for="user-checkbox${item.idTaiKhoan}" name="selectedList"></label>
										</div>

									</th>
									<td>${item.idTaiKhoan}</td>
									<td>${item.tenDangNhap}<input hidden="hidden" type="text"
										id="txtDataIdTaiKhoan${item.idTaiKhoan}"
										value="${item.idTaiKhoan}"> <input hidden="hidden" type="text"
										id="txtDataTenDangNhap${item.idTaiKhoan}"
										value="${item.tenDangNhap}"> <input hidden="hidden" type="text"
										id="txtDataMatKhau${item.idTaiKhoan}" value="${item.matKhau}">
										 <input hidden="hidden" type="text" id="txtDataPhanQuyen${item.idTaiKhoan}" value="${item.phanQuyen}">
										<%-- <input type="text" id="txtDataPhanQuyen${item.idTaiKhoan}"> --%>

									</td>
									
									<td></td>
								</tr>

							

						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<!-- myModal1: Thêm Tài Khoản -->
	<div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document"
			style="position: relative; top: 10%;">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel"
						style="font-size: 20px; font-weight: 600; color: #000;">Thêm
						Tài khoản</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<form action="AddAccountServlet" method="post">
					<div class="modal-body">
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">ID Tài khoản: </label> <input type="text"
								readonly="readonly" id="recipient-name" name="txtIDTaiKhoan"
								style="width: 100%;" value="">
						</div>
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">Tên đăng nhập: </label> <input type="text"
								id="recipient-name" name="txtTenDangNhap" style="width: 100%;">
						</div>
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">Mật khẩu: </label> <input type="text"
								readonly="readonly" id="recipient-name" name="txtmatkhau"
								style="width: 100%;">
						</div>
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">Phân quyền: </label> <select id="txtphanquyen${item.idTaiKhoan}"
								style="height: 4vh;" class="form-select" name="txtphanQuyen">
								<option style="background: #fff !important;" selected>--Chọn--</option>
								<option style="background: #fff !important;" value="1">Admin</option>
								<option style="background: #fff !important;" value="2">Giáo
									Viên</option>
								<option style="background: #fff !important;" value="3">Sinh
									Viên</option>
							</select>
						</div>

					</div>
					<div class="modal-footer">

						<button class="btn btn-success"">Thêm</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<!-- sua tai khoan  -->

	<div class="modal fade" id="myModalUpdate" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document"
			style="position: relative; top: 10%;">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel"
						style="font-size: 20px; font-weight: 600; color: #000;">Cập
						nhật tài khoản</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<form action="UpdateAccountServlet" method="post">

					<div class="modal-body">
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">ID Tài khoản: </label> <input type="text"
								readonly id="idtkUpdate" name="txtIDTaiKhoanUpdate"
								style="width: 100%;" value="">
						</div>
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">Tên đăng nhập: </label> <input type="text"
								id="tenDangNhaptkUpdate" name="txtTenDangNhapUpdate"
								style="width: 100%;">
						</div>
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">Mật khẩu: </label> <input type="text"
								readonly="readonly" id="matkhautkUpdate"
								name="txtPassTaiKhoanUpdate" style="width: 100%;">
						</div>


						<div class="form-group"
							style="display: flex; flex-direction: column;">
							<label for="message-text" class="col-form-label"
								style="color: #000;">Phân Quyền: </label> <select id="txtphanQuyenUp"
								style="height: 4vh;" class="form-select" name="txtphanQuyenUpdate">
								<option style="background: #fff !important;" selected>--Chọn--</option>
								<option style="background: #fff !important;" value="1">Admin</option>
								<option style="background: #fff !important;" value="2">Giáo
									Viên</option>
								<option style="background: #fff !important;" value="3">Sinh
									Viên</option>
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
	
/* 	function funcDel() {
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
				// check xem có click vào nút xóa hay không
			var check = document.getElementById("checkDel").value;
				if(check==true){
					alert("Hello");
					check.click();
				}
					
					
				//document.getElementById("deleteAction").click();
			  }
			})
		
	} */
	
	 function GetDataUpdate(id) {
		var getIdtk = document.getElementById("user-checkbox" + id).value;
	//	 alert(getIdtk);
		var idTaiKhoan = document.getElementById("txtDataIdTaiKhoan" + id).value;
		var tenDangNhap = document.getElementById("txtDataTenDangNhap" + id).value;
		var matKhau = document.getElementById("txtDataMatKhau" + id).value;
		var phanquyen = document.getElementById("txtDataPhanQuyen" + id).value;
				
		document.getElementById("idtkUpdate").value = idTaiKhoan;
		document.getElementById("tenDangNhaptkUpdate").value = tenDangNhap;
		document.getElementById("matkhautkUpdate").value = matKhau;
		document.getElementById("txtphanQuyenUp").value = phanquyen;
		document.getElementById("txtIDTaiKhoanDelete").value = idTaiKhoan;
	
		
	} 
	</script>
