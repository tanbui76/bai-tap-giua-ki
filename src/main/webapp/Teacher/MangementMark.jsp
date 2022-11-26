<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<body>
	<div class="content-wrapper">
		<div class="container-fluid">
			<div class="card">
				<div class="card-body">
					<div class="row mt-3">
						<div class="col-lg-3">
							<!-- <button type="submit" class="btn btn-light px-5"
								data-toggle="modal" data-target="#myModal1">
								<i class="bi bi-person-add"></i>Thêm
							</button> -->
							<div>
							<span>Năm học</span>
							<select id="">
							    <option value="">Chọn năm học</option>
								<option value="2020-2021">2020-2021</option>
								<option value="2021-2022">2021-2022</option>
								<option value="2022-2023">2022-2023</option>
							</select>
							</div>
							
							<br>
							<div>
							<span>Học kỳ</span>
							<select id="" style="margin: 0 6%">
							<option value="">Chọn học kì</option>
								<option value="1">Kì 1</option>
								<option value="2">Kì 2</option>
							</select>
							</div>
							
							
							
							<div>
							<span>Tuần</span>
							<select id="" style="margin: 0 6%">
							<option value="">Chọn tuần</option>
								<option value="1">20CNTT1</option>
								<option value="2">20CNTT2</option>
							</select>
							</div>

						</div>
						
						

						<div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
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
										<button type="button" class="btn btn-success" onclick="funcIn()">Thêm
											</button>	
									

									</div>
								</div>
							</div>
						</div>

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
										<button type="button" class="btn btn-success" onclick="funcUp()">Cập
											nhật</button>
									</div>
								</div>
							</div>
						</div>


					</div>
				</div>
			</div>
			<div class="card">
				<div class="card-body">
					<h5 class="card-title">Quản lý điểm </h5>
					<div class="table-responsive">
						<table class="table">
							<thead>
								<tr>
									<th rowspan="2">#</th>
									<th rowspan="2">Mã sinh viên</th>
									<th rowspan="2">Tên sinh viên</th>
									<tr>
									<th rowspan="2">Điểm HP hệ 4</th>
									<th rowspan="2">Điểm HP hệ 10</th>
									</tr>
									<th rowspan="2">Hành động</th>

								</tr>
							</thead>
							<tbody>
								<tr>
									<th scope="row">1</th>
									<td>S01</td>
									<td>Bùi Nguyễn Nhật Tân</td>
									<td>
										<div class="col-lg-2">
											<button type="submit" class="btn btn-light px-5"
												data-toggle="modal" data-target="#myModal" onclick="funcDel()">
												<i class="bi bi-person-x"></i> Xóa
											</button>
										</div>
									</td>

								</tr>
								<tr>
									<th scope="row">2</th>
									<td>S02</td>
									<td>Hồ Thị Kiều Linh</td>
									<td>
										<div class="col-lg-2">
											<button type="submit" class="btn btn-light px-5"
												data-toggle="modal" data-target="#myModal">
												<i class="bi bi-person-x"></i> Xóa
											</button>
										</div>
									</td>

								</tr>
								<tr>
									<th scope="row">3</th>
									<td>S03</td>
									<td>Thái Thị Thanh Ngân</td>
									<td>
										<div class="col-lg-2">
											<button type="submit" class="btn btn-light px-5"
												data-toggle="modal" data-target="#myModal">
												<i class="bi bi-person-x"></i> Xóa
											</button>
										</div>
									</td>

								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>

		</div>
	</div>
	<script type="text/javascript">
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
</body>
