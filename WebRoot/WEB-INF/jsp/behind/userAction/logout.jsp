<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
	<title>已退出驾校管理系统</title>
     <%@ include file="/WEB-INF/jsp/behind/public/common.jspf" %>
	<link href="${pageContext.request.contextPath}/style/blue/logout.css" rel="stylesheet" type="text/css">
</head>

<body>
	<table border=0 cellspacing=0 cellpadding=0 width=100% height=100%>
		<tr>
			<td align=center>
				<div id=Logout>
					<div id=AwokeMsg>
                        <img id=LogoutImg src="${pageContext.request.contextPath}/style/blue/images/logout/1.png" border=0>
                        <img id=LogoutTitle src="${pageContext.request.contextPath}/style/blue/images/logout/2.png" border=0>
                    </div>
					<div id=LogoutOperate>
                        <img src="${pageContext.request.contextPath}/style/blue/images/logout/logout2.gif" border=0> 
                        <a href="${pageContext.request.contextPath}/user_loginUI.action">重新进入系统</a> 
                        
                    </div>
				</div>
			</td>
		</tr>
	</table>
</body>
</html>
