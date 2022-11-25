<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h2 {
	text-align: center;
	color: #4898dd;
}

</style>
</head>
<body>
    <div class="content-wrapper">
        <div class="container-fluid">
            <table class="mainbody" width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
                <tbody>
                    <tr>
                        <td valign="top" style="padding: 0px; height: 300px;">       
                            <form action="" method="post">
                                <h2>Thời khóa biểu sinh viên </h2>       
                                <table id="tb_sr_toggle" name="tb_sr_toggle" width="100%" class="soft fixheader">
                                    <tbody>
                                        <tr>
                                            <th align="right" style="padding:0px;" class="toggle_search"><span class="trigger_sr pointer" srn="tb_sr" title="Ẩn/Hiện bộ lọc">&nbsp;&nbsp;&nbsp;&nbsp;</span></th>
                                        </tr>
                                    </tbody>
                                </table>
                                
                                <table name="" width="100%" style="margin: 0 28%;">
                                    <tbody>
                                        <tr name="tr_sr">
                                            <th align="right">
                                                <select name="">
                                                    <option value="" selected="">Năm học</option>
                                                    <option value="">Học kỳ</option>
                                                </select></th>
                                            <td align="left" nowrap="true">
                                                <div id="div_sr_1">
                                                    <select name="" id="">
                                                        <option value="2022">2022-2023</option>
                                                        <option value="2021" selected="">2021-2022</option>
                                                        <option value="2020">2020-2021</option>
                                                    </select>
                                                </div>
                                            </td>
                                            <td align="left" width="30%"></td>
                                        </tr>
                                        <tr name="" id="">
                                            <th align="right"><select name="">
                                                    <option value="">Năm học</option>
                                                    <option value="" selected="">Học kỳ</option>
                                                </select></th>
                                            <td align="left">
                                                <div id="div_sr_2">
                                                    <select name="">
                                                        <option value="1" selected="">1</option>
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
                                            <td align="left" width="50%">
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                                
                                <div class="divp-list" style="overflow:auto">
                                    <table id="tb_index" style="border-collapse: collapse; display: table;" width="100%" border="1">
                                        <thead>
                                            <tr>
                                                <th align="center" style="width: 32px; border: 1px solid white;">STT</th>
                                                <th align="center" style="width: 102px; border: 1px solid white;">Mã khóa học
                                                </th>
                                                <th align="center" style="width: 218px; border: 1px solid white;">Tên bài học
                                                </th>
                                               
                                                <th align="center" style="width: 144px; border: 1px solid white;">Tên giáo viên
                                                </th>
                                                <th align="center" style="width: 153px; border: 1px solid white;">Thời gian</th>
         
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr class="alt">
                                                <th class="" style="border: 1px solid white;">1</th>
                                                <td class="center" style="border: 1px solid white;">H01</td>
                                                <td class="" style="border: 1px solid white;">Thiết kế và lập trình web</td>
                                                <td class="" style="border: 1px solid white;">Mai Hà Thi</td>
                                                <td class="" style="border: 1px solid white;">2022-24-11 15:30:00</td>
                                            </tr>
                                            <tr class="alt">
                                                <th class="" style="border: 1px solid white;">2</th>
                                                <td class="center" style="border: 1px solid white;">H01</td>
                                                <td class="" style="border: 1px solid white;">Thiết kế và lập trình web</td>                                       
                                                <td class="" style="border: 1px solid white;">Mai Hà Thi</td>
                                                <td class="" style="border: 1px solid white;">2022-24-11 15:30:00</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    
                                </div>                    
                            </form>
                        </td>
                    </tr>
                </tbody>
            </table>
    </div>
    </div>
</body>
</html>