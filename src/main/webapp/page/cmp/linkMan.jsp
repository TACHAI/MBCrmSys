<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
    <link href="<%=request.getContextPath() %>/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/css/animate.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/css/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/css/style.css?v=4.1.0" rel="stylesheet">
</head>
<body class="gray-bg top-navigation">

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
							<li><a id="back"> <i class="fa fa-sign-out"></i>
									退出
							</a></li>
						</ul>
						<ul class="nav navbar-top-links navbar-right">
							<li><a href="page/addlinkMan.jsp?cusId=<%=request.getAttribute("cusId") %>"> <i class="fa fa-sign-out"></i>
									新建
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
									<h5>客户信息表</h5>
								</div>



								<div class="ibox-content">
									<div class="table-responsive">
										<table  class="table table-striped table-bordered table-hover">
											<!--data-search="true">-->
											<thead>
												<tr>
													<!--<th data-field="state" data-checkbox="true"></th>-->
													<th data-field="id">姓名</th>
													<th data-field="name">性别</th>
													<th data-field="price">职位</th>
													<th data-field="name">办公电话</th>
													<th data-field="price">手机</th>
													<th data-field="name">备注</th>
													<th data-field="price">操作</th>
												</tr>
											</thead>
											<tbody>
											<% List<Linkman> list=(List<Linkman>) request.getAttribute("linkmanlist");
												if(list!=null){
												 for(int i=0;i<list.size();i++){
													Linkman lm=list.get(i);%>
												
												<tr>
													<td><%=lm.getLinName()%></td>
													<td><%=lm.getLinSex()%></td>
													<td><%=lm.getLinPost()%></td>
													<td><%=lm.getLinTelephone()%></td>
													<td><%=lm.getLinMobile()%></td>
													<td><%=lm.getLinMemo()%></td>
													<td><a href="linkmanlist?flag=update&id=<%=lm.getLinId() %>">修改</a> <a href="linkmanlist?flag=del&id=<%=lm.getLinId() %>&cusId=<%=lm.getCustomer().getCusId() %>">删除</a></td>
												</tr>
											<%	}
												} %>
											</tbody>
										</table>
									</div>

								</div>
							</div>
						</div>

					</div>

				</div>

			</div>
			<div class="footer">
				<div class="pull-right">
					By：<a href="http://www.zi-han.net" target="_blank">zihan's blog</a>
				</div>
				<div>
					<strong>Copyright</strong> H+ &copy; 2014
				</div>
			</div>

		</div>
	</div>


	 <!-- 全局js -->
    <script src="<%=request.getContextPath() %>/js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=request.getContextPath() %>/js/bootstrap.min.js?v=3.3.6"></script>

    <!-- 自定义js -->
    <script src="<%=request.getContextPath() %>/js/content.js?v=1.0.0"></script>


    <!-- Bootstrap table -->
    <script src="<%=request.getContextPath() %>/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
    <script src="<%=request.getContextPath() %>/js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
    <script src="<%=request.getContextPath() %>/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>

    <!-- Peity -->
    <script src="<%=request.getContextPath() %>/js/demo/bootstrap-table-demo.js"></script>

    <script type="<%=request.getContextPath() %>/text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
    <!--统计代码，可删除-->

</body>
<script type="text/javascript">
$("#back").click(function(){
	window.history(-1);
})
</script>
</html>