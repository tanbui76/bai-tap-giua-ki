<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="content-wrapper">
	<div class="container-fluid">
		<div class="card">
			<div class="card-body">
				<div class="row mt-3">
					<div class="col-lg-2">
						<button type="submit" class="btn btn-light px-5">
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
									<th scope="row"><div class="icheck-material-white" style="margin: 0">
											<input type="checkbox" id="user-checkbox${item.idSinhVien }" /> <label
												for="user-checkbox${item.idSinhVien }" name="selectedList"></label>
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

