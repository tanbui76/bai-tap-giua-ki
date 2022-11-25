<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
<%@include file="includes/includeAdminStyle.jsp"%>
<style>
body {
	background-color: #39414c;
}
</style>
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
							<div class="card-img-block">
															</div>
							<div class="card-body pt-5">
								<img src="https://via.placeholder.com/110x110"
									alt="profile-image" class="profile">
								<h5 class="card-title">Bùi Nguyễn Nhật Tân - Admin</h5>
								<p class="card-text">Sinh viên đang học tại trường sư phạm đà nẵng.</p>
								
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
											<div class="alert-message">
												<span><strong>Info!</strong> Lorem Ipsum is simply
													dummy text.</span>
											</div>
										</div>
										<div class="table-responsive">
											<table class="table table-hover table-striped">
												<tbody>
													<tr>
														<td><span class="float-right font-weight-bold">3
																hrs ago</span> Here is your a link to the latest summary report
															from the..</td>
													</tr>
													<tr>
														<td><span class="float-right font-weight-bold">Yesterday</span>
															There has been a request on your account since that was..
														</td>
													</tr>
													<tr>
														<td><span class="float-right font-weight-bold">9/10</span>
															Porttitor vitae ultrices quis, dapibus id dolor. Morbi
															venenatis lacinia rhoncus.</td>
													</tr>
													<tr>
														<td><span class="float-right font-weight-bold">9/4</span>
															Vestibulum tincidunt ullamcorper eros eget luctus.</td>
													</tr>
													<tr>
														<td><span class="float-right font-weight-bold">9/4</span>
															Maxamillion ais the fix for tibulum tincidunt ullamcorper
															eros.</td>
													</tr>
												</tbody>
											</table>
										</div>
									</div>
									<div class="tab-pane  active" id="edit">
										<form>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Họ và tên</label>
												<div class="col-lg-9">
													<input class="form-control" type="text" value="Bùi Nguyễn Nhật Tân">
												</div>
											</div>
											
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Email</label>
												<div class="col-lg-9">
													<input class="form-control" type="email"
														value="nhattan@gmail.com">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Ảnh đại diện</label>
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
												<label class="col-lg-3 col-form-label form-control-label">Địa chỉ</label>
												<div class="col-lg-9">
													<input class="form-control" type="text" value=""
														placeholder="Street">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label"></label>
												<div class="col-lg-6">
													<input class="form-control" type="text" value=""
														placeholder="City">
												</div>
												<div class="col-lg-3">
													<input class="form-control" type="text" value=""
														placeholder="State">
												</div>
											</div>

											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Tên đăng nhập</label>
												<div class="col-lg-9">
													<input class="form-control" type="text" value="jhonsanmark">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Mật khẩu</label>
												<div class="col-lg-9">
													<input class="form-control" type="password"
														value="11111122333">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label">Xác nhận mật khẩu</label>
												<div class="col-lg-9">
													<input class="form-control" type="password"
														value="11111122333">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-lg-3 col-form-label form-control-label"></label>
												<div class="col-lg-9">
													 <input type="button"
														class="btn btn-primary" value="Lưu thay đổi">
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
</body>
</html>