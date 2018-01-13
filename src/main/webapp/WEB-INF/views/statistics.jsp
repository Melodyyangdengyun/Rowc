<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
    <title>登记统计</title>
</head>
<body>
<div id="main">
    <div class="demo">
        <div id="chart" style="width:100%;height:550px;"></div>
    </div>
</div>
<script type="text/javascript" src="${ctxStatic}/echarts/source/echarts.js"></script>
<script type="text/javascript" src="${ctxStatic}/echarts/Echarts.js"></script>
<script type="text/javascript">
    // 配置路径
    require.config({
       paths: {
       echarts: '${ctxStatic}/echarts/source'
       }
     });
    // 按需加载
    require(
        [
            'echarts',
            'echarts/chart/bar',
            'echarts/chart/line'
        ],
        function (ec) {
            var chart = document.getElementById('chart');
            var echart = ec.init(chart);

            echart.showLoading({
             text: '正在努力加载中...'
           });

            var categories = [];
            var values = [];
            // 同步执行
            $.ajaxSettings.async = false;

            // 加载数据
            $.getJSON('${ctx}/gztj/gztjBiManager/getTrainOneScoreByOffice?names='+names+'&project='+project+'&beginTime='+beginTime+'&endTime='+endTime,function (json) {
                categories = json.name;
                if(json.value==""){
                    $("#chart").hide();
                }else{
                    values = json.value;
                }

            });
            option = {
                title: {
                    x: 'center',
                    text: '登记',
                    subtext: ''
                },
                toolbox: {
                    show : true,
                    feature : {
                        magicType : {show: true, type: ['line', 'bar']},
                        restore : {show: true},
                        saveAsImage : {show: true}
                    }
                },
                calculable : true,
                tooltip : {
                    trigger: 'axis',
                    formatter: "得分 :{c}"
                },
                yAxis : [
                    {
                        type : 'value',
                        axisLabel : {
                            formatter: '{value} '
                        }
                    }
                ],
                xAxis : [
                    {
                        type : 'category',
                        axisLine : {onZero: false},
                        axisLabel : {
                            formatter: '{value}'
                        },
                        boundaryGap : false,
                        data : categories
                    }
                ],
                series : [
                    {
                        name:'折线图',
                        type:'line',
                        smooth:true,
                        symbol: 'emptypin',
                        symbolSize: 8,
                        itemStyle: {
                            normal: {
                                color:'#3daae9',
                                label : {
                                    show: true,
                                    position: 'top',
                                    textStyle : {
                                        fontSize : '16',
                                        fontFamily : '微软雅黑',
                                        fontWeight : 'bold'
                                    }
                                },
                                lineStyle: {
                                    shadowColor : 'rgba(0,0,0,0.4)'
                                }
                            }
                        },
                        data:values
                    }
                ]
            };
            echart.setOption(option);
            echart.hideLoading();
        }
    );
</script>
</body>
</html>