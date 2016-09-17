<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>

    <style>
		body{background-color:#E0FFFF}
	</style>


	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body bgcolor="#FF0000">
  
  <table border='0'cellspacing="0" cellpadding="0"  rules=none align="center" WIDTH=900 HEIGHT=260>	  
  	  <tr>
	  	<td>
	  		<div style="text-align:center;top:150px;left:200px;width:900px;height:0x;">
	  		<span>
	  			<font size="6" face="微软雅黑">证件要求</font>
	  		</span>
		</div>
	  	</td>
	  </tr>
  
 
  
	  	<tr>
	  		<td>
			<div>
				<font>
<DIV><STRONG>Ⅰ报名手续<BR></STRONG>1、照片：需交同一底版白底一寸彩色证件照6张<BR>2、证件：（1）有效期内的居民身份证原件或3个月有效期的临时身份证原件。<BR>（2）外地学员还须交一年有效期暂住证原件。<BR>（3）增驾学员请带驾驶证原件。<BR>3、体检：学员需到市卫生局指定车管所备案的139家医院进行体检。<BR>4、备注：军人报名需持军人身份证明及团级以上政治部（处）出具的证明信。</DIV>

				</font>
			</div>
		</td>
		</tr>
	</table>
  </body>
</html>
