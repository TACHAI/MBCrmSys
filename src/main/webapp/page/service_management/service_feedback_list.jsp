<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,com.rlg.crm.domain.Serve" %>    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->

    <link rel="shortcut icon" href="<%=request.getContextPath() %>/favicon.ico"> <link href="<%=request.getContextPath() %>/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/css/animate.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/css/style.css?v=4.1.0" rel="stylesheet">
</head>
<body class="gray-bg top-navigation">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row border-bottom white-bg">
        <nav class="navbar navbar-static-top" role="navigation">
            <div class="navbar-header">
                <button aria-controls="navbar" aria-expanded="false" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
                    <i class="fa fa-reorder"></i>
                </button>
                <a href="" class="navbar-brand">服务反馈</a>
            </div>
            <div class="navbar-collapse collapse" id="navbar">
                <ul class="nav navbar-top-links navbar-right">
                    <li>
                        <a id="query">
                            <i class="fa fa-search"></i> 查询
                        </a>
                    </li>
                </ul>
                <ul class="nav navbar-top-links navbar-right">
                    <li>
                        <a href="login.html">
                            <i class="fa fa-question"></i> 帮助
                        </a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
    <div class="ibox float-e-margins">
    	<div class="ibox-title">
            <h5>服务表</h5>
        </div>
        <div class="ibox-content">
            <form role="form" class="form-horizontal" name="form1" action="<%=request.getContextPath() %>/queryFeedback.doServe" method="post">
                <div class="row">
                    <div class="form-group col-sm-4">
                        <label for="ser_cus_id" class="col-sm-4 control-label">客户：</label>
                        <div class="col-sm-8">
                            <input type="text" name="ser_cus_id" class="form-control" id="ser_cus_id"/>
                        </div>
                    </div>
                    <div class="form-group col-sm-4">
                        <label for="ser_resume" class="col-sm-4 control-label">概要：</label>
                        <div class="col-sm-8">
                            <input type="text" name="ser_resume" class="form-control" id="ser_resume"/>
                        </div>
                    </div>
                    <div class="form-group col-sm-4">
                        <label for="ser_type" class="col-sm-6 control-label">服务类型：</label>
                        <div class="col-sm-6">
                            <select id="ser_type" name="ser_type" class="form-control">
                            	<option value="全部">全部</option>
                                <option value="建议">建议</option>
                                <option value="外包">外包</option>
                                <option value="咨询">咨询</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="row">
                   <div class="form-group col-sm-8">
                       <label for="ser_creater_date" class="col-sm-2 control-label">创建日期：</label>
                       <div class="col-sm-8">
                           <input type="text" name="ser_creater_date" class="form-control" id="ser_creater_date"/>
                       </div>
                   </div>
                   <div class="form-group col-sm-4">
                       <label class="col-sm-5 control-label">状态：</label>
                       <div class="col-sm-6">
                           <select id="ser_state" name="ser_state" class="form-control">
                               <option value="1">新创建</option>
                               <option value="2">已分配</option>
                               <option value="3" selected>已处理</option>
                               <option value="4">已归档</option>
                           </select>
                       </div>
                   </div>
                </div>
                <input type="submit" style="display:none;" id="submit"/>
            </form>
            <br>
            <table class="table table-striped table-bordered table-hover">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>客户</th>
                    <th>概要</th>
                    <th>服务类型</th>
                    <th>创建人</th>
                    <th>创建日期</th>
                    <th>操作</th>
                </tr>
                </thead>
               <tbody>
			<%

				List<Serve> serves = (List<Serve>)request.getAttribute("serves");
		
				if(serves != null){
					for(Serve serve : serves){
			%>
						<tr>
							<td><%=serve.getSerId() %></td>
		                    <td><%=serve.getCustomer().getCusName() %></td>
		                    <td><%=serve.getSerResume() %></td>
		                    <td><%=serve.getServeType().getSeName() %></td>
		                    <td><%=serve.getSerCreaterName() %></td>
		                    <td><%=serve.getSerCreaterDate() %></td>
							<td><a href="editFeedbackList.doServe?id=<%=serve.getSerId() %>">反馈</a></td>
						</tr>
			<% 
					}
				}
			%>
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
<!-- 全局js -->
<script src="<%=request.getContextPath() %>/js/jquery.min.js?v=2.1.4"></script>
<script src="<%=request.getContextPath() %>/js/bootstrap.min.js?v=3.3.6"></script>
</body>
</html>
<script type="text/javascript">
$("#query").click(function(){
	$("#submit").click();
});

function page(pageNum,pageCount){
	if(pageNum<=0){
		pageNum==1;
	}
	if(pageNum>pageCount){
		pageNum=pageCount;
	}
	document.form1.action="queryFeedback.doServe?page="+pageNum;
	$("#submit").click();
}
</script>