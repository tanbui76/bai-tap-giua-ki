<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/QuanLiCLB/src/main/webapp/assets/fonts/FontAwesome.otf">
<style>
h2 {
	text-align: center;
	color: #f8f9fa;
	font-size: 30px;
}
</style>
</head>
<body>

	<div class="content-wrapper">
		<div class="container-fluid">
			<div class="card">
				<div class="card-body">
					<table class="mainbody" width="100%" border="0" cellpadding="0"
						cellspacing="0" align="center">
						<tbody>
							<tr>
								<td valign="top" style="padding: 0px; height: 300px;">
									<form action="" method="post">
										<h2>Thời khóa biểu sinh viên</h2>
										<table id="tb_sr_toggle" name="tb_sr_toggle" width="100%"
											class="soft fixheader">
											<tbody>
												<tr>
													<th align="right" style="padding: 0px;"
														class="toggle_search"><span title="Ẩn/Hiện bộ lọc">&nbsp;&nbsp;&nbsp;&nbsp;</span></th>
												</tr>
											</tbody>
										</table>

										<table name="" width="100%" style="margin: 0 26%;">
											<tbody>
												<tr name="tr_sr">
													<th align="right"><span>Năm Học:</span></th>
													<td align="left">
														<div id="div_sr_1">
															<select name="" id="">
															<option>Chọn năm học</option>
																<option>2022-2023</option>
																<option>2021-2022</option>
																<option>2020-2021</option>
															</select>
														</div>
													</td>

												</tr>
												<tr  id="">
													<th align="right"><span>Học Kỳ:</span></th>
													<td align="left">
														<div id="div_sr_2">
															<select name="">
															   <option value="1">Chọn học kỳ</option>
																<option value="1">1</option>
																<option value="2">2</option>
															</select>
														</div>
													</td>

												</tr>
												<tr name="tr_sr" id="tr_sr_3">

													<td align="left" colspan="2"></td>
												</tr>
												<tr>
													<th align="left" width="30%"></th>
													<td align="left" width="20%"></td>
													<td align="left" width="50%"></td>
													
												</tr>
											</tbody>
										</table>

										<div class="divp-list" style="overflow: auto; margin: 2% 0;">
											<table id="tb_index"
												style="border-collapse: collapse; display: table;"
												width="100%" border="1">
												<thead>
													<tr style="color: white; font-size: 18px;">
														<th align="center"
															style="width: 32px; border: 1px solid white;">STT</th>
														<th class="" style="width: 32px; border: 1px solid white;">Thứ</th>														
														<th align="center"
															style="width: 218px; border: 1px solid white;">Tên
															môn học</th>

														<th align="center"
															style="width: 144px; border: 1px solid white;">Tên
															giáo viên</th>
														<th align="center"
															style="width: 144px; border: 1px solid white;">Phòng
															học</th>
														<th align="center"
															style="width: 153px; border: 1px solid white;">Thời
															gian</th>

													</tr>
												</thead>
												<tbody>
													<tr class="alt">
														<th class="" style="border: 1px solid white;">1</th>
														<th class="" style="border: 1px solid white;">Thứ 2</th>
														<td class="" style="border: 1px solid white;">Thiết
															kế và lập trình web</td>
														<td class="" style="border: 1px solid white;">Mai Hà
															Thi</td>
														<td class="" style="border: 1px solid white;">A5-204</td>
														<td class="" style="border: 1px solid white;">2022-24-11
															15:30:00</td>
													</tr>
													<tr class="alt">
														<th class="" style="border: 1px solid white;">2</th>
														<th class="" style="border: 1px solid white;">Thứ 3</th>
														<td class="" style="border: 1px solid white;">Thiết
															kế và lập trình web</td>
														<td class="" style="border: 1px solid white;">Mai Hà
															Thi</td>
														<td class="" style="border: 1px solid white;">A5-204</td>
														<td class="" style="border: 1px solid white;">2022-24-11
															15:30:00</td>
													</tr>
												</tbody>
											</table>

										</div>
										
										<button type="button" class="btn btn-light"><i class="fa-solid fa-print"></i>In thời khóa biểu</button>
									</form>
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