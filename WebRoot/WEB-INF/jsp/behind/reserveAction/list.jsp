<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
<head>
    <title>预约列表</title>
    <%@ include file="/WEB-INF/jsp/behind/public/common.jspf" %>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 考试预约信息管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
            	<td width="200px">预约日期</td>
                <td width="300px">预约说明</td>
                <td width="200px">预约科目</td>
                <td width="100">所属教练</td>
                <td width="100">预约学员</td>
                <td>相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="reserveList">
        
        <s:iterator value="#reserveList">
			<tr class="TableDetail1 template">
				<td>${date}&nbsp;</td>
				<td>${description}&nbsp;</td>
				<td>${type}&nbsp;</td>
				<td>${coach.name}&nbsp;</td>
				<td>${student.name}</td>
				<td>
					<s:a action="reserve_delete?id=%{id}" onclick="return confirm('确定要删除吗？')">删除</s:a>
					<s:a action="reserve_editUI?id=%{id}">修改</s:a>
				</td>
			</tr>
        </s:iterator>

        </tbody>
    </table>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
		<div id="TableTail_inside">
			<s:a action="reserve_addUI"><img src="${pageContext.request.contextPath}/style/images/createNew.png" /></s:a>
        </div>
    </div>
</div>
</body>
</html>