<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
    <title>出库登记表</title>
</head>
<body>
<table id="demo" lay-filter="test"></table>
<script>
    layui.use('table', function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 540
            ,url: '${ctx}/clothes/listMap' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'registerDate', title: '日期', width:120, sort: true, fixed: 'left',type:'date'}
                ,{field: 'colour', title: '颜色', width:80}
                ,{field: 'style', title: '款式', width:80}
                ,{field: 'sized', title: '尺寸/码', width:80}
                ,{field: 'lengthd', title: '长度/cm', width:80}
                ,{field: 'numberd', title: '数量', width:80}
                ,{field: 'company', title: '件/套', width:80}
                ,{field: 'price', title: '服装单价/元', width:80}
                ,{field: 'total', title: '总价/元', width:80}
                ,{field: 'paymentState', title: '付款情况', width:80}
                ,{field: 'office', title: '发放部门/工程名称', width:80}
                ,{field: 'head', title: '部门/工程负责人', width:80}
                ,{field: 'managers', title: '经办人', width:80}
                ,{field: 'phone', title: '电话', width:80}
            ]]
        });
    });
</script>

</body>
</html>
