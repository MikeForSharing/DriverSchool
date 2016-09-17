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
	  			<font size="6" face="微软雅黑">驾校优势</font>
	  		</span>
		</div>
	  	</td>
	  </tr>
  
 
  
	  	<tr>
	  		<td>
			<div>
				<font>
 					<DIV>1、拥有一支经验丰富，技术过硬，纪律严明的教练员队伍。培训正规，考试通过率高，出证快捷。  
 					<BR>2、300亩超大型园林化训练场地，训练设施严格按照交通部门建设，科目齐全。 
 					<BR>3、是全省拥有车辆多;新;齐全的驾校，拥有全新智能驾驶模拟器，使学员熟练掌握驾驶技能,完美模拟驾驶,解决学车难题！
 					<BR>4、是石家庄市驾管所直属的机动车驾驶员考试分场，学员不出校门就可以参加所有的科目考试，实行报名，培训，考试，取证一条龙服务。 
 					<BR>5、校风廉正，没有吃喝勒索现象，中途无乱收费现象，先参观后交费。 
 					<BR>6、收费合理， 随到随学，节假日不休息。 根据学员时间预约安排练车。 
 					<br>7、我校实行一人一车一教练，网上、电话或现场预约练车，学车更便捷。
 					<BR></DIV>

				</font>
			</div>
		</td>
		</tr>
	</table>
  </body>
</html>
