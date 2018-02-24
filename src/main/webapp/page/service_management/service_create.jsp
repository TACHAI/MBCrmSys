<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.sql.Timestamp,java.util.List,com.rlg.crm.domain.ServeType,
			com.rlg.crm.domain.Customer"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">
<!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->

<link rel="shortcut icon"
	href="<%=request.getContextPath()%>/favicon.ico">
<link
	href="<%=request.getContextPath()%>/css/bootstrap.min.css?v=3.3.6"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/css/font-awesome.min.css?v=4.4.0"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/animate.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/style.css?v=4.1.0"
	rel="stylesheet">
<style type="text/css">
.myLabel1, .myLabel2, .myLabel3, .myLabel4, .myLabel5, .myLabel6 {
	visibility: hidden;
}
</style>
</head>
<body class="gray-bg top-navigation">
	<div class="wrapper wrapper-content animated fadeInRight">
		<div class="row border-bottom white-bg">
			<nav class="navbar navbar-static-top" role="navigation">
				<div class="navbar-header">
					<button aria-controls="navbar" aria-expanded="false"
						data-target="#navbar" data-toggle="collapse"
						class="navbar-toggle collapsed" type="button">
						<i class="fa fa-reorder"></i>
					</button>
					<a href="" class="navbar-brand">服务创建</a>
				</div>
				<div class="navbar-collapse collapse" id="navbar">
					<ul class="nav navbar-top-links navbar-right">
						<li><a id="save"> <i
								class="glyphicon glyphicon-floppy-disk"></i> 保存
						</a></li>
					</ul>
					<ul class="nav navbar-top-links navbar-right">
						<li><a href="login.html"> <i class="fa fa-question"></i>
								帮助
						</a></li>
					</ul>
				</div>
			</nav>
		</div>
		<div class="ibox float-e-margins">
		
			<div class="ibox-content">
				<form role="form" class="form-horizontal" id="myForm"
					action="<%=request.getContextPath()%>/addServe.doServe"
					method="post">

					<div class="form-group col-sm-6">
						<label for="ser_id" class="col-sm-4 control-label">编号：</label>
						<div class="col-sm-7">
							<input type="text" readonly name="ser_id" class="form-control"
								id="ser_id" />
						</div>
					</div>
					<div class="form-group col-sm-6">
						<label for="ser_type" class="col-sm-3 control-label">服务类型：</label>
						<div class="col-sm-8">
							<select id="ser_type" name="ser_type" class="form-control">
								<%
									List<ServeType> serTypes = (List<ServeType>) request.getAttribute("serTypes");
									if (serTypes != null) {
										for (ServeType serType : serTypes) {
								%>
								<option value="<%=serType.getSeId()%>"><%=serType.getSeName()%></option>
								<%
									}
									}
								%>

							</select>
						</div>
						<label class="myLabel1 control-label text-danger">*</label>
					</div>
					<div class="form-group"></div>
					<div class="form-group">
						<label for="ser_resume" class="col-sm-2 control-label">概要：</label>
						<div class="col-sm-9">
							<textarea style="resize: none" name="ser_resume" value=""
								class="form-control" rows="3" id="ser_resume" placeholder="概要"></textarea>
						</div>
						<label class="myLabel2 control-label text-danger">*</label>
					</div>

					<div class="form-group col-sm-6">
						<label for="ser_cus" class="col-sm-4 control-label">客户：</label>
						<div class="col-sm-7">
							<select id="ser_cus" name="ser_cus" class="form-control">
								<%
									List<Customer> customers = (List<Customer>) request.getAttribute("customers");
									if (customers != null) {
										for (Customer customer : customers) {
								%>
								<option value="<%=customer.getCusId()%>"><%=customer.getCusName()%></option>
								<%
									}
									}
								%>

							</select>
						</div>
						<label class="myLabel3 control-label text-danger">*</label>
					</div>
					<div class="form-group col-sm-6">
						<label for="ser_state" class="col-sm-3 control-label">状态：</label>
						<div class="col-sm-8">
							<input type="text" value="新创建" name="ser_state"
								class="form-control" id="ser_state" readonly />
						</div>
					</div>
					<div class="form-group"></div>
					<div class="form-group">
						<label for="ser_request" class="col-sm-2 control-label">服务请求：</label>
						<div class="col-sm-9">
							<textarea style="resize: none" name="ser_request" value=""
								class="form-control" rows="3" id="ser_request"
								placeholder="服务请求"></textarea>
						</div>
						<label class="myLabel4 control-label text-danger">*</label>
					</div>
					<div class="form-group">
						<label for="ser_creater_name" class="col-sm-2 control-label">创建人：</label>
						<div class="col-sm-5">
							<input type="text" value="断剑回炉" name="ser_creater_name"
								class="form-control" id="ser_creater_name" />
						</div>
						<label class="myLabel5  control-label text-danger">*</label>
					</div>
					<div class="form-group">
						<label for="ser_creater_date" class="col-sm-2 control-label">创建时间：</label>
						<div class="col-sm-5">
							<input type="text"
								value="<%=new Timestamp(System.currentTimeMillis())%>"
								name="ser_creater_date" class="form-control"
								id="ser_creater_date" />
						</div>
						<label class="myLabel6  control-label text-danger">*</label>
					</div>
					<input type="submit" style="display: none;" id="submit" />
				</form>
			</div>

		</div>
	</div>
	<!-- 全局js -->
	<script src="<%=request.getContextPath()%>/js/jquery.min.js?v=2.1.4"></script>
	<script
		src="<%=request.getContextPath()%>/js/bootstrap.min.js?v=3.3.6"></script>
</body>
</html>
<script type="text/javascript">
	$("#save").click(function() {

		//var ser_type = document.getElementById("ser_type").value;  
		//var ser_resume = document.getElementById("ser_resume").value;  
		//var ser_cus_id = document.getElementById("ser_cus_id").value;  
		//var ser_request = document.getElementById("ser_request").value;  
		//var ser_allot_name = document.getElementById("ser_allot_name").value;  
		//var ser_allot_date = document.getElementById("ser_allot_date").value; 

		if ($("#ser_type").val() == "") {

			//$(".myLabel1").text("用户名不能为空！");
			//$(".myLabel1").css("visibility","visible");
			alert("服务类型不能为空!");
			return false;
		} else if ($("#ser_resume").val() == "") {
			//$(".myLabel2").css("visibility","visible");
			alert("概要不能为空!");
			return false;
		} else if ($("#ser_cus_id").val() == "") {
			//$(".myLabel3").css("visibility","visible");
			alert("客户不能为空!");
			return false;
		} else if ($("#ser_request").val() == "") {
			//$(".myLabel4").css("visibility","visible");
			alert("服务请求不能为空!");
			return false;
		} else if ($("#ser_allot_name").val() == "") {
			//$(".myLabel5").css("visibility","visible");
			alert("创建人不能为空!");
			return false;
		} else if ($("#ser_allot_date").val() == "") {
			//$(".myLabel6").css("visibility","visible");
			alert("创建时间不能为空!");
			return false;
		}
		$("#submit").click();
		alert("保存成功！");
	});
</script>