<%@page import="QuanliCLB.dao.PermissionDAO"%>
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
						<form action="DeletePermissionServlet" method="post">
							<button style="display:none;" type="submit" class="btn btn-light px-5" id="deleteAction">
								<i class="bi bi-person-x"></i> Xóa
							</button> 
							<a  class="btn btn-light px-5" onclick="funcDel()">
								<i class="bi bi-person-x"></i> Xóa
							</a>
							<input style="display: block;" type="text" name="txtIDPhanQuyenDelete" id="txtIDPhanQuyenDelete"/>
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
								<th scope="col">STT</th>
								<th scope="col">ID Phân quyền</th>
								<th scope="col">Tên module</th>
								<th scope="col">Path</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="listSt" items="${listSt}" varStatus="i">
								<tr>
									<th scope="row">
										<div class="icheck-material-white" style="margin: 0">
											<input class="form-check-input" type="radio"
												name="selectSinhVien" id="user-checkbox${listSt.idPhanQuyen }"
												value="${listSt.idPhanQuyen}" aria-label="..."
												onclick="GetDataUpdate('${listSt.idPhanQuyen}')"> <label
												for="user-checkbox${listSt.idPhanQuyen}" name="selectedList"></label>
										</div>

									</th>
									<td>${i.index+1}</td>
									<td>${listSt.idPhanQuyen}</td>
									<td>${listSt.tenModule}
									<input style="display: none;" type="text" id="txtDataTenModule${listSt.idPhanQuyen}"
										value="${listSt.tenModule}"> 
										
									<input style="display: none;" type="text" id="txtDataLinkForm${listSt.idPhanQuyen}"
										value="${listSt.linkForm}"> 
									<input style="display: none;" type="text" id="txtDataPhanQuyen${listSt.idPhanQuyen}" value="${listSt.phanQuyen}">

									</td>
									
									<td>${listSt.linkForm}</td>
								</tr>

							</c:forEach>

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
								<th scope="col">STT</th>
								<th scope="col">ID Phân quyền</th>
								<th scope="col">Tên module</th>
								<th scope="col">Path</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="listTc" items="${listTc}" varStatus="i">
								<tr>
									<th scope="row">
										<div class="icheck-material-white" style="margin: 0">
											<input class="form-check-input" type="radio"
												name="selectSinhVien" id="user-checkbox${listTc.idPhanQuyen }"
												value="${listTc.idPhanQuyen}" aria-label="..."
												onclick="GetDataUpdate('${listTc.idPhanQuyen}')"> <label
												for="user-checkbox${listTc.idPhanQuyen}" name="selectedList"></label>
										</div>

									</th>
									<td>${i.index+1}</td>
									<td>${listTc.idPhanQuyen}</td>
									<td>${listTc.tenModule}
									<input style="display: none;" type="text" id="txtDataTenModule${listTc.idPhanQuyen}"
										value="${listTc.tenModule}"> 
										
									<input style="display: none;" type="text" id="txtDataLinkForm${listTc.idPhanQuyen}"
										value="${listTc.linkForm}"> 
									<input style="display: none;" type="text" id="txtDataPhanQuyen${listTc.idPhanQuyen}" value="${listTc.phanQuyen}">
									</td>
									
									<td>${listTc.linkForm}</td>
								</tr>

							</c:forEach>

						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<!-- myModal1: Thêm Phân Quyền -->
	<div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document"
			style="position: relative; top: 10%;">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel"
						style="font-size: 20px; font-weight: 600; color: #000;">Thêm
						Phân quyền</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<%
					PermissionDAO pDao = new PermissionDAO();
				%>
				<form action="AddPermissionServlet" method="post">
					<div class="modal-body">
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">ID Phân quyền: </label> <input type="text"
								readonly="readonly" id="idphanquuyen" name="txtIDPhanQuyen"
								style="width: 100%;" value="<%= pDao.Matutang() %>">
						</div>
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">Tên module: </label> <input type="text"
								id="tenmodule" name="txtTenModule" style="width: 100%;">
						</div>
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">Đường dẫn: </label> <input type="text"
								 id="duongdan" name="txtLinkForm"
								style="width: 100%;">
						</div>
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">Phân quyền: </label> <select id="txtphanquyen${item.idTaiKhoan}"
								style="height: 4vh;" class="form-select" name="txtPhanQuyen">
								<option style="background: #fff !important;" selected>--Chọn--</option>
								<option style="background: #fff !important;" value="2">Giáo
									Viên</option>
								<option style="background: #fff !important;" value="3">Sinh
									Viên</option>
							</select>
						</div>

						<div class="modal-footer">
	
							<button class="btn btn-success"">Thêm</button>
						</div>
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
						nhật phân quyền</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<form action="UpdatePermissionServlet" method="post">

					<div class="modal-body">
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">ID phân quyền: </label> <input type="text"
								readonly id="idPhanQuyenUpdate" name="txtIDPhanQuyenUpdate"
								style="width: 100%;" value="">
						</div>
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">Tên module: </label> <input type="text"
								id="tenModuleUpdate" name="txtTenModuleUpdate"
								style="width: 100%;">
						</div>
						<div class="form-group">
							<label for="message-text" class="col-form-label"
								style="color: #000;">Đường dẫn: </label> <input type="text"
								 id="linkFormUpdate"
								name="txtLinkFormUpdate" style="width: 100%;">
						</div>


						<div class="form-group"
							style="display: flex; flex-direction: column;">
							<label for="message-text" class="col-form-label"
								style="color: #000;">Phân Quyền: </label> <select id="PhanQuyenUpdate"
								style="height: 4vh;" class="form-select" name="txtPhanQuyenUpdate">
								<option style="background: #fff !important;" selected>--Chọn--</option>
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
		var getIdphanquyen = document.getElementById("user-checkbox" + id).value;
		//alert(getIdphanquyen );


		var PhanQuyen = document.getElementById("txtDataPhanQuyen" + id).value;
		var tenModule = document.getElementById("txtDataTenModule" + id).value;
		var linkForm = document.getElementById("txtDataLinkForm" + id).value;
				
		document.getElementById("idPhanQuyenUpdate").value = getIdphanquyen;
		document.getElementById("PhanQuyenUpdate").value = PhanQuyen;
		document.getElementById("tenModuleUpdate").value = tenModule;
		document.getElementById("linkFormUpdate").value = linkForm;
		
		document.getElementById("txtIDPhanQuyenDelete").value = getIdphanquyen;
	
		
	} 
	</script>
