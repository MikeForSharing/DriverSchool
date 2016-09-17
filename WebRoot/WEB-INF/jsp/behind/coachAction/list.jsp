<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
<head>
    <title>教练列表</title>
    <%@ include file="/WEB-INF/jsp/behind/public/common.jspf" %>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 教练管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
            	<td width="200px">教练名称</td>
            	<td width="150px">教练所属组</td>
                <td width="300px">教练介绍</td>
                <td>相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="coachList">
        
        <s:iterator value="#coachList">
			<tr class="TableDetail1 template">
				<td><s:a action="coach_list?parentId=%{id}">${name}&nbsp;</s:a></td>
				<td>${parent.name}&nbsp;</td>
				<td>${description}&nbsp;</td>
				<td>
					<s:a action="coach_delete?id=%{id}&parentId=%{parent.id}" onclick="return confirm('确定要删除吗？')">删除</s:a>
					<s:a action="coach_editUI?id=%{id}">修改</s:a>
				</td>
			</tr>
        </s:iterator>

        </tbody>
    </table>
    
 
    <div id="TableTail">
		<div id="TableTail_inside">
		    <!-- 新建部门 -->
			<s:a action="coach_addUI?parentId=%{parentId}"><img src="${pageContext.request.contextPath}/style/images/createNew.png" /></s:a>
			<!--返回上一级  -->
			<s:a action="coach_list?parentId=%{#parent.parent.id}"><img src="${pageContext.request.contextPath}/style/blue/images/button/ReturnToPrevLevel.png" /></s:a>
        </div>
    </div>
</div>
</body>
</html>