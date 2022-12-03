<%@page import="QuanliCLB.model.TaiKhoan"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
<%@include file="includes/includeAdminStyle.jsp"%>
</head>
<body>

	<div id="wrapper">
		<%@include file="includes/sliderbar.jsp"%>
		<%@include file="includes/Topbar.jsp"%>
		<!--    -->
		<div class="content-wrapper">
			<div class="container-fluid">

				<div class="row mt-3">
					<div class="col-lg-4">
						<div class="card profile-card-2">
							<div class="card-img-block"></div>
							<div class="card-body pt-5">
								<img src="https://via.placeholder.com/110x110"
									alt="profile-image" class="profile">
								<h5 class="card-title">
									<c:if test="${tk.phanQuyen == 1 }">
										<c:out value="${admin.hoVaTen}"></c:out> - Admin
								</c:if>
								<c:if test="${tk.phanQuyen == 2 }">
										<c:out value="${sinhvien.hoVaTen}"></c:out> - Sinh Viên
								</c:if>
								<c:if test="${tk.phanQuyen == 3 }">
										<c:out value="${giaovien.hoVaTen}"></c:out> - Giáo Viên
								</c:if>

								</h5>
								<p class="card-text">Sinh viên đang học tại trường sư phạm
									đà nẵng.</p>

							</div>


						</div>

					</div>

					<div class="col-lg-8">
						<div class="card">
							<div class="card-body">

								<div class="tab-content p-3">
									<div class="tab-pane" id="messages">
										<div class="alert alert-info alert-dismissible" role="alert">
											<button type="button" class="close" data-dismiss="alert">&times;</button>
											<div class="alert-icon">
												<i class="icon-info"></i>
											</div>

										</div>

									</div>
									<div class="tab-pane  active" id="edit">
										<form>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Họ
													và tên</label>
												<div class="col-lg-9">
													<input class="form-control" type="text"
														value="<c:if test="${tk.phanQuyen == 1 }"><c:out value="${admin.hoVaTen}"></c:out></c:if> <c:if test="${tk.phanQuyen == 2 }"><c:out value="${sinhvien.hoVaTen}"></c:out></c:if> <c:if test="${tk.phanQuyen == 3 }"><c:out value="${giaovien.hoVaTen}"></c:out></c:if>">
												</div>
											</div>

											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Email</label>
												<div class="col-lg-9">

													<input class="form-control" type="email"
														value="<c:if test="${tk.phanQuyen == 1 }">
									<c:out value="${admin.email}"></c:out>
								</c:if> <c:if test="${tk.phanQuyen == 2 }">
									<c:out value="${sinhvien.email}"></c:out>
								</c:if> <c:if test="${tk.phanQuyen == 3 }">
									<c:out value="${giaovien.email}"></c:out>
								</c:if> ">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Ảnh
													đại diện</label>
												<div class="col-lg-9">
													<input class="form-control" type="file">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Github</label>
												<div class="col-lg-9">
													<input class="form-control" type="url" value="">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Địa
													chỉ</label>
												<div class="col-lg-9">
													<input class="form-control" type="text" value=""
														placeholder="Đường">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label"></label>
												<div class="col-lg-6">
													<input class="form-control" type="text" value=""
														placeholder="Quận">
												</div>
												<div class="col-lg-3">
													<input class="form-control" type="text" value=""
														placeholder="Thành phố">
												</div>
											</div>

											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Tên
													đăng nhập</label>
												<div class="col-lg-9">
													<input class="form-control" type="text"
														value="<c:out value="${tk.tenDangNhap}"></c:out>">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Mật
													khẩu</label>
												<div class="col-lg-9">
													<input class="form-control" type="password"
														value="<c:out value="${tk.matKhau}"></c:out>">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Xác
													nhận mật khẩu</label>
												<div class="col-lg-9">
													<input class="form-control" type="password"
														value="<c:out value="${tk.matKhau}"></c:out>">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label"></label>
												<div class="col-lg-9">
													<input type="button" class="btn btn-primary"
														value="Lưu thay đổi" onclick="success()">
												</div>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>

				<!--start overlay-->
				<div class="overlay toggle-menu"></div>
				<!--end overlay-->

			</div>
			<!-- End container-fluid-->
		</div>
	</div>
	<%@include file="includes/script.jsp"%>
	<script type="text/javascript">
		function success() {
			Swal.fire({
				position : 'top-end',
				icon : 'success',
				title : 'Lưu thay đổi thành công',
				showConfirmButton : false,
				timer : 1500
			})
		}
	</script>
</body>
</html>