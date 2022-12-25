<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="content-wrapper ">
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
											<th align="right" style="padding: 0px;" class="toggle_search"><span
												title="Ẩn/Hiện bộ lọc">&nbsp;&nbsp;&nbsp;&nbsp;</span></th>
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
													<td align="left" style="border: 1px solid gray;">1</td>
													<td align="left" id="thuhai1"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thuba1"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thutu1"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thunam1"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thusau1"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thubay1"
														style="border: 1px solid gray;"></td>
													<td align="left" id="chunhat1"
														style="border: 1px solid gray;"></td>
												</tr>
												<tr class="body">
													<td align="left" style="border: 1px solid gray;">2</td>
													<td align="left" id="thuhai2"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thuba2"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thutu2"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thunam2"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thusau2"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thubay2"
														style="border: 1px solid gray;"></td>
													<td align="left" id="chunhat2"
														style="border: 1px solid gray;"></td>
												</tr>
												<tr class="body">
													<td align="left" style="border: 1px solid gray;">3</td>
													<td align="left" id="thuhai3"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thuba3"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thutu3"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thunam3"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thusau3"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thubay3"
														style="border: 1px solid gray;"></td>
													<td align="left" id="chunhat3"
														style="border: 1px solid gray;"></td>
												</tr>
												<tr class="body">
													<td align="left" style="border: 1px solid gray;">4</td>
													<td align="left" id="thuhai4"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thuba4"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thutu4"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thunam4"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thusau4"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thubay4"
														style="border: 1px solid gray;"></td>
													<td align="left" id="chunhat4"
														style="border: 1px solid gray;"></td>
												</tr>
												<tr class="body">
													<td align="left" style="border: 1px solid gray;">5</td>
													<td align="left" id="thuhai5"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thuba5"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thutu5"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thunam5"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thusau5"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thubay5"
														style="border: 1px solid gray;"></td>
													<td align="left" id="chunhat5"
														style="border: 1px solid gray;"></td>
												</tr>
												<tr class="body">
													<td colspan="8" style="border: 1px solid gray;">&nbsp;</td>
												</tr>
												<tr class="body">
													<td align="left" style="border: 1px solid gray;">6</td>
													<td align="left" id="thuhai6"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thuba6"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thutu6"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thunam6"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thusau6"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thubay6"
														style="border: 1px solid gray;"></td>
													<td align="left" id="chunhat6"
														style="border: 1px solid gray;"></td>
												</tr>
												<tr class="body">
													<td align="left" style="border: 1px solid gray;">7</td>
													<td align="left" id="thuhai7"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thuba7"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thutu7"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thunam7"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thusau7"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thubay7"
														style="border: 1px solid gray;"></td>
													<td align="left" id="chunhat7"
														style="border: 1px solid gray;"></td>
												</tr>
												<tr class="body">
													<td align="left" style="border: 1px solid gray;">8</td>
													<td align="left" id="thuhai8"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thuba8"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thutu8"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thunam8"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thusau8"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thubay8"
														style="border: 1px solid gray;"></td>
													<td align="left" id="chunhat8"
														style="border: 1px solid gray;"></td>
												</tr>
												<tr class="body">
													<td align="left" style="border: 1px solid gray;">9</td>
													<td align="left" id="thuhai9"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thuba9"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thutu9"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thunam9"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thusau9"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thubay9"
														style="border: 1px solid gray;"></td>
													<td align="left" id="chunhat9"
														style="border: 1px solid gray;"></td>
												</tr>
												<tr class="body">
													<td align="left" style="border: 1px solid gray;">10</td>
													<td align="left" id="thuhai10"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thuba10"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thutu10"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thunam10"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thusau10"
														style="border: 1px solid gray;"></td>
													<td align="left" id="thubay10"
														style="border: 1px solid gray;"></td>
													<td align="left" id="chunhat10"
														style="border: 1px solid gray;"></td>
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
