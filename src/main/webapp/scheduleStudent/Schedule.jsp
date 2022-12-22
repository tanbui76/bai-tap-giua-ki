<%@page import="QuanliCLB.model.PhanCongGiangDay"%>
<%@page import="java.util.List"%>
<%@page import="QuanliCLB.dao.ScheduleStudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="/QuanLiCLB/src/main/webapp/assets/fonts/FontAwesome.otf">
<style>
h2 {
	text-align: center;
	color: #f8f9fa;
	font-size: 30px;
}
</style>
</head>
<body>
	<% 
		ScheduleStudentDao scheduleStudentDao = new ScheduleStudentDao(); 
		List<PhanCongGiangDay> list = (List<PhanCongGiangDay>)session.getAttribute("list");
	%>
	<div class="content-wrapper">
		<div class="container-fluid">
			<div class="card">
				<div class="card-body">
					<table class="mainbody" width="100%" border="0" cellpadding="0"
						cellspacing="0" align="center">
						<tbody>
							<tr>
								<td valign="top" style="padding: 0px; height: 300px;">


									<h2>Thời khóa biểu sinh viên</h2> <c:out value="${getId}">

									</c:out>
									<table id="tb_sr_toggle" name="tb_sr_toggle" width="100%"
										class="soft fixheader">
										<tbody>
											<tr>
												<th align="right" style="padding: 0px;"
													class="toggle_search"><span title="Ẩn/Hiện bộ lọc">&nbsp;&nbsp;&nbsp;&nbsp;</span></th>
											</tr>
										</tbody>
									</table>

									<form action="GetScheduleStudentServlet" method="post">
										<table name="" width="100%" style="margin: 0 26%;">
											<tbody>
												<tr name="tr_sr">
													<th align="right"><span>Năm Học:</span></th>
													<td align="left">
														<div id="div_sr_1">
															<select name="cbbNamHoc">
																<option style="background: #fff !important"
																	selected="selected">Chọn năm học</option>
																<c:forEach var="item" items="${listNienKhoa}">
																	<option style="background: #fff !important"
																		value="${item.idNienKhoa}">${item.namNienKhoa}</option>
																</c:forEach>
															</select>
														</div>
													</td>

												</tr>
												<tr id="">
													<th align="right"><span>Học Kỳ:</span></th>
													<td align="left">
														<div id="div_sr_2">
															<select name="cbbHocKi">
																<option style="background: #fff !important"
																	selected="selected">Chọn học kỳ</option>
																<c:forEach var="item" items="${listHocKi}">
																	<option style="background: #fff !important"
																		value="${item.idHocKi}">${item.tenHocKi}</option>
																</c:forEach>
															</select>
														</div>
													</td>
												</tr>
												<tr id="">
													<th align="right"><span>Tuần:</span></th>
													<td align="left">
														<div id="div_sr_2">
															<select name="cbbTuan">
																<option style="background: #fff !important"
																	selected="selected">Chọn tuần học</option>
																<c:forEach var="item" items="${listTuanHoc}">
																	<option style="background: #fff !important"
																		value="${item.tuanId}">${item.tuanName}</option>
																</c:forEach>
															</select>
														</div>
													</td>

												</tr>
												<tr name="tr_sr" id="tr_sr_3">

													<td align="left">
														<button type="submit" class="btn btn-info">Tìm</button>
													</td>
												</tr>

											</tbody>
										</table>
									</form> <c:if test="${listlenght ==0}">
										<p>Không có dữ liệu</p>
									</c:if> <c:if test="${listlenght !=0}">
										<div class="divp-list" style="overflow: auto; margin: 2% 0;">
											<table>
												<thead>
													<tr>
														<th width="2%" align="center"
															style="border: 1px solid gray;">Tiết</th>
														<th width="14%" align="center"
															style="border: 1px solid gray;">Thứ 2</th>
														<th width="14%" align="center"
															style="border: 1px solid gray;">Thứ 3</th>
														<th width="14%" align="center"
															style="border: 1px solid gray;">Thứ 4</th>
														<th width="14%" align="center"
															style="border: 1px solid gray;">Thứ 5</th>
														<th width="14%" align="center"
															style="border: 1px solid gray;">Thứ 6</th>
														<th width="14%" align="center"
															style="border: 1px solid gray;">Thứ 7</th>
														<th width="14%" align="center"
															style="border: 1px solid gray;">Chủ nhật</th>
													</tr>
												</thead>
												<tbody>
													
													<tr class="body">
													<% for(int i=0;i<list.size();i++){ %>
														
														<td align="left" style="border: 1px solid gray;">1</td>
														<td align="left" style="border: 1px solid gray;">
														<% 
															if(scheduleStudentDao.getThuNgay(list.get(i).getNgayGiangDay())=="Monday"){ 
																%> ở đây<%
															}
														%>
														</td>
														
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"
															rowspan="3"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"
															rowspan="3"></td>
														<td align="left" style="border: 1px solid gray;"></td>
													<%} %>
													</tr>
													<tr class="body">
														<td align="left" style="border: 1px solid gray;">2</td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
													</tr>
													<tr class="body">
														<td align="left" style="border: 1px solid gray;">3</td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"
															rowspan="2"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
													</tr>
													<tr class="body">
														<td align="left" style="border: 1px solid gray;">4</td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
													</tr>
													<tr class="body">
														<td align="left" style="border: 1px solid gray;">5</td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
													</tr>
													<tr class="body">
														<td colspan="8" style="border: 1px solid gray;">&nbsp;</td>
													</tr>
													<tr class="body">
														<td align="left" style="border: 1px solid gray;">6</td>
														<td align="left" style="border: 1px solid gray;"
															rowspan="4">1</td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"
															rowspan="2"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
													</tr>
													<tr class="body">
														<td align="left" style="border: 1px solid gray;">7</td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
													</tr>
													<tr class="body">
														<td align="left" style="border: 1px solid gray;">8</td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
													</tr>
													<tr class="body">
														<td align="left" style="border: 1px solid gray;">9</td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"
															rowspan="2">31221010 - 20-0103<br>An toàn thông
															tin<br>Phòng: A5-207
														</td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
													</tr>
													<tr class="body">
														<td align="left" style="border: 1px solid gray;">10</td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
														<td align="left" style="border: 1px solid gray;"></td>
													</tr>
												</tbody>
											</table>

										</div>

									</c:if>










									<button type="button" class="btn btn-light">
										<i class="fa-solid fa-print"></i>In thời khóa biểu
									</button>

								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>

		</div>
	</div>
</body>
</html>