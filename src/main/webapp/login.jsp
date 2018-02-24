<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>CRM登录</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="favicon.ico"> <link href="/assets/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="/assets/css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="/assets/css/animate.css" rel="stylesheet">
    <link href="assets/css/style.css?v=4.1.0" rel="stylesheet">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>

<body class="gray-bg">

    <div class="middle-box text-center loginscreen  animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name">crm</h1>

            </div>
            <h3>欢迎使用中药采购商关系管理系统</h3>

            <form class="m-t"  action="login?flag=login" name="form1" method="post">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="用户名" required="" name="name" id="name">
                    
                </div>
                <div class="form-group" id="show"></div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="密码" required="" name="password">
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>


                <p class="text-muted text-center"> <a href="login.html#"><small>忘记密码了？</small></a> | <a href="register.html">注册一个新账号</a>
                </p>

            </form>
        </div>
    </div>

    <!-- 全局js -->
    <script src="/assets/js/jquery.min.js?v=2.1.4"></script>
    <script src="/assets/js/bootstrap.min.js?v=3.3.6"></script>

    <script type="/assets/text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
    <!--统计代码，可删除-->

</body>
<script type="text/javascript">

if(4==<%=request.getParameter("errMSG")%>){
	alert("输入的密码错误")
}
	

$("#name").blur(function () {
	  var xmlhttp;
		 if (window.XMLHttpRequest)
		   {// code for IE7+, Firefox, Chrome, Opera, Safari
		   xmlhttp=new XMLHttpRequest();
		   }
		 else
		   {// code for IE6, IE5
		   xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		   }
		 //取得username的数据
		 var userName = document.getElementById("name").value;
		 //发送数据
		 xmlhttp.open("GET","login?flag=check&name="+userName,true);
		 xmlhttp.send();
		 //响应
		 xmlhttp.onreadystatechange=function()
		  {
		  if (xmlhttp.readyState==4 && xmlhttp.status==200)
		    {
			 // xmlhttp.responseText;
			 // xmlhttp:responseXml;
			  var flag = xmlhttp.responseText;
			 /*  if(flag=="1"){
				  document.getElementById("show").innerHTML="<font color=red >此用户已经使用</font>";
			  } */
			  if(flag=="2"){
				  document.getElementById("show").innerHTML="<font color=red >此用户不存在</font>";
			  }
		
		    }
		  }
	  
})
</script>

</html>
