<%@page import="com.rlg.crm.domain.OrdersDetail"%>
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
        <% Orders order=(Orders)request.getAttribute("orders"); %>
            <table class="table table-striped table-bordered table-hover">
                <thead>
                <tr>
                    <th>商品</th>
                    <th>数量</th>
                    <th>单位</th>
                    <th>单价（元）</th>
                    <th>金额（元）</th>
                </tr>
                </thead>
                <tbody>
                <% List<OrdersDetail> list=(List<OrdersDetail>) request.getAttribute("orderDetilList");
                   double count=0;
                    int sum=0;    		
                	if(list!=null){
                	   for(int i=0;i<list.size();i++){
                		   OrdersDetail ordersDetail=list.get(i);
                		   count=ordersDetail.getOlCount()*ordersDetail.getOlPrice(); %>
                	
                <tr >
                    <td><%=ordersDetail.getWares().getWarName() %></td>
                    <td><%=ordersDetail.getOlCount() %></td>
                    <td><%=ordersDetail.getOlUnit() %></td>
                    <td><%=ordersDetail.getOlPrice() %></td>
                    <td><%=count %></td>
                </tr>
                <% sum+=count ; }
                   }
                %>
                </tbody>
            </table>
            <br>
             <form role="form" class="form-horizontal">
                <div class="row">
                    <div class="form-group col-sm-4">
                        <label for="odr_id" class="col-sm-4 control-label">订单编号：</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" value="<%=order.getOrdId() %>" readonly="readonly" id="odr_id" name="odrId"/>
                        </div>
                    </div>
                    <div class="form-group col-sm-4">
                        <label for="odr_date" class="col-sm-3 control-label">日期：</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" value="<%=order.getOrdDate() %>" readonly="readonly"  id="odr_date" name="odrDate" >
                        </div>
                    </div>
                    <div class="form-group col-sm-4">
                        <label for="odr_addr" class="col-sm-6 control-label">送货地址：</label>
                        <div class="col-sm-6">
                        <input type="text" class="form-control" value="<%=order.getOrdAddress() %>"  readonly="readonly"  id="odr_date" name="odrDate" >
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-sm-4">
                        <label for="ser_allot_date" class="col-sm-4 control-label">总金额：</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" value="<%=sum%>" readonly="readonly" id="ser_allot_date"/>
                        </div>
                    </div>
                    <div class="form-group col-sm-4">
                        <label class="col-sm-3 control-label" for="odr_status">状态：</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" value="<%=order.getOrdState() %>" readonly="readonly" id="ser_allot_date"/>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>