<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ĐIỂM CỦA SINH VIÊN</title>
<link rel="stylesheet" href="assets/css/style.css">
</head>
<body>
	<div class="content-wrapper">
		<div class="container-fluid">
			<div class="card">
				<div class="card-body">
				
						<h3 class="result" style="text-align: center; color: white">Kết
							quả học tập sinh viên</h3>
							
							<form action="ShowScoreStudentServlet" method="post">
						<table width="100%" class="soft">
							<tbody>
								<tr>
									<td align="right" width="40%" style="font-size: 20px;">Năm
										học - Học kỳ:</td>
									<td align="left">
									<select id="cbbNienKhoa" name="cbbNienKhoa" onchange="funcNienKhoa()">
											<option style="background: #fff !important"
												selected disabled="disabled">Chọn năm học</option>
											<c:forEach var="item" items="${listNienKhoa}">
												<option style="background: #fff !important"
													value="${item.idNienKhoa}">${item.namNienKhoa}
													
													</option>
													
											</c:forEach>

									</select> 
									<input style="width: 8%;" type="text" id="ipIdNienKhoa" name="idNienKhoa">
									<select id="cbbHocKi" name="cbbHocKi"style="width: 120px;" onchange="funcHocKi()">
											<option style="background: #fff !important"
												selected disabled="disabled">Chọn học kỳ</option>
											<c:forEach var="item" items="${listHocKi}">
												<option style="background: #fff !important"
													value="${item.idHocKi}">${item.tenHocKi}</option>
											</c:forEach>
									</select>
									<input style="width: 8%;" type="text" id="ipIdHocKi" name="idHocKi">
									</td>
								</tr>
								<tr>
									<td align="center" colspan="2">
									<input type="submit"
										name="btnXem" id="btnXem" value="Xem">
									</td>
								</tr>
							</tbody>
						</table>
						
						<fieldset class="list">
							<legend>
								<h4>Học kỳ: 1 - Năm học: 2022 - 2023</h4>
							</legend>
							<div class="divp-list" style="overflow: auto"
								id="divp_xemketquahoctap_0">
								<table class="table table-bordered">
									<thead>
										<tr>
											<th scope="col">STT</th>
											<th scope="col">Mã môn học</th>
										    <th scope="col">Tên môn học</th>
											<th scope="col">Điểm HP hệ 10</th>
											<th scope="col">Chi tiết</th>
										</tr>
									</thead>
									<tbody>
									<c:forEach items="${listBangDiemChiTiet}" var="item">
									<tr>
										     <th scope="row">${i.index+1}</th>											
											<td>${item.idMonHoc }</td>
											<td></td>
											<td></td>
											<td>
											<button type="button" class="btn btn-light px-5" data-toggle="modal" data-target="#myModalChiTiet" onclick="funcChiTiet('${item.idBangDiemChiTiet}')">
							               <i class="bi bi-wrench-adjustable-circle"></i>
						                   </button>
						                   <input style=" width: 8%;" type="text" id="dataHe1_${item.idBangDiemChiTiet}" value="${item.diemHe1}">
						                   <input style=" width: 8%;" type="text" id="dataHe2_${item.idBangDiemChiTiet}" value="${item.diemHe2}">
						                   <input style=" width: 8%;" type="text" id="dataHe3_${item.idBangDiemChiTiet}" value="${item.diemHe3}">
						                   </td>
									</tr>
									</c:forEach>
									
									
																	
									</tbody>
								</table>
							</div>
							<table width="100%" border="0" class="fixheader">
								<tbody>
									<tr>
										<td align="left" width="30%" class="normal">Điểm trung
											bình học kỳ hệ 10</td>
										<td align="left" width="20%" class="normal"><b>8.54</b></td>
										<td align="left" width="30%" class="normal">Điểm trung
											bình học kỳ hệ 4</td>
										<td align="left" width="20%" class="normal"><b>3.65</b></td>
									</tr>
								</tbody>
							</table>
						</fieldset>
					</form>
				</div>
			</div>

		</div>
	</div>
	
	
	
	<!-- sua  -->

<div class="modal fade" id="myModalChiTiet" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document"
		style="position: relative; top: 10%;">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel"
					style="font-size: 20px; font-weight: 600; color: #000;">Chi tiết môn học </h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			
				<div class="modal-body">
					<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Điểm hệ 1: </label> <input type="text" readonly 
							id="txtDiemHe1" name="txtDiemHe1" style="width: 100%;">
					</div>
					<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Điểm hệ 2: </label> <input
							type="text" id="txtDiemHe2" name="txtDiemHe2"
							style="width: 100%;">
					</div>
					<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Điểm hệ 3: </label> <input type="text"
							id="txtDiemHe3" name="txtDiemHe3" style="width: 100%;">
					</div>
					<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Điểm HP hệ 10: </label> <input type="text"
							id="txtDiemHe10" name="txtDiemHe10" style="width: 100%;">
					</div>
					
					<div class="form-group" style="display: flex; flex-direction: column;">
						<label for="message-text" class="col-form-label"
							style="color: #000;"></label> 
					</div>


				</div>
				<!-- <div class="modal-footer">

					<button class="btn btn-success">Cập nhật</button>
				</div> -->
			
		</div>
	</div>
</div>
<script type="text/javascript">
function funcNienKhoa() {
	var idNienKhoa = document.getElementById("cbbNienKhoa").value;
	// gán giá trị cho input ipIdNienKhoa
	document.getElementById("ipIdNienKhoa").value = idNienKhoa;
	
}
function funcHocKi(){
	var idHocKi = document.getElementById("cbbHocKi").value;
	// gán giá trị cho input ipIdNienKhoa
	document.getElementById("ipIdHocKi").value = idHocKi;
	
	
}
function funcChiTiet(id) {
	//alert("Hello");
	var diemHe1 = document.getElementById("dataHe1_"+ id).value;
	document.getElementById("txtDiemHe1").value = diemHe1;
	var diemHe2 = document.getElementById("dataHe2_"+ id).value;
	document.getElementById("txtDiemHe2").value = diemHe2;
	var diemHe3 = document.getElementById("dataHe3_"+ id).value;
	document.getElementById("txtDiemHe3").value = diemHe3;
	
	
}
</script>
</body>
</html>