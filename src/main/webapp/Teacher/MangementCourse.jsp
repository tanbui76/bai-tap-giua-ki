<%@page import="QuanliCLB.dao.CourseDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<div class="content-wrapper">
		<div class="container-fluid">
			<div class="card">
				<div class="card-body">
					<div class="row mt-3">
						<div class="col-lg-2">


							<button type="submit" class="btn btn-light px-5"
								data-toggle="modal" data-target="#myModal1">
								<i class="bi bi-person-add"></i>Thêm
							</button>

						</div>
						<div class="col-lg-2">
							<button type="submit" class="btn btn-light px-5"
								data-toggle="modal" data-target="#myModal2">
								<i class="bi bi-wrench-adjustable-circle"></i> Sửa
							</button>
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
					<h5 class="card-title">Thông tin môn học</h5>
					<div class="table-responsive">
						<table class="table">
							<thead>
								<tr>
									<th scope="col">STT</th>
							<!-- 		<th scope="col">Mã môn học</th> -->
									<th scope="col">Tên môn học</th>
									<th scope="col">Hành động</th>

								</tr>
							</thead>
							<tbody>	
							<c:forEach items="${listMon}" var="o" varStatus="theCount">
							<tr>
									<th scope="row">${theCount.count}</th>									
									<td>${o.tenMonHoc}</td>
									<td>
										<div class="col-lg-2">
											<button type="submit" class="btn btn-light px-5"
												data-toggle="modal" data-target="#myModal" onclick="funcDel()">
												<i class="bi bi-person-x"></i> Xóa
											</button>
										</div>
									</td>

								</tr>
							
							</c:forEach>
											
								<!-- <tr>
									<th scope="row">1</th>
									
									<td>Thiết kế và lập trình</td>
									<td>
										<div class="col-lg-2">
											<button type="submit" class="btn btn-light px-5"
												data-toggle="modal" data-target="#myModal" onclick="funcDel()">
												<i class="bi bi-person-x"></i> Xóa
											</button>
										</div>
									</td>

								</tr> -->
								<!-- <tr>
									<th scope="row">2</th>
					
									<td>Lập trình java căn bản</td>
									<td>
										<div class="col-lg-2">
											<button type="submit" class="btn btn-light px-5"
												data-toggle="modal" data-target="#myModal">
												<i class="bi bi-person-x"></i> Xóa
											</button>
										</div>
									</td>

								</tr> -->
								<!-- <tr>
									<th scope="row">3</th>
						
									<td>Lập trình C++</td>
									<td>
										<div class="col-lg-2">
											<button type="submit" class="btn btn-light px-5"
												data-toggle="modal" data-target="#myModal">
												<i class="bi bi-person-x"></i> Xóa
											</button>
										</div>
									</td>

								</tr> -->
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
