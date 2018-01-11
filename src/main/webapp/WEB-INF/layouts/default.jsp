<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html>
<head>
    <title>QuickStart示例:<sitemesh:title/></title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <meta http-equiv="Cache-Control" content="no-store" />
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Expires" content="0" />

    <link type="image/x-icon" href="${ctx}/static/images/favicon.ico" rel="shortcut icon">
    <link href="${ctxStatic}/bootstrap4/css/bootstrap.css" type="text/css" rel="stylesheet" />
    <link href="${ctxStatic}/jquery-validation/1.11.0/validate.css" type="text/css" rel="stylesheet" />
    <link href="${ctx}/css/base/default.css" type="text/css" rel="stylesheet" />
    <script src="${ctxStatic}/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="${ctx}/sc/jquery-validation/1.11.0/jquery.validate.min.js" type="text/javascript"></script>
    <script src="${ctx}/sc/jquery-validation/1.11.0/messages_bs_zh.js" type="text/javascript"></script>

    <sitemesh:head/>
</head>

<body>
<div class="container">
    <%@ include file="/WEB-INF/layouts/header.jsp"%>
    <div id="content">
        <sitemesh:body/>
    </div>
    <%@ include file="/WEB-INF/layouts/footer.jsp"%>
</div>
<script src="${ctx}/sc/bootstrap/2.3.0/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>