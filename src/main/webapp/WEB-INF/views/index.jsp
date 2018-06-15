<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>guitar</title>
    <script src="//cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12"><h1>吉他搜索</h1></div>
    </div>
    <form class="form-horizontal" action="/search" id="ff">
        <div class="form-group">
            <label for="builder" class="col-sm-2 control-label">产地</label>
            <div class="col-sm-9">
                <select class="form-control" name="builder" id="builder">
                    <option value="江苏">江苏</option>
                    <option value="上海">上海</option>
                    <option value="广东">广东</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="type" class="col-sm-2 control-label">类型</label>
            <div class="col-sm-9">
                <select class="form-control" name="type" id="type">
                    <option value="古典吉他">古典吉他</option>
                    <option value="电吉他">电吉他</option>
                    <option value="民谣吉他">民谣吉他</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="backWood" class="col-sm-2 control-label">后面板</label>
            <div class="col-sm-9">
                <select class="form-control" name="backWood" id="backWood">
                    <option value="橡木">橡木</option>
                    <option value="桦木">桦木</option>
                    <option value="红松">红松</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="topWood" class="col-sm-2 control-label">前面板</label>
            <div class="col-sm-9">
                <select class="form-control" name="topWood" id="topWood">
                    <option value="橡木">橡木</option>
                    <option value="桦木">桦木</option>
                    <option value="红松">红松</option>
                </select>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-5 col-sm-4">
                <button id="btn" type="submit" class="btn btn-default" style="margin-top:15px;width:100px;"><span class="glyphicon glyphicon-search" aria-hidden="true"></span>搜索</button>
            </div>
        </div>
</form>

<table class="table table-bordered">
    <thead>
    <tr>
        <td><h4>价格</h4></td>
        <td><h4>产地</h4></td>
        <td><h4>类型</h4></td>
        <td><h4>后面板</h4></td>
        <td><h4>前面板</h4></td>
    </tr>
    </thead>
    <tbody id="table">
    <c:forEach var="gui" items="${requestScope.guitars}">
    <td>${gui.price}</td>
    <td><c:out value="${gui.builder}"></c:out></td>
    <td><c:out value="${gui.type}"></c:out></td>
    <td><c:out value="${gui.backWood}"></c:out></td>
    <td><c:out value="${gui.topWood}"></c:out></td>
    </tbody>
    </c:forEach>
</table>
</div>
</body>
</html>