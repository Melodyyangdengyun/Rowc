<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<span id ="span" style="width: 50px;height: 200px;"></span>
</body>
<script>
    var arr = [{
        "list": [
            {
                "profits": 36,
                "count": 3,
                "carnum": "粤A56548",
                "goodModelId": 2430,
                "userId": 87032,
                "phone": "-",
                "price": 36,
                "name": "-",
                "serviceTypeId": 21,
                "serviceId": 37745,
                "serviceTypeName": "汽车空调",
                "goodsName": "车宝_11",
                "usedCard": 0
            },
            {
                "profits": 24,
                "count": 2,
                "carnum": "粤A56548",
                "goodModelId": 2429,
                "userId": 87032,
                "phone": "-",
                "price": 24,
                "name": "-",
                "serviceTypeId": 21,
                "serviceId": 37745,
                "serviceTypeName": "汽车空调",
                "goodsName": "机油_大",
                "usedCard": 0
            },
            {
                "profits": 200,
                "count": 2,
                "carnum": "粤CYD518",
                "goodModelId": 4212,
                "userId": 86966,
                "phone": "13711764735",
                "price": 200,
                "name": "周鑫杰",
                "serviceTypeId": 251,
                "serviceId": 449382,
                "serviceTypeName": "玻璃",
                "goodsName": "1664_1664",
                "usedCard": 0
            },
            {
                "profits": 400,
                "count": 2,
                "carnum": "粤CYD518",
                "goodModelId": 4116,
                "userId": 86966,
                "phone": "13711764735",
                "price": 400,
                "name": "周鑫杰",
                "serviceTypeId": 76,
                "serviceId": 449382,
                "serviceTypeName": "膨胀阀",
                "goodsName": "9898_98",
                "usedCard": 0
            },
            {
                "profits": 58,
                "count": 1,
                "carnum": "粤CYD518",
                "goodModelId": 4115,
                "userId": 86966,
                "phone": "13711764735",
                "price": 58,
                "name": "周鑫杰",
                "serviceTypeId": 76,
                "serviceId": 37708,
                "serviceTypeName": "膨胀阀",
                "goodsName": "58_85",
                "usedCard": 0
            },
            {
                "profits": -8648.96,
                "count": 2,
                "carnum": "粤CYD518",
                "goodModelId": 4111,
                "userId": 86966,
                "phone": "13711764735",
                "price": 240,
                "name": "周鑫杰",
                "serviceTypeId": 23,
                "serviceId": 37709,
                "serviceTypeName": "温度传感器",
                "goodsName": "发动机_12",
                "usedCard": 0
            },
            {
                "profits": 105.96,
                "count": 1,
                "carnum": "粤CYD518",
                "goodModelId": 2554,
                "userId": 86966,
                "phone": "13711764735",
                "price": 120,
                "name": "周鑫杰",
                "serviceTypeId": 23,
                "serviceId": 37708,
                "serviceTypeName": "温度传感器",
                "goodsName": "商品_1A",
                "usedCard": 0
            },
            {
                "profits": 246,
                "count": 2,
                "carnum": "粤CYD518",
                "goodModelId": 2553,
                "userId": 86966,
                "phone": "13711764735",
                "price": 246,
                "name": "周鑫杰",
                "serviceTypeId": 22,
                "serviceId": 37709,
                "serviceTypeName": "冷凝器",
                "goodsName": "444_123123",
                "usedCard": 0
            },
            {
                "profits": 12,
                "count": 1,
                "carnum": "粤CYD518",
                "goodModelId": 2430,
                "userId": 86966,
                "phone": "13711764735",
                "price": 12,
                "name": "周鑫杰",
                "serviceTypeId": 21,
                "serviceId": 449130,
                "serviceTypeName": "汽车空调",
                "goodsName": "车宝_11",
                "usedCard": 0
            },
            {
                "profits": 2,
                "count": 1,
                "carnum": "粤CYD518",
                "goodModelId": 2429,
                "userId": 86966,
                "phone": "13711764735",
                "price": 12,
                "name": "周鑫杰",
                "serviceTypeId": 21,
                "serviceId": 37675,
                "serviceTypeName": "汽车空调",
                "goodsName": "机油_大",
                "usedCard": 1
            },
            {
                "profits": 2,
                "count": 1,
                "carnum": "粤CYD518",
                "goodModelId": 2429,
                "userId": 86966,
                "phone": "13711764735",
                "price": 12,
                "name": "周鑫杰",
                "serviceTypeId": 21,
                "serviceId": 37697,
                "serviceTypeName": "汽车空调",
                "goodsName": "机油_大",
                "usedCard": 1
            },
            {
                "profits": 12,
                "count": 1,
                "carnum": "粤CYD518",
                "goodModelId": 2429,
                "userId": 86966,
                "phone": "13711764735",
                "price": 12,
                "name": "周鑫杰",
                "serviceTypeId": 21,
                "serviceId": 37698,
                "serviceTypeName": "汽车空调",
                "goodsName": "机油_大",
                "usedCard": 0
            },
            {
                "profits": 12,
                "count": 1,
                "carnum": "粤CYD518",
                "goodModelId": 2429,
                "userId": 86966,
                "phone": "13711764735",
                "price": 12,
                "name": "周鑫杰",
                "serviceTypeId": 21,
                "serviceId": 449130,
                "serviceTypeName": "汽车空调",
                "goodsName": "机油_大",
                "usedCard": 1
            },
            {
                "profits": 10,
                "count": 1,
                "carnum": "粤D78578",
                "goodModelId": 4153,
                "userId": 86997,
                "phone": "-",
                "price": 10,
                "name": "-",
                "serviceTypeId": 181,
                "serviceId": 449173,
                "serviceTypeName": "方向盘",
                "goodsName": "无法施工_10",
                "usedCard": 0
            },
            {
                "profits": 1,
                "count": 1,
                "carnum": "粤D78578",
                "goodModelId": 4152,
                "userId": 86997,
                "phone": "-",
                "price": 1,
                "name": "-",
                "serviceTypeId": 181,
                "serviceId": 449173,
                "serviceTypeName": "方向盘",
                "goodsName": "嗯嗯_10",
                "usedCard": 0
            },
            {
                "profits": -0.13,
                "count": 1,
                "carnum": "粤D78578",
                "goodModelId": 4136,
                "userId": 86997,
                "phone": "-",
                "price": 10,
                "name": "-",
                "serviceTypeId": 141,
                "serviceId": 449173,
                "serviceTypeName": "换向器",
                "goodsName": "鑫姐_女",
                "usedCard": 0
            },
            {
                "profits": 100,
                "count": 1,
                "carnum": "粤DASDAS",
                "goodModelId": 4212,
                "userId": 87052,
                "phone": "-",
                "price": 100,
                "name": "-",
                "serviceTypeId": 251,
                "serviceId": 449341,
                "serviceTypeName": "玻璃",
                "goodsName": "1664_1664",
                "usedCard": 0
            },
            {
                "profits": 400,
                "count": 4,
                "carnum": "粤DASDAS",
                "goodModelId": 4212,
                "userId": 87052,
                "phone": "-",
                "price": 400,
                "name": "-",
                "serviceTypeId": 251,
                "serviceId": 449342,
                "serviceTypeName": "玻璃",
                "goodsName": "1664_1664",
                "usedCard": 0
            },
            {
                "profits": 0,
                "count": 1,
                "carnum": "粤E14R21",
                "goodModelId": 4134,
                "userId": 87057,
                "phone": "-",
                "price": 10,
                "name": "-",
                "serviceTypeId": 141,
                "serviceId": 37754,
                "serviceTypeName": "换向器",
                "goodsName": "鑫姐_女",
                "usedCard": 0
            },
            {
                "profits": 200,
                "count": 1,
                "carnum": "粤E14R21",
                "goodModelId": 4116,
                "userId": 87057,
                "phone": "-",
                "price": 200,
                "name": "-",
                "serviceTypeId": 76,
                "serviceId": 37754,
                "serviceTypeName": "膨胀阀",
                "goodsName": "9898_98",
                "usedCard": 0
            },
            {
                "profits": -0.13,
                "count": 1,
                "carnum": "粤E5YD51",
                "goodModelId": 4136,
                "userId": 98462,
                "phone": "-",
                "price": 10,
                "name": "-",
                "serviceTypeId": 141,
                "serviceId": 449154,
                "serviceTypeName": "换向器",
                "goodsName": "鑫姐_女",
                "usedCard": 0
            },
            {
                "profits": 0,
                "count": 1,
                "carnum": "粤E5YD51",
                "goodModelId": 4134,
                "userId": 98462,
                "phone": "-",
                "price": 10,
                "name": "-",
                "serviceTypeId": 141,
                "serviceId": 449154,
                "serviceTypeName": "换向器",
                "goodsName": "鑫姐_女",
                "usedCard": 0
            },
            {
                "profits": 10,
                "count": 2,
                "carnum": "粤EEEEEE",
                "goodModelId": 4153,
                "userId": 98489,
                "phone": "-",
                "price": 10,
                "name": "-",
                "serviceTypeId": 181,
                "serviceId": 449336,
                "serviceTypeName": "方向盘",
                "goodsName": "无法施工_10",
                "usedCard": 0
            },
            {
                "profits": -0.13,
                "count": 1,
                "carnum": "粤EEEEEE",
                "goodModelId": 4136,
                "userId": 98489,
                "phone": "-",
                "price": 10,
                "name": "-",
                "serviceTypeId": 141,
                "serviceId": 449336,
                "serviceTypeName": "换向器",
                "goodsName": "鑫姐_女",
                "usedCard": 0
            },
            {
                "profits": 240,
                "count": 2,
                "carnum": "粤N54696",
                "goodModelId": 4116,
                "userId": 86963,
                "phone": "-",
                "price": 240,
                "name": "-",
                "serviceTypeId": 76,
                "serviceId": 37664,
                "serviceTypeName": "膨胀阀",
                "goodsName": "9898_98",
                "usedCard": 0
            },
            {
                "profits": 12,
                "count": 1,
                "carnum": "粤N54696",
                "goodModelId": 2429,
                "userId": 86963,
                "phone": "-",
                "price": 12,
                "name": "-",
                "serviceTypeId": 21,
                "serviceId": 37664,
                "serviceTypeName": "汽车空调",
                "goodsName": "机油_大",
                "usedCard": 1
            },
            {
                "profits": 10,
                "count": 1,
                "carnum": "粤R15353",
                "goodModelId": 4153,
                "userId": 86999,
                "phone": "-",
                "price": 10,
                "name": "-",
                "serviceTypeId": 181,
                "serviceId": 449306,
                "serviceTypeName": "方向盘",
                "goodsName": "无法施工_10",
                "usedCard": 0
            },
            {
                "profits": 2,
                "count": 1,
                "carnum": "粤R15353",
                "goodModelId": 2429,
                "userId": 86999,
                "phone": "-",
                "price": 12,
                "name": "-",
                "serviceTypeId": 21,
                "serviceId": 449306,
                "serviceTypeName": "汽车空调",
                "goodsName": "机油_大",
                "usedCard": 1
            },
            {
                "profits": -0.13,
                "count": 1,
                "carnum": "粤W4RE5E",
                "goodModelId": 4136,
                "userId": 87056,
                "phone": "-",
                "price": 10,
                "name": "-",
                "serviceTypeId": 141,
                "serviceId": 37753,
                "serviceTypeName": "换向器",
                "goodsName": "鑫姐_女",
                "usedCard": 0
            },
            {
                "profits": 200,
                "count": 1,
                "carnum": "粤W4RE5E",
                "goodModelId": 4116,
                "userId": 87056,
                "phone": "-",
                "price": 200,
                "name": "-",
                "serviceTypeId": 76,
                "serviceId": 37753,
                "serviceTypeName": "膨胀阀",
                "goodsName": "9898_98",
                "usedCard": 0
            }
        ],
        "pageCount": 70
    }];

    var map = {},
        dest = [];
    for(var i = 0; i < arr.length; i++){
        var ai = arr[i];
        if(!map[ai.Group]){
            dest.push({
                Group: ai.Group,

                data: [ai]
            });
            map[ai.Group] = ai;
        }else{
            for(var j = 0; j < dest.length; j++){
                var dj = dest[j];
                if(dj.Group == ai.Group){
                    dj.data.push(ai);
                    break;
                }
            }
        }
    }
    console.log(JSON.stringify(dest));
    alert(dest);
    var sapn = document.getElementById("span");
    span.innerHTML = JSON.stringify(dest);
</script>
</html>
