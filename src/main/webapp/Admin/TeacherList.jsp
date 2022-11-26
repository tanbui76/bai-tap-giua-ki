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
							<tr>
								<th scope="row">1</th>
								<td>2120220243</td>
								<td>Mai Hà Thi</td>
								<td>
									<a href="">Chi tiết</a>
								<button type="submit" class="btn btn-light px-5" onclick="funcDel()">
								<i class="bi bi-person-x"></i> Xóa
								</button>
								</td>
							</tr>
							<tr>
								<th scope="row">2</th>
								<td>2120220242</td>
								<td>Nguyễn Đình Lầu</td>
								<td>
									<a href="">Chi tiết</a>
								<button type="submit" class="btn btn-light px-5" onclick="funcDel()">
								<i class="bi bi-person-x"></i> Xóa
								</button>
								</td>
							</tr>
							<tr>
								<th scope="row">3</th>
								<td>2120220241</td>
								<td>Phạm Anh Phương</td>
								<td>
									<a href="">Chi tiết</a>
								<button type="submit" class="btn btn-light px-5" onclick="funcDel()">
								<i class="bi bi-person-x"></i> Xóa
								</button>
								</td>
							</tr>
							<tr>
								<th scope="row">4</th>
								<td>2120220240</td>
								<td>Phạm Thị Thu Hằng</td>
								<td>
									<a href="">Chi tiết</a>
								<button type="submit" class="btn btn-light px-5" onclick="funcDel()">
								<i class="bi bi-person-x"></i> Xóa
								</button>
								</td>
							</tr>
							<tr>
								<th scope="row">5</th>
								<td>2120220239</td>
								<td>Hồ Ngọc Tú</td>
								<td>
									<a href="">Chi tiết</a>
								<button type="submit" class="btn btn-light px-5" onclick="funcDel()">
								<i class="bi bi-person-x"></i> Xóa
								</button>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>

	</div>
</div>

