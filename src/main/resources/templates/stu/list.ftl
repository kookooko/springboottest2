<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
我是${username}
<#if (age>10)>大帅哥</#if>
<table border="1px" width="200px">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
    </tr>
    <#list studentList as stu>
        <tr>
            <td>${stu.id}</td>
            <td>${stu.username}</td>
            <td>${stu.sex}</td>
        </tr>

    </#list>
</table>
</body>
</html>