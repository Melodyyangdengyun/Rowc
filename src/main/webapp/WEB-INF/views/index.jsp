<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<body>
<h2>Hello World!</h2>
    <form:form id="searchForm" action="user/go" method="post">
        <input type="text" value="dd" name="name" />
        <input type="submit" value="提交" />
    </form:form>
</body>
</html>
