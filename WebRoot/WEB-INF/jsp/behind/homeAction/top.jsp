<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
	<title>TopMenu</title>
	<%@ include file="/WEB-INF/jsp/behind/public/common.jspf" %>
	<LINK href="${pageContext.request.contextPath}/style/blue/top.css" type=text/css rel=stylesheet>
	
	<script type="text/javascript">
	</script>
	<style type="text/css">
		#messageArea{
			color: white;
			font-size: 14px;
			font-weight: bold;
		}
	</style>
</head>

<body CLASS=PageBody leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
	
	<div id="Head1">
		<div id="Logo">
        	<iframe name="autoRefashion" src="" width="0" height="0"></iframe> 
			<a id="msgLink" href="javascript:void(0)"></a>
            <font color="#0000CC" style="color:#F1F9FE; font-size:28px; font-family:Arial Black, Arial">驾校管理系统</font> 
        </div>

		<div id="Head1Right">
			<div id="Head1Right_UserName">
                <img border="0" width="13" height="14" src="${pageContext.request.contextPath}/style/images/top/user.gif" /> 欢迎您：<b>${user.name }</b>
			</div>
			<div id="Head1Right_UserDept"></div>
			<div id="Head1Right_UserSetup">
			
				</div>
		</div>
	</div>
    
    <div id="Head2">
        <div id="Head2_FunctionList" style="text-align: left">
        	<a href="javascript: window.parent.right.location.reload(true);">刷新</a>&nbsp
        	<a href="${pageContext.request.contextPath}/user_logout.action" target="_parent">
            退出系统
            </a>
        </div>
    </div>

</body>

</html>
