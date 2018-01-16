<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
    <title>数据</title>
</head>
<body>
<table class="layui-hide" id="test"></table>
<script>
    layui.use('table', function(){
        var table = layui.table;
        table.render({
                         elem: '#test'
                         ,url:'${ctx}/clothes/listAll2'
                         ,cols: [[
                {field:'id', width:80, title: 'ID', sort: true}

            ]]
                         ,page: true
                     });
    });
</script>
</body>
</html>