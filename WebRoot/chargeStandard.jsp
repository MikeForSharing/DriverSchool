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
  
  
  	  <div id="right" style="margin-top:5px; ">
			<div id="title" style="text-align:center;">
				<span class="sp4"><font size="6" face="微软雅黑">收费标准</font></span>
			</div>
			<br>
			<div id="con_1">
				<table border="0" cellspacing="0" cellpadding="0" id="tab3" align="center">
                  <tr>
                    <td nowrap><strong>课程类型</strong></td>
                    <td nowrap><strong>标准价格</strong></td>
                    <td nowrap><strong>优惠价格</strong></td>
                    <td nowrap><strong>详细情况</strong></td>
                    <td nowrap><strong></strong></td>
                  </tr>
                  
                    <tr>
                    <td nowrap>爱丽舍平时班</td>
                    <td nowrap><font style='color:#ff0000; text-decoration:line-through '>￥4600</font></td>
                    <td><font style='color:#ff0000;'>￥4200</font></td>
                    <td><span style="font: 13px/24px Simsun; color: rgb(0, 0, 0); text-transform: none; text-indent: 0px; letter-spacing: normal; word-spacing: 0px; float: none; display: inline !important; white-space: normal; font-size-adjust: none; font-stretch: normal; -webkit-text-stroke-width: 0px;">共78小时,含练车50小时，一人一车，周一至周五练车！</span></td>
                    <td nowrap><a href='tencent://message/?uin=1031302185&Site=点击这里给我发消息&Menu=yes' class='a3'></a>  <a href='bm.asp' class='a3'></a></td>
                  </tr>
					
                    <tr>
                    <td nowrap>爱丽舍周末班</td>
                    <td nowrap><font style='color:#ff0000; text-decoration:line-through '>￥5700</font></td>
                    <td><font style='color:#ff0000;'>￥4600</font></td>
                    <td><span style="font: 13px/24px Simsun; color: rgb(0, 0, 0); text-transform: none; text-indent: 0px; letter-spacing: normal; word-spacing: 0px; float: none; display: inline !important; white-space: normal; font-size-adjust: none; font-stretch: normal; -webkit-text-stroke-width: 0px;">共78小时,含练车50小时，一人一车，周一至周日练车！</span></td>
                    <td nowrap><a href='tencent://message/?uin=1031302185&Site=点击这里给我发消息&Menu=yes' class='a3'></a>  <a href='bm.asp' class='a3'></a></td>
                  </tr>
					
                    <tr>
                    <td nowrap>自动档平时班</td>
                    <td nowrap><font style='color:#ff0000; text-decoration:line-through '>￥5500</font></td>
                    <td><font style='color:#ff0000;'>￥4600</font></td>
                    <td><span style="font: 13px/24px Simsun; color: rgb(0, 0, 0); text-transform: none; text-indent: 0px; letter-spacing: normal; word-spacing: 0px; float: none; display: inline !important; white-space: normal; font-size-adjust: none; font-stretch: normal; -webkit-text-stroke-width: 0px;">一人一车，周一至周五练车！活动限200人!</span></td>
                    <td nowrap><a href='tencent://message/?uin=1031302185&Site=点击这里给我发消息&Menu=yes' class='a3'></a>  <a href='bm.asp' class='a3'></a></td>
                  </tr>
					
                    <tr>
                    <td nowrap>自动档周末</td>
                    <td nowrap><font style='color:#ff0000; text-decoration:line-through '>￥6000</font></td>
                    <td><font style='color:#ff0000;'>￥5000</font></td>
                    <td><span style="font: 13px/24px Simsun; color: rgb(0, 0, 0); text-transform: none; text-indent: 0px; letter-spacing: normal; word-spacing: 0px; float: none; display: inline !important; white-space: normal; orphans: 2; widows: 2; font-size-adjust: none; font-stretch: normal; -webkit-text-stroke-width: 0px;">一人一车，周一至周日练车！活动限200人!</span></td>
                    <td nowrap><a href='tencent://message/?uin=1031302185&Site=点击这里给我发消息&Menu=yes' class='a3'></a>  <a href='bm.asp' class='a3'></a></td>
                  </tr>
					
                    <tr>
                    <td nowrap>伊兰特平时班</td>
                    <td nowrap><font style='color:#ff0000; text-decoration:line-through '>￥4500</font></td>
                    <td><font style='color:#ff0000;'>￥4200</font></td>
                    <td><span style="font: 13px/24px Simsun; color: rgb(0, 0, 0); text-transform: none; text-indent: 0px; letter-spacing: normal; word-spacing: 0px; float: none; display: inline !important; white-space: normal; font-size-adjust: none; font-stretch: normal; -webkit-text-stroke-width: 0px;">共78小时，含练车50小时，一人一车，周一至周五练车！</span></td>
                    <td nowrap><a href='tencent://message/?uin=1031302185&Site=点击这里给我发消息&Menu=yes' class='a3'></a>  <a href='bm.asp' class='a3'></a></td>
                  </tr>
					
                    <tr>
                    <td nowrap>伊兰特周末班</td>
                    <td nowrap><font style='color:#ff0000; text-decoration:line-through '>￥5700</font></td>
                    <td><font style='color:#ff0000;'>￥4600</font></td>
                    <td><span style="font: 13px/24px Simsun; color: rgb(0, 0, 0); text-transform: none; text-indent: 0px; letter-spacing: normal; word-spacing: 0px; float: none; display: inline !important; white-space: normal; font-size-adjust: none; font-stretch: normal; -webkit-text-stroke-width: 0px;">共78小时，含练车50小时,一人一车，周一至周日练车！</span></td>
                    <td nowrap><a href='tencent://message/?uin=1031302185&Site=点击这里给我发消息&Menu=yes' class='a3'></a> <a href='bm.asp' class='a3'></a></td>
                  </tr>
					
                    <tr>
                    <td nowrap>伊兰特平时连续班</td>
                    <td nowrap><font style='color:#ff0000; text-decoration:line-through '>￥5200</font></td>
                    <td><font style='color:#ff0000;'>￥4600</font></td>
                    <td><span style="font: 13px/24px Simsun; color: rgb(0, 0, 0); text-transform: none; text-indent: 0px; letter-spacing: normal; word-spacing: 0px; float: none; display: inline !important; white-space: normal; font-size-adjust: none; font-stretch: normal; -webkit-text-stroke-width: 0px;">交规合格后,练车听从驾校按排,单人单车,拿本快!</span></td>
                    <td nowrap><a href='tencent://message/?uin=1031302185&Site=点击这里给我发消息&Menu=yes' class='a3'></a>  <a href='bm.asp' class='a3'></a></td>
                  </tr>
					
                    <tr>
                    <td nowrap>伊兰特周末连续班</td>
                    <td nowrap><font style='color:#ff0000; text-decoration:line-through '>￥5700</font></td>
                    <td><font style='color:#ff0000;'>￥5000</font></td>
                    <td><span style="font: 13px/24px Simsun; color: rgb(0, 0, 0); text-transform: none; text-indent: 0px; letter-spacing: normal; word-spacing: 0px; float: none; display: inline !important; white-space: normal; font-size-adjust: none; font-stretch: normal; -webkit-text-stroke-width: 0px;">交规合格后,练车听从驾校按排,单人单车,拿本快!</span></td>
                    <td nowrap><a href='tencent://message/?uin=1031302185&Site=点击这里给我发消息&Menu=yes' class='a3'></a> <a href='bm.asp' class='a3'></a></td>
                  </tr>
					
                    <tr>
                    <td nowrap>自动档老年班</td>
                    <td nowrap><font style='color:#ff0000; text-decoration:line-through '>￥6800</font></td>
                    <td><font style='color:#ff0000;'>￥5800</font></td>
                    <td><SPAN style="TEXT-TRANSFORM: none; TEXT-INDENT: 0px; DISPLAY: inline !important; FONT: 13px/24px Simsun; WHITE-SPACE: normal; FLOAT: none; LETTER-SPACING: normal; COLOR: rgb(0,0,0); WORD-SPACING: 0px; -webkit-text-stroke-width: 0px">一人一车，周一至周日练车！随来随学不用约车!</SPAN></td>
                    <td nowrap><a href='tencent://message/?uin=1031302185&Site=点击这里给我发消息&Menu=yes' class='a3'></a>  <a href='bm.asp' class='a3'></a></td>
                  </tr>
					
                    
					
                </table>
			</div>

	</table>
  </body>
</html>
