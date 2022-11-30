<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<body>
	<div class="content-wrapper">
		<div class="container-fluid">
			<div class="card">
				<div class="card-body">
					<div class="row mt-3">
						<div class="col-lg-3">
							<!-- <button type="submit" class="btn btn-light px-5"
								data-toggle="modal" data-target="#myModal1">
								<i class="bi bi-person-add"></i>Thêm
							</button> -->
							<div>
							<span>Năm học</span>
							<select id="">
							    <option value="">Chọn năm học</option>
								<option value="2020-2021">2020-2021</option>
								<option value="2021-2022">2021-2022</option>
								<option value="2022-2023">2022-2023</option>
							</select>
							</div>
							
							<br>
							<div>
							<span>Học kỳ</span>
							<select id="" style="margin: 0 6%">
							<option value="">Chọn học kì</option>
								<option value="1">Kì 1</option>
								<option value="2">Kì 2</option>
							</select>
							</div>							
							<br>							
							<div>
							<span>Tuần</span>
							<select id="" style="margin: 0 11%">
							<option value="">Chọn tuần</option>
								<option value="1">Tuần 1</option>
								<option value="2">Tuần 2</option>
							</select>
							</div>

						</div>
						
						

						<div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
							aria-labelledby="exampleModalLabel" aria-hidden="true">
							<div class="modal-dialog" role="document"
								style="position: relative; top: 10%;">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel"
											style="font-size: 20px; font-weight: 600; color: #000;">Thêm
											môn học</h5>
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>
									<div class="modal-body">
										<form>
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">Tên môn học</label> <input type="text"
													id="recipient-name" style="width: 100%;">
											</div>
										</form>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-secondary"
											data-dismiss="modal">Close</button>
										<button type="button" class="btn btn-success" onclick="funcIn()">Thêm
											</button>	
									

									</div>
								</div>
							</div>
						</div>

						<div class="modal fade" id="myModal2" tabindex="-1" role="dialog"
							aria-labelledby="exampleModalLabel" aria-hidden="true">
							<div class="modal-dialog" role="document"
								style="position: relative; top: 10%;">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel"
											style="font-size: 20px; font-weight: 600; color: #000;">Cập
											nhật môn học</h5>
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>
									<div class="modal-body">
										<form>
											<div class="form-group">
												<label for="message-text" class="col-form-label"
													style="color: #000;">Tên môn học</label> <input type="text"
													id="recipient-name" style="width: 100%;">
											</div>
										</form>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-secondary"
											data-dismiss="modal">Close</button>
										<button type="button" class="btn btn-success" onclick="funcUp()">Cập
											nhật</button>
									</div>
								</div>
							</div>
						</div>


					</div>
				</div>
			</div>
	<div class="card">
        <div class="card-body">
            <h5 class="card-title">Quản lý điểm của sinh viên </h5>
            <div class="divp-list" style="overflow:auto">
                <table id="" style="border-collapse: collapse;" name="" width="100%" border="1" class="table-list fixheader">
                <thead>
                <tr>
                    <th rowspan="2" align="center" style="width: 55px;">Stt</th>
                    <th rowspan="2" align="center" style="width: 166px;">Mã SV</th>
                    <th rowspan="2" align="center" style="width: 20px;">Mã môn học</th>
                    <th rowspan="2" align="center" style="width: 40px;">Tên môn học</th>
                    <th rowspan="2" align="center" style="width: 180px;">Tên SV</th>
                    <th colspan="2" align="center" style="width: 66px;">Điểm</th>
                    <th colspan="2" align="center" style="width: 66px;">Hành động</th>
              
                </tr>
                <tr>
                    <th align="center" style="width: 80px;">Lần 1</th>
                    <th align="center" style="width: 80px;">Lần 2</th>                 
                </tr>
                </thead>
                <tbody>                             
                <tr>
                <th align="center" width="5%" class="">3</th>
                <td align="left" width="14%" class="">31131250</td>
                <td align="center" width="7%" class="">20-0102</td>
                <td align="left" class="">Giải tích thực và đại số tuyến tính</td>
                <td align="center" width="7%" class="">Hồ Thị Kiều Linh</td>               
                <td align="center" width="7%" class="">10</td>
                <td align="center" width="7%" class="">9,5</td>
        
               
                </tr>
                <tr class="alt">
                <th align="center" width="5%" class="">4</th>
                <td align="left" width="14%" class="">31231389</td>
                <td align="center" width="7%" class="">20-0102</td>
                <td align="left" class="">Giải tích thực và đại số tuyến tính</td>
                <td align="center" width="7%" class="">Bùi Nguyễn Nhật Tân</td>    
                <td align="center" width="7%" class="">10</td>           
                <td align="center" width="7%" class="">8,4</td>
                        
                </tr>                        
                </tbody>
            </table>
                <table id="fixedtableheader0" style="border-collapse: collapse; position: absolute; top: -356.6px; left: 0px; width: 1228px; display: none;" name="tb_xemketquahoctap_0" width="100%" border="1" class="table-list fixheader"><tbody><tr><th rowspan="2" align="center" style="width: 55px;">Stt</th><th rowspan="2" align="center" style="width: 166px;">Mã HP</th><th rowspan="2" align="center" style="width: 250px;">Tên học phần</th><th rowspan="2" align="center" style="width: 80px;">Nhóm</th><th rowspan="2" align="center" style="width: 80px;">ĐVHT</th><th colspan="2" align="center" style="width: 166px;">Điểm HP hệ 10</th><th colspan="2" align="center" style="width: 166px;">Điểm HP hệ 4</th><th rowspan="2" align="center" style="width: 55px;">N</th><th rowspan="2" align="center" style="width: 62px;">Chi tiết</th><th rowspan="2" align="center" style="width: 89px;">Phúc khảo</th></tr><tr class="alt"><th align="center" style="width: 80px;">Lần 1</th><th align="center" style="width: 80px;">Lần 2</th><th align="center" style="width: 80px;">Lần 1</th><th align="center" style="width: 80px;">Lần 2</th></tr></tbody></table></div>
               </div>
			</div>

		</div>
	</div>
	<script type="text/javascript">
   function funcIn(){	   
	   Swal.fire({
			position : 'center',
			icon : 'success',
			title : 'Thêm thành công',
			showConfirmButton : false,
			timer : 1500
		})
	}
   function funcUp() {
	   Swal.fire({
			position : 'center',
			icon : 'success',
			title : 'Cập nhật thành công',
			showConfirmButton : false,
			timer : 1500
		})	
}
   function funcDel() {
		Swal.fire({
			  title: 'Bạn có chắc chắn muốn xóa?',
			  text: "Bạn sẽ không thể khôi phục lại dữ liệu!",
			  icon: 'warning',
			  showCancelButton: true,
			  confirmButtonColor: '#3085d6',
			  cancelButtonColor: '#d33',
			  confirmButtonText: 'Xóa'
			}).then((result) => {
			  if (result.isConfirmed) {
			    Swal.fire(
			      'Đã xóa!',
			      'Xóa thành công',
			      'success'
			    )
			  }
			})
		
	}
   
		
	</script>
</body>
