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
	  			<font size="6" face="微软雅黑">学车攻略</font>
	  		</span>
		</div>
	  	</td>
	  </tr>
  
 
  
	  	<tr>
	  		<td>
			<div>
				<font>
					&nbsp;&nbsp; 首先我们要知道，改革之后的科目一考试，学员必须至少参加两次驾校组织的科目一理论课程学习，复习时可参考网上流传的2013题库进行练习，考试内容涉及到交通法律法规、交通标志、驾驶安全知识等，下面总结了一下几个交规理论考试答题技巧：
第一，快速浏览。就是先快速把资料上的全部题目和答案浏览一遍，选择题只需看答案，其他选项不必看，因为第一印象很重要，把答案记住了，以后做题就有个初步印象。
第二，缩小范围。在题库里有许多简单题是你确定不会答错的，将这些简单题删除，不需要再看第二遍。这样，余下的题大概就只剩二分之一左右了(因人而异)。
第三，再次筛选。将余下的题按顺序从头到尾练习一遍。每做完一部分题之后，把自己做错的题和吃不准的题用红色字体突出标记(或单独保存在一个新建的word文档里，打印出来更好)，单独对这些题加强记忆，特别是临考前重点突击一下。
第四，总结规律。对一些只能死记硬背的题(如?米、?元、?公里等)，总结一下规律，找到便于自己记忆的方式。

				</font>
			</div>
		</td>
		</tr>
	</table>
  </body>
</html>
