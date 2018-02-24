<%@page import="com.rlg.crm.domain.CustomerRank"%>
<%@page import="com.rlg.crm.domain.Area"%>
<%@page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import=" com.rlg.crm.domain.Customer"%>
<%@page import="java.util.List,
				java.util.ArrayList"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!--360浏览器优先以webkit内核解析-->

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
<title>客户信息管理</title>
<link rel="shortcut icon" href="favicon.ico">
    <link href="<%=request.getContextPath() %>/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/css/animate.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/css/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/css/style.css?v=4.1.0" rel="stylesheet">
</head>
<body class="gray-bg top-navigation" >
		 <%
     		Customer customer = (Customer) request.getAttribute("customer");
   			%>
	<div id="wrapper">
		<div id="page-wrapper" class="gray-bg">
			<div class="row border-bottom white-bg">
				<nav class="navbar navbar-static-top" role="navigation">
					<div class="navbar-collapse collapse" id="navbar">
						<ul class="nav navbar-top-links navbar-left">
							<li><a href="#" class="navbar-brand">客户信息管理管理</a></li>
						</ul>
						<ul class="nav navbar-top-links navbar-right">
							<li><a id="save"> <i class="fa fa-sign-out"></i> 保存
							</a></li>
						</ul>
						<ul class="nav navbar-top-links navbar-right">
							<li><a id="back"> <i class="fa fa-sign-out"></i> 返回
							</a></li>
						</ul>
						<ul class="nav navbar-top-links navbar-right">
							<li><a
								href="orderlist?flag=query&cusId=<%=customer.getCusId()%>">
									<i class="fa fa-sign-out"></i> 历史订单
							</a></li>
						</ul>
						<ul class="nav navbar-top-links navbar-right">
							<li><a
								href="assortlist?flag=query&cusId=<%=customer.getCusId()%>">
									<i class="fa fa-sign-out"></i> 交往记录
							</a></li>
						</ul>
						<ul class="nav navbar-top-links navbar-right">
							<li><a
								href="linkmanlist?flag=query&cusId=<%=customer.getCusId()%>">
									<i class="fa fa-sign-out"></i> 联系人
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
			<form role="form" class="form-horizontal" action="customerlist?flag=save&id=<%=customer.getCusId() %>" name="form1" method="post">
				<div class="ibox-content">


					<div class="form-group col-sm-6">
						<label for="custNo" class="col-sm-4 control-label">客户编号：</label>
						<div class="col-sm-8">
							<!--<input type="text" class="form-control" id="ser_se_id"/>-->
							<span id="custNo" name="custNo"><%=customer.getCusNumber()%></span>
						</div>

					</div>
					<div class="form-group col-sm-6">
						<label for="custName" class="col-sm-4 control-label">名称：</label>
						<div class="col-sm-8 row">
							<input type="text" class="form-control"
								value="<%=customer.getCusName()%>" id="custName"
								name="custName" />

						</div>
					</div>

					<div class="form-group col-sm-6">
						<label for="cust_region" class="col-sm-4 control-label">地区：</label>
						<div class="col-sm-8">
							<select id="cust_region" name="custArea" class="form-control m-b">
								<%
									List<Area> arelist = (List<Area>) request.getAttribute("arealist");
									for (int i = 0; i < arelist.size(); i++) {
										Area are = arelist.get(i);
								%>

								<option value="<%=are.getAreId()%>"><%=are.getAreName()%></option>
								  <script>  $("#cust_region").find("option[value='<%=customer.getArea().getAreId()%>']").attr("selected",true);</script>
								<%
									}
								%>

							</select>
						</div>
					</div>
					<div class="form-group col-sm-6">
						<label for="cust_manager_name" class="col-sm-4 control-label">客户经理：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control"
								value="<%=customer.getCusManager()%>" id="cust_manager_name"
								name="custManagerName" /> <font color="red">*</font>
						</div>
					</div>

					<div class="form-group">
						<label for="cust_level" class="col-sm-2 control-label">客户等级：</label>
						<div class="col-md-3">
							<select id="cust_level" name="custRank" class="form-control m-b">
								<%
									List<CustomerRank> ranklist = (List<CustomerRank>) request.getAttribute("ranklist");
									for (int i = 0; i < arelist.size(); i++) {
										CustomerRank rank = ranklist.get(i);
								%>
								<option value="<%=rank.getCkId()%>"><%=rank.getCkName()%></option>
								<script> $("#cust_level").find("option[value='<%=customer.getCustomerRank().getCkId()%>']").attr("selected",true);</script>

								<%
									}
								%>
							</select>
						</div>
					</div>

					<div class="form-group col-sm-6">
						<label for="cust_satisfy" class="col-sm-4 control-label">客户满意度：</label>
						<div class="col-sm-8">
						
							<select id="cust_satisfy" name="custSatisfy"
								class="form-control m-b"> 
								<option value="1">☆</option>
								<option value="2">☆☆</option>
								<option value="3">☆☆☆</option>
								<option value="4">☆☆☆☆</option>
								<option value="5">☆☆☆☆☆</option>
							</select>			
						</div>
					</div>
					<div class="form-group col-sm-6">
						<label for="cust_credit" class="col-sm-4 control-label">客户信用度：</label>
						<div class="col-sm-8">
							
							<select id="cust_credit" name="custCredit" class="form-control m-b">
								<option value="1">☆</option>
								<option value="2" >☆☆</option>
								<option value="3">☆☆☆</option>
								<option value="4">☆☆☆☆</option>
								<option value="5">☆☆☆☆☆</option>
							</select>
							
						</div>
					</div>

					<div class="form-group col-sm-6">
						<label for="cust_addr" class="col-sm-4 control-label">地址：</label>
						<div class="col-sm-8">
							<input type="text" value="<%=customer.getCusAddress()%>"
								class="form-control" id="cust_addr" name="custAddr" />
						</div>
					</div>
					<div class="form-group col-sm-6">
						<label for="cust_zip" class="col-sm-4 control-label">邮编：</label>
						<div class="col-sm-8">
							<input type="text" value=<%=customer.getCusPostalCode() %> class="form-control" id="cust_zip"
								name="postCode" />
						</div>
					</div>

					<div class="form-group col-sm-6">
						<label for="cust_tel" class="col-sm-4 control-label">电话：</label>
						<div class="col-sm-8">
							<input type="text" value="<%=customer.getCusTelephone()%>" class="form-control" id="cust_tel"
								name="custTel" />
						</div>
					</div>
					<div class="form-group col-sm-6">
						<label for="cust_fax" class="col-sm-4 control-label">传真：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" value="<%=customer.getCusFasimile() %>" id="cust_fax"
								name="custFax" />
						</div>
					</div>

					<div class="form-group">
						<label for="cust_website" class="col-sm-2 control-label">网址：</label>
						<div class="col-md-4">
							<input type="text" class="form-control" value="<%=customer.getCusUrl() %>" id="cust_website"
								name="custWebsite" />
						</div>
					</div>

					<div class="form-group col-sm-6">
						<label for="cust_licence_no" class="col-sm-4 control-label">营业执照注册号：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" value="<%=customer.getCusRegisterNumber() %>" id="cust_licence_no"
								name="custLicenceNo" />
						</div>
					</div>
					<div class="form-group col-sm-6">
						<label for="cust_chieftain" class="col-sm-4 control-label">法人：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" value="<%=customer.getCusLegalPerson() %>" id="cust_chieftain"
								name="custLegalPeson" />
						</div>
					</div>

					<div class="form-group col-sm-6">
						<label for="cust_bankroll" class="col-sm-4 control-label">注册资金（万元）：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" value="<%=customer.getCusRegisterMoney() %>" id="cust_bankroll"
								name="custBankMoney" />
						</div>
					</div>
					<div class="form-group col-sm-6">
						<label for="cust_turnover" class="col-sm-4 control-label">年营业额：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" value="<%=customer.getCusRmb() %>" id="cust_turnover"
								name="custRmb" />
						</div>
					</div>

					<div class="form-group col-sm-6">
						<label for="cust_bank" class="col-sm-4 control-label">开户银行：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" value="<%=customer.getCusOpeningBank() %>" id="cust_bank"
								name="custBank" />
						</div>
					</div>
					<div class="form-group col-sm-6">
						<label for="cust_bank_account" class="col-sm-4 control-label">银行账号：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" value="<%=customer.getCusBankAccount() %>" id="cust_bank_account"
								name="custBankAccount" />
						</div>
					</div>

					<div class="form-group col-sm-6">
						<label for="cust_local_tax_no" class="col-sm-4 control-label">地税登记号：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control"  value="<%=customer.getCusCrownRent() %>" id="cust_local_tax_no"
								name="custLocalTaxNo" />
						</div>
					</div>
					<div class="form-group col-sm-6">
						<label for="cust_national_tax_no" class="col-sm-4 control-label">国税登记号：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" value="<%=customer.getCusStateTaxes() %>" id="cust_national_tax_no"
								name="custNationalTaxNo" />
						</div>
					</div>
					<div class="form-group"></div>
						<input type="submit" id="btn1" style="display: none;">
				</div>
			</form>
		</div>
	</div>
	<!--<div class="wrapper wrapper-content animated fadeInRight">-->
	<!--<div class="ibox float-e-margins">-->
	<!---->
	<!--</div>-->
	<!--</div>-->




	<!-- 全局js -->
	
	
</body>
<script type="text/javascript">
    $("#cust_credit").find("option[value='<%=customer.getCusChangeDescribe()%>']").attr("selected",true);
    $("#cust_satisfy").find("option[value='<%=customer.getCusSuccessProbability()%>']").attr("selected",true);
	
	$("#back").click(function(){
	 	window.history.go(-1);
	})
	$("#save").click(function(){
		$("#btn1").click();
	});
	
	<%-- var obj = $("#cust_satisfy");
	for (var i = 0; i < obj.length; i++) {
		if (obj.options[i].value == <%=customer.getCusSuccessProbability()%> ) {
			obj.options[i].selected = true;
			break;
		}
	} --%>
</script>

							

</html>
