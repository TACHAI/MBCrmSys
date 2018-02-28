<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>管理员登录</title>
    <%--<meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">--%>
    <%--<meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">--%>

    <link rel="shortcut icon" href="favicon.ico"> <link href="/assets/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="/assets/css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="/assets/css/animate.css" rel="stylesheet">
    <link href="/assets/css/style.css?v=4.1.0" rel="stylesheet">
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

            <form class="m-t" id="form01">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="用户名" required=""  name="ConName" value="">
                </div>

                <div class="form-group" id="show"></div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="密码" required="" name="ConPassword" value="">
                </div>

                <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>

                <p class="text-muted text-center"> <a href="login.html"><small>忘记密码了？</small></a> | <a href="register.html">注册一个新账号</a>
                </p>

            </form>
        </div>
    </div>

    <!-- 全局js -->
    <script src="/assets/js/jquery.min.js?v=2.1.4"></script>
    <script src="/assets/js/bootstrap.min.js?v=3.3.6"></script>
    <script type="text/javascript" src="/assets/js/jquery.serializejson.js"></script>
    <script type="/assets/text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
    <!--统计代码，可删除-->

</body>
<script type="text/javascript">
    $('form').on('submit',function(e){
        e.preventDefault();
        var param = $('#form01').serializeJSON();
        console.info("序列化的值"+param)
        $.ajax({
            type:"post",
            url:"http://localhost:8080/user/login.do",
            data:param, //要发送的是ajaxFrm表单中的数据
            dataType:'json',
            success:function (data) {
                console.info("成功返回值:",data);
                console.info("返回的第一个值",data.msg)
                alert(data.msg)
                console.info("name",data.data.conName)
                if(data.status==0){
//                    Object.each(data,function(item,key){
//                        var link = '&' + key + "=" + item;
//                        myURL.link += link;
//                    })
                    window.location.href = "${pageContext.request.contextPath}/page/index.jsp"+'?'+'id'+'='+data.data.conId+'&name='+data.data.conName;
                }
            },
            error:function (data) {
                console.info("失败返回值：",data);
            }
        });
    })
</script>

</html>
