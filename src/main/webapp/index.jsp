<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/view/include/taglib.jsp"%>
<html>
<body>
<h2>Hello World!</h2>
<form:form id="searchForm" action="user/go.do" method="post">
    <input type="text" value="dd" name="name" />
    <input type="submit" value="提交" />
</form:form>
</body>
</html>