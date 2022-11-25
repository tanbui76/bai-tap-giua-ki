<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="content-wrapper">
        <div class="container-fluid">
            <div class="card">
                <div class="card-body">
                	<div class="col-lg-2">
                		<a href="Score.jsp">
                			<button type="submit" class="btn btn-light px-5" >
							<i class="bi bi-person-x"></i> Trở về
							</button>
      					</a>
					</div>
                    <table width="50%" align="center" style="background-color: rgb(156, 156, 233);;">
                        <tbody>
                            <tr>
                                <td colspan="1">
                                    <fieldset class="title" style="text-align: center;">
                                        <div id="chitiettrangthai">
                                            <table id="tb_frmtt" name="tb_frmtt" width="100%" border="1" class="table-list fixheader" >
                                                    <div style="font-size: 20px; color: white; margin: 10px;"><strong>Chi tiết điểm môn học</strong> </div>
                                                <tbody>
                                                    <tr>
                                                        <td align="right" width="30%" style="padding: 2%;">Điểm bộ phận 1
                                                        </td>
                                                        <td align="left">10,0</td>
                                                    </tr>
                                                    <tr>
                                                        <td align="right" width="30%" style="padding: 2%;">Điểm giữa kỳ</td>
                                                        <td align="left">9,0</td>
                                                    </tr>
                                                    <tr>
                                                        <td align="right" width="30%" style="padding: 2%;">Điểm thi kết thúc
                                                        </td>
                                                        <td align="left">8,0</td>
                                                    </tr>
                                                    <tr>
                                                        <td align="right" width="30%" class="bold" style="padding: 2%;">Điểm
                                                            HP hệ 10</td>
                                                        <td align="left" class="bold">8,7</td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </fieldset>
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