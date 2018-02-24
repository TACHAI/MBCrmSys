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
                <a href="" class="navbar-brand">客户构成分析</a>
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
            
        </div>
        <div class="ibox-content">
           <form role="form" class="form-horizontal" name="form1" action="<%=request.getContextPath() %>/queryCusContribution.doServe" method="post">
                <div class="row">   
                   <div class="form-group col-sm-6">
                       <label class="col-sm-5 control-label">报表方式：</label>
                       <div class="col-sm-6">
                           <select id="table_styles" name="table_styles" class="form-control">
                               <option value="按等级">按等级</option>
                               <option value="2"></option>
                               <option value="3"></option>
                               <option value="4"></option>
                           </select>
                       </div>
                   </div>
                </div>
                <input type="submit" style="display:none;" id="submit"/>
            </form>
            <br>
         
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

</script>