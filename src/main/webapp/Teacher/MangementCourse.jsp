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
									<th scope="col">Tên môn học</th>
									<th scope="col">Hành động</th>

								</tr>
							</thead>
							<tbody>	
							
							<%-- <c:forEach items="${listMon}" var="o" varStatus="counter">
							<tr>
									<td scope="row">${counter.count}</td>							
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
							
							</c:forEach> --%>
											
								
							</tbody>
						</table>
					</div>
				</div>
			</div>

		</div>
	</div>
	
</body>
