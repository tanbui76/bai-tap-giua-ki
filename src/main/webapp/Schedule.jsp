<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Arrays"%>
<%@page import="QuanliCLB.model.GiaoVien"%>
<%@page import="QuanliCLB.model.MonHoc"%>
<%@page import="QuanliCLB.model.PhanCongGiangDay"%>
<%@page import="java.util.List"%>
<%@page import="QuanliCLB.dao.ScheduleStudentDao"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="/QuanLiCLB/src/main/webapp/assets/fonts/FontAwesome.otf">
	<%@include file="includes/includeAdminStyle.jsp" %>
	<script>
		function addSub(tiethoc,tenmonhoc,giangvien,thu){
			var array = tiethoc.split(",");
			console.log(array);
			var vitrithu="";
			switch (thu){
				case 'Monday':
					vitrithu='thuhai';
					break;
				case 'Tuesday':
					vitrithu='thuba';
					break;
				case 'Wednesday':
					vitrithu='thutu';
					break;
				case 'Thursday':
					vitrithu='thunam';
					break;
				case 'Friday':
					vitrithu='thusau';
					break;
				case 'Saturday':
					vitrithu='chunhat';
					break;
			}
			var setup=vitrithu+array[0];
			var col = document.getElementById(setup);
			col.setAttribute("rowspan",array.length );
			col.innerHTML = tenmonhoc + "<br>"  + giangvien;
		}
		function loadTKB(){
			<%ScheduleStudentDao cdao = new ScheduleStudentDao();
			List<PhanCongGiangDay> lista = (List<PhanCongGiangDay>) session.getAttribute("list");
			if (lista != null) {
	for (int i = 0; i < lista.size(); i++) {
		String tiethoc = lista.get(i).getSoTietDay();
		String thu = cdao.getThuNgay(lista.get(i).getNgayGiangDay());
		MonHoc mh = cdao.getMonHoc(lista.get(i).getIdMonHoc());
		String tenmonhoc = mh.getTenMonhoc();
		String hotengv = cdao.getTenGiaoVien(lista.get(i).getIdGiaoVien());%>	
					addSub('<%=tiethoc%>','<%=tenmonhoc%>','<%=hotengv%>','<%=thu%>');
<%}
}%>
	}
</script>
<style>
h2 {
	text-align: center;
	color: #f8f9fa;
	font-size: 30px;
}
</style>
</head>
<body onload="<%= request.getParameter("getdata")%>">



<div id="wrapper">
		<%@include file="includes/sliderbar.jsp" %>
		<%@include file="includes/Topbar.jsp" %>
		<%@include file="scheduleStudent/Schedule.jsp" %>
		
	<%@include file="includes/script.jsp" %>
	</div>
</body>
</html>