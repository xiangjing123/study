<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录页面</title>
</head>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
    function submit(){
        var username = $('input[name="username"]').val();
        var passwd = $('input[name="passwd"]').val();
        console.log(username,passwd)
        $.post("/asyncLogin",{username:username,passwd:passwd},function(data){
            alert(data)
        },"json")
    }
</script>
<body>
<%--<form action="/asyncLogin" method="post">--%>
    <div>
        username:<input title="username" name="username" /> </br>
        passwd:<input title="passwd" name="passwd" type="password"/></br>
        <button onclick="submit()">login</button>
    </div>
<%--</form>--%>
</body>
</html>
