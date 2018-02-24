<%@page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import=" com.rlg.crm.domain.Linkman"%>
<%@page import="java.util.List,
				java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">

<title>联系人</title>
<!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->

<link rel="shortcut icon" href="favicon.ico">
<link
	href="<%=request.getContextPath()%>/css/bootstrap.min.css?v=3.3.6"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/css/font-awesome.min.css?v=4.4.0"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/animate.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/css/plugins/bootstrap-table/bootstrap-table.min.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/style.css?v=4.1.0"
	rel="stylesheet">
</head>
<body class="gray-bg top-navigation">
	<%
		Linkman linkman = (Linkman) request.getAttribute("linkman");
	%>>
	<div id="wrapper">
		<div id="page-wrapper" class="gray-bg">
			<div class="row border-bottom white-bg">
				<nav class="navbar navbar-static-top" role="navigation">
					<div class="navbar-header">
						<button aria-controls="navbar" aria-expanded="false"
							data-target="#navbar" data-toggle="collapse"
							class="navbar-toggle collapsed" type="button">
							<i class="fa fa-reorder"></i>
						</button>
						<a href="cusManageUpdate.html" class="navbar-brand">客户信息管理管理</a>
					</div>
					<div class="navbar-collapse collapse" id="navbar">
						<ul class="nav navbar-top-links navbar-right">
							<li><a id="save"> <i class="fa fa-sign-out"></i> 保存
							</a></li>
						</ul>
						<ul class="nav navbar-top-links navbar-right">
							<li><a id="back"> <i class="fa fa-sign-out"></i> 返回
							</a></li>
						</ul>
						<ul class="nav navbar-top-links navbar-right">
							<li><a href="login.html"> <i class="fa fa-sign-out"></i>
									帮助
							</a></li>
						</ul>
					</div>
				</nav>
			</div>
			<div class="wrapper wrapper-content">
				<div class="container">
					<div class="row">
						<div class="col-lg-12">
							<div class="ibox float-e-margins">
								<div class="ibox-title">
									<h5>新建客户联系</h5>
								</div>

								<div class="ibox-content">
									<form role="form" class="form-horizontal"
										action="linkmanlist?flag=save&id=<%=linkman.getLinId()%>"
										method="post">
										<div class="ibox-content">

											<div class="form-group ">
												<label for="lkm_name" class="col-sm-2 control-label">姓名：</label>
												<div class="col-sm-4">
													<input type="text" name="lkmName" id="lkm_name"
														class="form-control" value="<%=linkman.getLinName()%>" />
												</div>
											</div>
											<div class="form-group ">
												<label class="col-sm-2 control-label">性别：</label>
												<div class="col-sm-8">
													<input type="radio" name="sex" value="男"
														class="radio-inline">男 <input type="radio"
														name="sex" value="女" class="radio-inline">女

												</div>
											</div>

											<div class="form-group col-sm-6">
												<label for="lkm_postion" class="col-sm-4 control-label">职位：</label>
												<div class="col-sm-8">
													<input type="text" class="form-control" id="lkm_postion"
														value="<%=linkman.getLinPost()%>" name="lkmPostion" />
												</div>
											</div>
											<div class="form-group col-sm-6">
												<label for="lkm_tel" class="col-sm-4 control-label">办公电话：</label>
												<div class="col-sm-8">
													<input type="text" class="form-control"
														value="<%=linkman.getLinTelephone()%>" id="lkm_tel"
														name="lkmTel" />
												</div>
											</div>


											<div class="form-group col-sm-6">
												<label for="lkm_mobile" class="col-sm-4 control-label">手机：</label>
												<div class="col-sm-8">
													<input type="text" class="form-control"
														value="<%=linkman.getLinMobile()%>" id="lkm_mobile"
														name="lkmMobile" />
												</div>
											</div>
											<div class="form-group col-sm-6">
												<label for="lkm_memo" class="col-sm-4 control-label">备注：</label>
												<div class="col-sm-8">
													<input type="text" class="form-control"
														value="<%=linkman.getLinMemo()%>" id="lkm_memo"
														name="lkmMemo" />
												</div>
											</div>
											<div class="form-group">
												<input type="submit" style="display: none;" id="btn1">
											</div>
										</div>
									</form>

								</div>
							</div>
						</div>

					</div>

				</div>

			</div>
			<div class="footer">
				<!-- <div class="pull-right">
                    By：<a href="http://www.zi-han.net" target="_blank">zihan's blog</a>
                </div> -->
				<div>
					<strong>Copyright</strong> CrmSys &copy; 2017
				</div>
			</div>

		</div>
	</div>

	<!-- 全局js -->
	<script src="<%=request.getContextPath()%>/js/jquery.min.js?v=2.1.4"></script>
	<script
		src="<%=request.getContextPath()%>/js/bootstrap.min.js?v=3.3.6"></script>

	<!-- 自定义js -->
	<script src="<%=request.getContextPath()%>/js/content.js?v=1.0.0"></script>


	<!-- Bootstrap table -->
	<script
		src="<%=request.getContextPath()%>/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>

	<!-- Peity -->
	<script
		src="<%=request.getContextPath()%>/js/demo/bootstrap-table-demo.js"></script>

	<script type="<%=request.getContextPath()%>/text/javascript"
		src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
	<!--统计代码，可删除-->

</body>
<script type="text/javascript">
	$("#save").click(function(){
		$("#btn1").click();
	})
	$("#back").click(function(){
		window.history.go(-1);	
	})
    <%int i = -1;
			if (linkman.getLinSex().equals("男")) {
				i = 0;
			} else if (linkman.getLinSex().equals("女")) {
				i = 1;
			}%>
     $("input[name = 'sex']").get(<%=i%>).checked=true;
<%-- 	 $(":radio[name='sex'][value='" + <%=linkman.getLinSex()%> + "']").prop("checked", "checked"); --%>
                                                    
</script>

</html>