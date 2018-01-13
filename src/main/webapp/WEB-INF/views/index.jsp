<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
    <title>出库登记表</title>
</head>
<body>
<form:form id="searchForm" action="${ctx}/clothes/upload" method="post" enctype="multipart/form-data">
    <input type="file" value="上传" name="excelFile"/>
    <button class="layui-btn" type="submit">提交</button>
</form:form>
</body>
</html>
