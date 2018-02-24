<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import=" com.rlg.crm.domain.Orders"%>
<%@page import="java.util.List,
				java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
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
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row border-bottom white-bg">
        <nav class="navbar navbar-static-top" role="navigation">
            <div class="navbar-header">
                <button aria-controls="navbar" aria-expanded="false" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
                    <i class="fa fa-reorder"></i>
                </button>
                <a href="cusManageUpdate.html" class="navbar-brand">客户信息管理管理</a>
            </div>
            <div class="navbar-collapse collapse" id="navbar">
                <ul class="nav navbar-top-links navbar-right">
                    <li>
                        <a id="back">
                            <i class="fa fa-search"></i>返回
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
        </div>
        <div class="ibox-content">
            <form role="form" class="form-horizontal">
                <div class="row">
                    <div class="form-group col-sm-4">
                        <label for="odr_id" class="col-sm-4 control-label">客户编号：</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="odr_id" name="odrId" readonly="readonly"/>
                        </div>
                    </div>
                    <div class="form-group col-sm-4">
                        <label for="odr_date" class="col-sm-3 control-label">客户名称：</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control"  id="odr_date" name="odrDate" readonly="readonly" >
                        </div>
                    </div>
                </div>
            </form>
            <br>
            <table class="table table-striped table-bordered table-hover">
                <thead>
                <tr>
                    <th>订单编号</th>
                    <th>日期</th>
                    <th>送货地址</th>
                    <th>状态</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <% List<Orders> list=(List<Orders>) request.getAttribute("orderslist");
                  if(list!=null){
                	  for(int i=0;i<list.size();i++){
                		  Orders order=list.get(i);
               %>                	
                <tr >
                    <td><%=order.getOrdId() %></td>
                    <td><%=order.getOrdDate() %></td>
                    <td><%=order.getOrdAddress() %></td>
                    <td><%=order.getOrdState() %></td>
                    <td><a href="orderlist?flag=detil&id=<%=order.getOrdId() %>">操作</a></td>
                </tr>
                <%   }
                	
                  }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>