<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="com.lhh.car.domain.Navigation;" %>
<html>
<head>
    <title>驾校车辆列表</title>
    <%@ include file="/WEB-INF/jsp/behind/public/common.jspf" %>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 证件要求
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<%
Navigation navi = (Navigation)ActionContext.getContext().getValueStack().pop();
%>

<div id="MainArea">
    <table border='0'cellspacing="0" cellpadding="0"  rules=none align="center" WIDTH=900 HEIGHT=260>
  	  <tr>
	  	<td>
	  		<div style="text-align:center;top:150px;left:200px;width:900px;height:0x;">
	  		<span>
	  			<font size="6" face="微软雅黑"><%= navi.getName() %></font>
	  		</span>
		</div>
	  	</td>
	  </tr>
	  <tr>
	  	<td>
			<div>
				<font size="4" face="微软雅黑">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= navi.getDescription() %>
				</font>
			</div>
		</td>
	 </tr>

    </table>
</div>
</body>
</html>