<%@page import="QuanliCLB.model.BangDiemChiTiet"%>
<%@page import="java.util.List"%>
<%@page import="QuanliCLB.dao.ScoreStudentDAO"%>
<%@page import="QuanliCLB.model.MonHoc"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	
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
				<form action="ShowScoreStudentServlet" method="post">
						<h3 class="result" style="text-align: center; color: white">Kết				
							quả học tập sinh viên</h3>
							<c:if test="${listBangDiemChiTiet ==null }">
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
									<input hidden="hidden" style="width: 8%;" type="text" id="ipIdNienKhoa" name="idNienKhoa">
									<select id="cbbHocKi" name="cbbHocKi"style="width: 120px;" onchange="funcHocKi()">
											<option style="background: #fff !important"
												selected disabled="disabled">Chọn học kỳ</option>
											<c:forEach var="item" items="${listHocKi}">
												<option style="background: #fff !important"
													value="${item.idHocKi}">${item.tenHocKi}</option>
											</c:forEach>
									</select>
									<input hidden="hidden" style="width: 8%;" type="text" id="ipIdHocKi" name="idHocKi">
									</td>
								</tr>
								<tr>
									<td align="center" colspan="2">
									<input type="submit"
										name="btnXem" id="btnXem" value="Xem" onclick="funcXem()">
									</td>
								</tr>
							</tbody>
						</table>
							
							</c:if>
							</form>


					

					<c:if test="${listBangDiemChiTiet !=null}">
					<div class="col-lg-2">
						<a href="ScoreStudentServlet">
							<button type="submit" class="btn btn-light px-5"
								style="padding: 1%;">
								<i class="bi bi-person-x"></i> Trở về
							</button>
						</a>
					</div>
							<fieldset class="list">
							<legend>
								<h4>Học kỳ: 1 - Năm học: 2022 - 2023</h4>
							
							</legend>
							
							<div id="table_tkb" class="divp-list" style="overflow: auto"
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
									<% 
										List<BangDiemChiTiet> bangDiemChiTiets = (List<BangDiemChiTiet>)request.getAttribute("listBangDiemChiTiet");
										for(int i=0;i<bangDiemChiTiets.size();i++){
									 %>
									<tr>
										     <th scope="row"><%=i %></th>											
											<td><%= bangDiemChiTiets.get(i).getIdMonHoc() %></td>
											<td>
											<%
											ScoreStudentDAO adao = new ScoreStudentDAO();
											String idMon = bangDiemChiTiets.get(i).getIdMonHoc();
											MonHoc monHoc = adao.getTenMon(idMon);
											%>
											<%= monHoc.getTenMonhoc() %>
											</td>
											<td>
											<%
												double tongdiemhe10 = (bangDiemChiTiets.get(i).getDiemHe1()*0.2) + (bangDiemChiTiets.get(i).getDiemHe2()*0.3) + (bangDiemChiTiets.get(i).getDiemHe3()*0.5);
												
											%>
											<%= tongdiemhe10 %>
											</td>
											<td>
											<button style="margin-left: 25%;" type="button" class="btn btn-light px-5" data-toggle="modal" data-target="#myModalChiTiet" onclick="funcChiTiet('<%=bangDiemChiTiets.get(i).getIdBangDiemChiTiet() %>')">
							               <i class="bi bi-wrench-adjustable-circle"></i>
						                   </button>
						                   <input hidden="hidden" style=" width: 8%;" type="text" id="dataHe1_<%= bangDiemChiTiets.get(i).getIdBangDiemChiTiet()%>" value="<%= bangDiemChiTiets.get(i).getDiemHe1()%>">
						                   <input hidden="hidden" style=" width: 8%;" type="text" id="dataHe2_<%= bangDiemChiTiets.get(i).getIdBangDiemChiTiet()%>" value="<%= bangDiemChiTiets.get(i).getDiemHe2()%>">
						                   <input hidden="hidden" style=" width: 8%;" type="text" id="dataHe3_<%= bangDiemChiTiets.get(i).getIdBangDiemChiTiet()%>" value="<%= bangDiemChiTiets.get(i).getDiemHe3()%>">
						                   <input hidden="hidden" style=" width: 8%;" type="text" id="dataHe10_<%= bangDiemChiTiets.get(i).getIdBangDiemChiTiet()%>" value="<%= tongdiemhe10%>">
						                   <input hidden="hidden" style=" width: 10%;" type="text" name="dataIdChiTiet" id="dataId_<%= bangDiemChiTiets.get(i).getIdBangDiemChiTiet()%>" value="<%= bangDiemChiTiets.get(i).getIdBangDiem() %>">
						                   </td>
									</tr>
									<%}; %>
									
									
																	
									</tbody>
								</table>
							</div>
							<table width="100%" border="0" class="fixheader">
								<tbody>
								<%
								int lenght=0;
								double sum =0;
								double tongdiemhe10=0;
								
								ScoreStudentDAO scoreStudentDAO = new ScoreStudentDAO();
								List<BangDiemChiTiet> list=(List<BangDiemChiTiet>) request.getAttribute("listBangDiemChiTiet");
								for(int i=0; i<list.size();i++){

								%>
									<tr>
									
										<td align="left" width="30%" class="normal">
										<%
										 lenght = list.size();
										
										
										 tongdiemhe10 = (list.get(i).getDiemHe1()*0.2) + (list.get(i).getDiemHe2()*0.3) + (list.get(i).getDiemHe3()*0.5);
										 sum+= tongdiemhe10;
										
										%>
								
									</tr>
									<%} %>
									<tr>
									<td align="left" width="30%" class="normal">
									
									<%
									double tb = sum/lenght;
									%>
									Điểm trung bình học kỳ hệ 10:
									</td>
									<td align="left" width="10%" class="normal"><%=tb%>
									<td>
									</tr>
		
								</tbody>
							</table>
							
						</fieldset>
							
							
							</c:if>
							
						
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
							style="color: #000;">Điểm hệ 1: </label> <input type="text" readonly="readonly"
							id="txtDiemHe1" name="txtDiemHe1" style="width: 100%;">
					</div>
					<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Điểm hệ 2: </label> <input readonly="readonly"
							type="text" id="txtDiemHe2" name="txtDiemHe2"
							style="width: 100%;">
					</div>
					<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Điểm hệ 3: </label> <input type="text" readonly="readonly"
							id="txtDiemHe3" name="txtDiemHe3" style="width: 100%;">
					</div>
					<div class="form-group">
						<label for="message-text" class="col-form-label"
							style="color: #000;">Điểm HP hệ 10: </label> <input type="text" readonly="readonly"
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
	var diemHe10 = document.getElementById("dataHe10_"+ id).value;
	document.getElementById("txtDiemHe10").value = diemHe10;
	// 
	var idChiTietDiem = document.getElementById("dataId_"+ id).value;

}

/* function funcXem() {
	alert("hello");
	
} */
</script>
</body>
</html>