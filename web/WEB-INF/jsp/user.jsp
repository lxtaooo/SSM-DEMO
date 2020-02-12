<%--
  Created by IntelliJ IDEA.
  User: 李晓涛
  Date: 2020/2/11
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>用户列表-显示所有用户</small>
                        <small>
                            <a href="/user/findAll">返回首页</a>
                        </small>
                    </h1>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 column">
            <a class="btn btn-primary" href="/user/adduser">新增用户</a>
        </div>
            <div class="col-md-4 column">
                <form action="/user/findUser" method="post">
                    <span style="color: red;font-weight: bold ">${error}</span>
                    <input type="text" name="name" class="serializedFormContainer" placeholder="请输入要查询的用户姓名">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
            </div>
        </div>
        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>用户编号</th>
                        <th>用户名字</th>
                        <th>用户密码</th>
                        <th>操作</th>
                    </tr>
                    </thead>

                    <tbody>
                    <c:forEach var="user" items="${msg}">
                        <tr>
                            <td>${user.id}</td>
                            <td>${user.name}</td>
                            <td>${user.pwd}</td>
                            <td>

                                <a href="/user/findById/${user.id}">更改</a>
                                            &nbsp;| &nbsp;
                                <a href="/user/del/${user.id}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>


</body>
</html>
