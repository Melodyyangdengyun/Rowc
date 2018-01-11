<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<body>
<h2>Hello World!</h2>
${ceshi}
${name}
<c:forEach var="va" items="${list}">
    ${va}
</c:forEach>
</body>
</html>
