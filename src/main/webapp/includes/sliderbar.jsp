<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="sidebar-wrapper" data-simplebar=""
	data-simplebar-auto-hide="true">
	<div class="brand-logo">
		<a href="index.html">
			<h5 class="logo-text">QUẢN LÍ CLB TIN HỌC</h5>
		</a>
	</div>
	<ul class="sidebar-menu do-nicescrol">
		<c:if test="${tk.phanQuyen==1}">
			<li class="sidebar-header">CHỨC NĂNG QUẢN LÍ</li>
			<li><a href="FirstRun"> <i class="zmdi zmdi-view-dashboard"></i>
					<span>Trang chủ</span>
			</a></li>
			<!--  <li><a href="icons.html"> <i class="zmdi zmdi-invert-colors"></i>
				<span>UI Icons</span>
		</a></li>

		<li><a href="forms.html"> <i
				class="zmdi zmdi-format-list-bulleted"></i> <span>Forms</span>
		</a></li>
		-->


			<!-- <li><a href="Score.jsp"> <i class="zmdi zmdi-grid"></i> <span>Quản lí điểm</span> -->
			<li><a href="ScoreStudentServlet"> <i class="zmdi zmdi-grid"></i>
					<span>Bảng điểm chi tiết</span>
			</a></li>

			<li><a href="LoadDataScheduleServlet"> <i
					class="zmdi zmdi-calendar-check"></i> <span>Thời khóa biểu
						sinh viên</span> <!-- <small
				class="badge float-right badge-light">New</small> -->
			</a></li>
			<li><a href="TeacherSchedule.jsp"> <i
					class="zmdi zmdi-calendar-check"></i> <span>Thời khóa biểu
						giáo viên</span> <!-- <small
				class="badge float-right badge-light">New</small> -->
			</a></li>
			<!-- 
			<li><a href="profile.html"> <i class="zmdi zmdi-face"></i> <span>Profile</span>
		</a></li>

		<li><a href="login.html" target="_blank"> <i
				class="zmdi zmdi-lock"></i> <span>Login</span>
		</a></li>

		<li><a href="register.html" target="_blank"> <i
				class="zmdi zmdi-account-circle"></i> <span>Registration</span>
		</a></li>
		 -->


			<li class="sidebar-header">THÔNG TIN TÀI KHOẢN</li>
			<li><a href="CourseListServlet"><i
					class="zmdi zmdi-coffee text-danger"></i> <span>Quản lý môn
						học</span></a></li>
			<li><a href="StudentListServlet"><i
					class="zmdi zmdi-chart-donut text-success"></i> <span>Quản
						lí sinh viên</span></a></li>
			<li><a href="TeacherListServlet"><i
					class="zmdi zmdi-share text-info"></i> <span>Quản lí giáo
						viên</span></a></li>
			<li><a href="Mark.jsp"><i class="zmdi zmdi-share text-info"></i>
					<span>Quản lí điểm của sinh viên</span></a></li>
			<li><a href="ImportDownload.jsp"><i
					class="zmdi zmdi-share text-info"></i> <span>Upload File</span></a></li>
			<li><a href="AccountServlet"><i
					class="zmdi zmdi-chart-donut text-success"></i> <span>Quản
						lí tài khoản</span></a></li>
			<li><a href="PermissionDataServlet"><i
					class="zmdi zmdi-chart-donut text-success"></i> <span>Quản
						lí phân quyền</span></a></li>
		</c:if>
		<c:if test="${tk.phanQuyen==2}">
		
		<li class="sidebar-header">CHỨC NĂNG QUẢN LÍ</li>
		<c:forEach var="item" items="${listTcPermission}" varStatus="i">
		<li><a href="${item.linkForm }"> <i
					class="zmdi zmdi-calendar-check"></i> <span>${item.tenModule }</span> <!-- <small
				class="badge float-right badge-light">New</small> 
			</a></li>
	<!-- 		<li><a href="FirstRun"> <i class="zmdi zmdi-view-dashboard"></i>
					<span>Trang chủ</span>
			</a></li>
			<li><a href="ScoreStudentServlet"> <i class="zmdi zmdi-grid"></i>
					<span>Bảng điểm chi tiết</span>
			</a></li>

			<li><a href="LoadDataScheduleServlet"> <i
					class="zmdi zmdi-calendar-check"></i> <span>Thời khóa biểu
						sinh viên</span> <!-- <small
				class="badge float-right badge-light">New</small> 
			</a></li>
			<li><a href="TeacherSchedule.jsp"> <i
					class="zmdi zmdi-calendar-check"></i> <span>Thời khóa biểu
						giáo viên</span> <!-- <small
				class="badge float-right badge-light">New</small> 
			</a></li>
 			-->
		</c:forEach>
		</c:if>
	<c:if test="${tk.phanQuyen==3}">
		
		<li class="sidebar-header">CHỨC NĂNG QUẢN LÍ</li>
		<c:forEach var="item" items="${listStPermission}" varStatus="i">
		<li><a href="${item.linkForm }"> <i
					class="zmdi zmdi-calendar-check"></i> <span>${item.tenModule }</span> <!-- <small
				class="badge float-right badge-light">New</small> 
			</a></li>
	<!-- 		<li><a href="FirstRun"> <i class="zmdi zmdi-view-dashboard"></i>
					<span>Trang chủ</span>
			</a></li>
			<li><a href="ScoreStudentServlet"> <i class="zmdi zmdi-grid"></i>
					<span>Bảng điểm chi tiết</span>
			</a></li>

			<li><a href="LoadDataScheduleServlet"> <i
					class="zmdi zmdi-calendar-check"></i> <span>Thời khóa biểu
						sinh viên</span> <!-- <small
				class="badge float-right badge-light">New</small> 
			</a></li>
			<li><a href="TeacherSchedule.jsp"> <i
					class="zmdi zmdi-calendar-check"></i> <span>Thời khóa biểu
						giáo viên</span> <!-- <small
				class="badge float-right badge-light">New</small> 
			</a></li>
 			-->
		</c:forEach>
		</c:if>


	</ul>

</div>