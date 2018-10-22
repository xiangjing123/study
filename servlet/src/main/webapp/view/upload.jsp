<%--
        Created by IntelliJ IDEA.
        User: Administrator
        Date: 2018/10/10 0010
        Time: 14:21
        To change this template use File | Settings | File Templates.
        --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>文件上传</title>
</head>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
    function upload() {
        console.log("文件上传开始")
        var file = $("input[name='file']")[0].files[0];
        var formFile = new FormData();
        console.log(file.name)
        console.log(file)
        formFile.append("file", file); //加入文件对象

        var data = formFile;
        $.ajax({
            url: "/upload",
            data: data,
            type: "Post",
            cache: false,
            processData: false,
            contentType: false,
            success: function (result) {
                console.log(data);
                alert("上传完成!");
            }
        })

    }
</script>
<body>
文件1：<input type="file" name="file"/> </br>

<button onclick="upload()">点击上传文件</button>
</body>
</html>
