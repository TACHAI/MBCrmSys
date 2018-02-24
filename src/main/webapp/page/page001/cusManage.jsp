<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import=" com.rlg.crm.domain.Customer"%>
<%@page import="java.util.List,
				java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">

    <title>客户管理</title>
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
                        <button aria-controls="navbar" aria-expanded="false" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
                            <i class="fa fa-reorder"></i>
                        </button>
                        <a href="#" class="navbar-brand">客户管理</a>
                    </div>
                    <div class="navbar-collapse collapse" id="navbar">
                        <ul class="nav navbar-top-links navbar-right">
                            <li>
                                <a id="chaxun">
                                    <i class="fa fa-sign-out"></i> 查询
                                </a>
                            </li>
                        </ul>
                        <ul class="nav navbar-top-links navbar-right">
                            <li>
                                <a href="login.html">
                                    <i class="fa fa-sign-out"></i> 帮助
                                </a>
                            </li>
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
                                    <h5>客户表</h5>
                                </div>

                                <div class="ibox-content">
                                    <form role="form" class="form-horizontal"  action="customerlist?flag=query" name="form1" method="post">
                                        <div class="row">
                                            <div class="form-group col-sm-4">
                                                <label for="CusName" class="col-sm-4 control-label">客户：</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" id="CusName" name="CusName"/>
                                                </div>
                                            </div>
                                            <div class="form-group col-sm-4">
                                                <label for="CusManager" class="col-sm-3 control-label">客户经理：</label>
                                                <div class="col-sm-9">
                                                    <input type="text" class="form-control"  id="CusManager" name="CusManager" >
                                                </div>
                                            </div>
                                            <div class="form-group col-sm-4">
                                                <label for="CusState" class="col-sm-3 control-label">状态：</label>
                                                <div class="col-sm-9">
                                                    <input type="text" class="form-control"  id="CusState" name="CusState" >
                                                    <input type="submit" style="display: none;" id="btn1">
                                                </div>
                                            </div>
												
                                        </div>
                                    </form>
                                    <br>

                                    <div class="table-responsive">
                                        <table class="table table-striped table-bordered table-hover" >
                                        <!--data-search="true">-->
		                                	<thead>
		                                        <tr>
		                                            <!--<th data-field="state" data-checkbox="true"></th>-->
		                                            <th data-field="id">编号</th>
		                                            <th data-field="name">客户名称</th>
		                                            <th data-field="name">地址</th>
		                                            <th data-field="price">电话</th>
		                                            <th data-field="name">状态</th>
		                                            <th data-field="price">操作</th>
		                                        </tr>
		                                        </thead>
		                                        <tbody>
		                                        <% List<Customer> list=(List<Customer>) request.getAttribute("cusList");
													if(list!=null){
														for(int i=0;i<list.size();i++){
														Customer cus=list.get(i);
												%>
		                                        <tr>
		                                        	<td><%=cus.getCusId()%></td>
		                                        	<td><%=cus.getCusName()%></td>
		                                        	<td><%=cus.getCusAddress()%></td>
		                                        	<td><%=cus.getCusTelephone()%></td>
		                                        	<td><%=cus.getCusState()%></td>
		                                        	<td><a href="customerlist?flag=update&cus_id=<%=cus.getCusId() %>" >编辑</a></td>			
		                                        </tr>
		                                       <% }
												   } %>
		                                        </tbody>
		                                </table>
		                                <%
							int showPage = ((Integer) (request.getAttribute("showPage")))
									.intValue();
							int pageCount = ((Integer) (request.getAttribute("pageCount")))
									.intValue();
							int page1 = showPage - 1;
							int page2 = showPage + 1;
							int lastPage = pageCount;
						%>

						<div style="text-align: right;">
							<ul class="pager">
								<li><a href="javascript:page(1,<%=pageCount%>)">&laquo;</a></li>
								<li><a href="javascript:page(<%=page1%>,<%=pageCount%>)">上一页</a></li>
								<li><a href="javascript:page(<%=page2%>,<%=pageCount%>)">下一页</a></li>
								<li><a href="javascript:page(<%=lastPage%>,<%=pageCount%>)">&raquo;</a></li>
							</ul>
						</div>
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
	$("#chaxun").click(function () {
		$("#btn1").click();
	})
	function page(pageNum,pageCount){
		if(pageNum<=0){
			pageNum==1;
		}
		if(pageNum>pageCount){
			pageNum=pageCount;
		}
		document.form1.action="customerlist?flag=query&page="+pageNum;
		document.form1.submit();
	}
</script>
</html>