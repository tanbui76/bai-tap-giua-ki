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
		              <input type="file" name="file">
		              <br>
		              <button type="submit" class="btn btn-light px-5">
					  <i class="bi bi-person-x"></i> Upload
					  </button>
					  </div>
						<!-- <div class="col-lg-2">

							<button type="submit" class="btn btn-light px-5"
								data-toggle="modal" data-target="#myModal2">
								<i class="bi bi-wrench-adjustable-circle"></i> Cập nhật
							</button>
						</div> -->
						<!-- <button type="submit" class="btn btn-light px-5"
												onclick="funcDel()">
												<i class="bi bi-person-x"></i> Xóa
											</button> -->
						
						<div class="modal fade" id="myModal2" tabindex="-1" role="dialog"
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
									<div class="modal-body">
										<form>
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">Tên môn học</label> <input type="text"
													id="recipient-name" style="width: 100%;">
											</div>
										</form>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-secondary"
											data-dismiss="modal">Close</button>
										<button type="button" class="btn btn-success"
											onclick="funcUp()">Cập nhật</button>
									</div>
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
										 <th scope="row">1</th>
										<td>${item.idGiaoVien}</td>
										<td>${item.hoTenGiaoVien}</td>
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
									<form action="AddTeacher" method="post">
										<div class="modal-body">
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">ID giáo viên: </label> <input
													type="text" id="recipient-name" name="txtIDGiaoVien"
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
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">Mã Tài Khoản: </label> <input
													type="text" id="recipient-name" name="txtMaTaiKhoan"
													style="width: 100%;">
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
			    Swal.fire(
			      'Đã xóa!',
			      'Xóa thành công',
			      'success'
			    )
			  }
			})
		
	}
	</script>
