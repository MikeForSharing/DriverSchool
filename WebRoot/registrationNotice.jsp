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
	  			<font size="6" face="微软雅黑">报名须知</font>
	  		</span>
		</div>
	  	</td>
	  </tr>
  
 
  
	  	<tr>
	  		<td>
			<div>
				<font>
 					<DIV>1、年龄条件： 申请小型汽车(C1)、小型自动档汽车(C2)、轻便摩托车(F)，在18周岁以上，70周岁以下。申请三轮摩托车(D)、两轮摩托车(E)准驾车型的，在18周岁以上，60周岁以下。<BR>2、视力：两眼裸视力或者矫正视力达到对数视力表4.9以上，无红绿色盲。<BR>3、听力：两耳分别距音叉50厘米能辨别声源方向。<BR>4、上肢：双手拇指健全，每只手其它手指必须有三指健全，肢体和手指运动功能正常。<BR>5、下肢：运动功能正常，申请驾驶手动档汽车，下肢不等长度不得大于5厘米；申请自动档汽车右下肢应当健全。<BR>6、躯干、颈部：无运动功能障碍。<BR><STRONG></STRONG></DIV>

				</font>
			</div>
		</td>
		</tr>
	</table>
  </body>
</html>
