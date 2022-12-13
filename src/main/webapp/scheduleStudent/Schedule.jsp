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
										<form action="" method="get">
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
										</form>

										

										<div class="divp-list" style="overflow: auto; margin: 2% 0;">
											 <table id="">
        <thead>
        <tr>
        <th width="2%" align="center" style="border: 1px solid gray;">Tiết</th>
        <th width="14%" align="center" style="border: 1px solid gray;">Thứ 2</th>
        <th width="14%" align="center" style="border: 1px solid gray;">Thứ 3</th>
        <th width="14%" align="center" style="border: 1px solid gray;">Thứ 4</th>
        <th width="14%" align="center" style="border: 1px solid gray;">Thứ 5</th>
        <th width="14%" align="center" style="border: 1px solid gray;">Thứ 6</th>
        <th width="14%" align="center" style="border: 1px solid gray;">Thứ 7</th>
        <th width="14%" align="center" style="border: 1px solid gray;">Chủ nhật</th>
        </tr>
        </thead><tbody><tr class="body">
        <td align="left" style="border: 1px solid gray;">1</td>
        <td align="left" style="border: 1px solid gray;"></td>
        <td align="left" style="border: 1px solid gray;"></td>
        <td align="left" style="border: 1px solid gray;" rowspan="3">31231755 - 20-0103<br>Thiết kế và lập trình web<br>Phòng: B3-405</td>
        <td align="left" style="border: 1px solid gray;"></td>
        <td align="left" style="border: 1px solid gray;"></td>
        <td align="left" style="border: 1px solid gray;" rowspan="3">31231398 - 20-0101<br>Lập trình mạng<br>Phòng: B3-201</td>
        <td align="left" style="border: 1px solid gray;"></td>
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
        <td align="left" style="border: 1px solid gray;" rowspan="2">31121101 - 20-0102<br>Công nghệ phần mềm<br>Phòng: A5-206</td>
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
        <td align="left" style="border: 1px solid gray;" rowspan="4">31241283 - 20-0103<br>Hệ quản trị cơ sở dữ liệu<br>Phòng: C3.201</td>
        <td align="left" style="border: 1px solid gray;"></td>
        <td align="left" style="border: 1px solid gray;" rowspan="2">21221904 - 20-0113<br>Lịch sử Đảng Cộng sản Việt Nam<br>Phòng: B3-202</td>
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
        <td align="left" style="border: 1px solid gray;" rowspan="2">31221010 - 20-0103<br>An toàn thông tin<br>Phòng: A5-207</td>
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