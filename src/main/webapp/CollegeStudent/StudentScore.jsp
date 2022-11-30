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
					<form id="frmMain" name="frmMain" method="post">
						<h3 class="result" style="text-align: center; color: white">Kết
							quả học tập sinh viên</h3>
						<table width="100%" class="soft">
							<tbody>
								<tr>
									<td align="right" width="40%" style="font-size: 20px;">Năm
										học - Học kỳ:</td>
									<td align="left">
									<select>
											<option value="" selected="">Tất cả</option>
											<option value="2022">2022-2023</option>
											<option value="2021">2021-2022</option>
											<option value="2020">2020-2021</option>
									</select>
									 <select "style="width: 120px;">
											<option value="" selected="">Tất cả</option>
											<option value="1">1</option>
											<option value="2">2</option>
											<option value="3">Hè</option>
									</select></td>
								</tr>
								<tr>
									<td align="center" colspan="2"><input type="button"
										name="btnSave" id="btnSave" value="Xem" onclick="xem()">
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
								<table id="tb_xemketquahoctap_0"
									style="border-collapse: collapse;" name="tb_xemketquahoctap_0"
									width="100%" border="1" class="table-list fixheader">
									<thead>
										<tr class="table">
											<th rowspan="2" align="center" style="width: 55px;">Stt</th>
											<th rowspan="2" align="center" style="width: 166px;">Mã
												môn học</th>
											<th rowspan="2" align="center" style="width: 250px;">Tên
												môn học</th>
											<th rowspan="2" align="center" style="width: 80px;">Nhóm</th>
											<th colspan="2" align="center" style="width: 166px;">Điểm
												HP hệ 10</th>
											<th colspan="2" align="center" style="width: 166px;">Điểm
												HP hệ 4</th>
											<th rowspan="2" align="center" style="width: 62px;">Chi
												tiết
											</th>
										</tr>
										<tr class="alt">
                                            <th align="center" style="width: 80px;">Lần 1</th>
                                            <th align="center" style="width: 80px;">Lần 2</th>
                                            <th align="center" style="width: 80px;">Lần 1</th>
                                            <th align="center" style="width: 80px;">Lần 2</th>
                                        </tr>
									</thead>
									<tbody>
										<tr class="alt">
											<th align="center" width="5%" class="">1</th>
											<td align="left" width="14%" class="">31121994</td>
											<td align="left" class="">Thiết kế lập trình Web</td>
											<td align="center" width="7%" class="">20-0102</td>
											<td align="center" width="7%" class="">8,8</td>
											<td align="center" width="7%" class=""></td>
											<td align="center" width="7%" class="">A</td>
											<td align="center" width="7%" class=""></td>
											<td align="center" width="7%" class=""><a href="DetailScore.jsp">Chitiet1</a></td>
										</tr>
										<tr>
											<th align="center" width="5%" class="">2</th>
											<td align="left" width="14%" class="">31131250</td>
											<td align="left" class="">Lập trình C/C++ căn bản</td>
											<td align="center" width="7%" class="">20-0102</td>
											<td align="center" width="7%" class="">9,0</td>
											<td align="center" width="7%" class=""></td>
											<td align="center" width="7%" class="">A</td>
											<td align="center" width="7%" class=""></td>
											<td align="center" width="7%" class=""><a href="DetailScore2.jsp">Chitiet2</a></td>

										</tr>
										<tr class="alt">
											<th align="center" width="5%" class="">3</th>
											<td align="left" width="14%" class="">31231389</td>
											<td align="left" class="">Lập trình Java cơ bản</td>
											<td align="center" width="7%" class="">20-0102</td>
											<td align="center" width="7%" class="">8,1</td>
											<td align="center" width="7%" class=""></td>
											<td align="center" width="7%" class="">B</td>
											<td align="center" width="7%" class=""></td>
											<td align="center" width="7%" class=""><a href="./">Chitiet3</a></td>
										</tr>
										<tr>
											<th align="center" width="5%" class="">4</th>
											<td align="left" width="14%" class="">31231447</td>
											<td align="left" class="">Lập trình Java nâng cao</td>
											<td align="center" width="7%" class="">20-0102</td>
											<td align="center" width="7%" class="">8,7</td>
											<td align="center" width="7%" class=""></td>
											<td align="center" width="7%" class="">A</td>
											<td align="center" width="7%" class=""></td>
											<td align="center" width="7%" class=""><a href="./">Chitiet4</a></td>

										</tr>
										<tr class="alt">
											<th align="center" width="5%" class="">5</th>
											<td align="left" width="14%" class="">31231905</td>
											<td align="left" class="">Cấu trúc dữ liệu</td>
											<td align="center" width="7%" class="">20-0102</td>
											<td align="center" width="7%" class="">7,0</td>
											<td align="center" width="7%" class=""></td>
											<td align="center" width="7%" class="">B</td>
											<td align="center" width="7%" class=""></td>
											<td align="center" width="7%" class=""><a href="./">Chitiet5</a></td>
										</tr>
										<tr>
											<th align="center" width="5%" class="">6</th>
											<td align="left" width="14%" class="">31331980</td>
											<td align="left" class="">Cơ sở dữ liệu</td>
											<td align="center" width="7%" class="">20-0101</td>
											<td align="center" width="7%" class="">9,7</td>
											<td align="center" width="7%" class=""></td>
											<td align="center" width="7%" class="">A</td>
											<td align="center" width="7%" class=""></td>
											<td align="center" width="7%" class=""><a href="./">Chitiet6</a></td>
										</tr>
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
</body>
</html>