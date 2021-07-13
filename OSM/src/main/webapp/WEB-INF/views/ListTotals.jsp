<%@ page import="java.util.ArrayList" %>
<%@ page import="com.bjpowernode.domain.Servers" %>
<%@ page import="com.bjpowernode.domain.Totals" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1">
    <!-- Google Chrome Frame也可以让IE用上Chrome的引擎: -->
    <meta name="renderer" content="webkit">
    <!--国产浏览器高速模式-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="李幸阜"/>
    <!-- 作者 -->
    <meta name="revised" content="李幸阜"/>
    <!-- 定义页面的最新版本 -->
    <meta name="description" content="修改机房信息"/>
    <!-- 网站简介 -->
    <meta name="keywords" content="搜索关键字，以半角英文逗号隔开"/>
    <title>李幸阜开发</title>

    <!-- 公共样式 开始 -->
    <%
        String cssPath = "/RR/static";
    %>
    <link rel="stylesheet" type="text/css" href="<%=cssPath%>/css/base.css">
    <link rel="stylesheet" type="text/css" href="<%=cssPath%>/css/iconfont.css">
    <script type="text/javascript" src="<%=cssPath%>/framework/jquery-1.11.3.min.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=cssPath%>/layui/css/layui.css">
    <script type="text/javascript" src="<%=cssPath%>/layui/layui.js"></script>
    <!-- 滚动条插件 -->
    <link rel="stylesheet" type="text/css" href="<%=cssPath%>/css/jquery.mCustomScrollbar.css">
    <script src="<%=cssPath%>/framework/jquery-ui-1.10.4.min.js"></script>
    <script src="<%=cssPath%>/framework/jquery.mousewheel.min.js"></script>
    <script src="<%=cssPath%>/framework/jquery.mCustomScrollbar.min.js"></script>
    <script src="<%=cssPath%>/framework/cframe.js"></script><!-- 仅供所有子页面使用 -->
    <!-- 公共样式 结束 -->
</head>
<body>
<div class="cBody">
    <table class="layui-table">
        <thead>
        <tr>
            <th>s_id</th>
            <th>服务商名称</th>
            <th>客服数</th>
            <th>订单数</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <%
            ArrayList<Totals> totalsList = (ArrayList<Totals>) request.getAttribute("totalsList");
            int len = totalsList.size();
            for (Totals totals : totalsList) {
        %>
        <tr>
            <td><%=totals.getS_id()%></td>
            <td><%=totals.getUser_name()%></td>
            <td><%=totals.getServersCount()%></td>
            <td><%=totals.getOrdersCount()%></td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>

    <!-- layUI 分页模块 -->
    <div id="pages"></div>

    <script>
        layui.use(['laypage', 'layer'], function () {
            var laypage = layui.laypage,
                layer = layui.layer;

            //总页数大于页码总数
            laypage.render({
                elem: 'pages'
                , count: <%=len%>
                , layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
                , jump: function (obj) {
                    console.log(obj)
                }
            });
        });
    </script>
</div>
</body>
</html>
