<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
    <title>出库登记表</title>
</head>
<body>
    <form:form id="searchForm" action="${ctx}/clothes/statistics" method="post" enctype="multipart/form-data">
        <table class="layui-table">
            <thead>
            <tr>
                <th>${map.k0}</th>
                <th>${map.k1}</th>
                <th>${map.k2}</th>
                <th>${map.k3}</th>
                <th>${map.k4}</th>
                <th>${map.k5}</th>
                <th>${map.k6}</th>
                <th>${map.k7}</th>
                <th>${map.k8}</th>
                <th>${map.k9}</th>
                <th>${map.k10}</th>
                <th>${map.k11}</th>
                <th>${map.k12}</th>
                <th>${map.k13}</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="ms" items="${maps}">
                <tr>
                    <td>${ms.j0}</td>
                    <td>${ms.j1}</td>
                    <td>${ms.j2}</td>
                    <td>${ms.j3}</td>
                    <td>${ms.j4}</td>
                    <td>${ms.j5}</td>
                    <td>${ms.j6}</td>
                    <td>${ms.j7}</td>
                    <td>${ms.j8}</td>
                    <td>${ms.j9}</td>
                    <td>${ms.j10}</td>
                    <td>${ms.j11}</td>
                    <td>${ms.j12}</td>
                    <td>${ms.j13}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    <button class="layui-btn" type="submit">提交</button>
    </form:form>
</body>
</html>
