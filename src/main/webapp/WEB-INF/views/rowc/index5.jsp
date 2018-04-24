<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
    <title></title>
    <script type="text/javascript">
        function page(n,s){
            $("#pageNo").val(n);
            $("#pageSize").val(s);
            $("#searchForm").submit();
            return false;
        }
    </script>
</head>
<body>
<form:form id="searchForm" modelAttribute="clothes" action="${ctx}/clothes/listPage" method="post">
</form:form>
    <table class="table table-striped table-bordered table-condensed">
        <thead>
         <tr>
             <td>日期</td>
             <td>颜色</td>
             <td>尺寸/码</td>
             <td>长度/cm</td>
             <td>数量</td>
         </tr>
        </thead>
        <tbody>
           <c:forEach items="${page.list}" var="clothes">
               <tr>
                <td>${clothes.registerDate}</td>
                <td>${clothes.colour}</td>
                <td>${clothes.sized}</td>
                <td>${clothes.lengthd}</td>
                <td>${clothes.numberd}</td>
               </tr>
           </c:forEach>
        </tbody>
    </table>
<div class="pagination">${page}</div>
</body>
</html>
