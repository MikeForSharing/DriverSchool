<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/behind/public/common.jspf" %>

<html>
<head>
	<title>用户信息</title>
</head>
<body>

<!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 用户信息设置
        </div>
        <div id="Title_End"></div>
    </div>
</div>








<!--显示表单内容-->
<div id=MainArea>







    <s:form action="user_%{id == null ? 'add' : 'edit'}">
    	<s:hidden name="id"></s:hidden>
        
        <div class="ItemBlock_Title1"><!-- 信息说明 -->
        	<div class="ItemBlock_Title1">
        		<img border="0" width="4" height="7" src="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 用户信息 
        	</div> 
        </div>
        
        <table cellpadding="0" cellspacing="0" class="mainForm">
        </table>
        
        
        
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr><td width="100">选择教练</td>
                        <td>
                        	<s:select name="coachId" cssClass="SelectStyle"
                        		list="#coachList" listKey="id" listValue="name"
                        		headerKey="" headerValue="==请选择教练=="
                        	/>
                        </td>
                    </tr>
                    <tr><td>登录名（唯一）</td>
                        <td><s:textfield name="loginName" cssClass="InputStyle"/> 
							
						</td>
                    </tr>
                    <tr><td>姓名</td>
                        <td><s:textfield name="name" cssClass="InputStyle"/> </td>
                    </tr>
					<tr><td>性别</td>
                        <td>
							<s:radio name="gender" list="{'男', '女'}"></s:radio>

						</td>
                    </tr>
					<tr><td>联系电话</td>
                        <td><s:textfield name="phoneNumber" cssClass="InputStyle"/></td>
                    </tr>
                    <tr><td>E-mail</td>
                        <td><s:textfield name="email" cssClass="InputStyle"/></td>
                    </tr>
                    <tr><td>备注</td>
                        <td><s:textarea name="description" cssClass="TextareaStyle"></s:textarea></td>
                    </tr>
                </table>
            </div>
        </div>
     
 
 
 
 
 
 
 
		<div class="ItemBlock_Title1"><!-- 信息说明 --><div class="ItemBlock_Title1">
        	<img border="0" width="4" height="7" src="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 车辆设置 </div> 
        </div>
        
        <!-- 表单内容显示-车辆 -->
        <div class="ItemBlockBorder">    <!-- 白框蓝色边界 -->
            <div class="ItemBlock">      <!-- 白色背景框 -->
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr>
                        <td>
                        	<s:select name="carIds" cssClass="SelectStyle"
                        		multiple="	true" size="10" 
                        		list="#carList" listKey="id" listValue="name"
                        	/>按住Ctrl键可以多选或取消选择
                        </td>
                    </tr>
                </table>
            </div>
        </div>		
		
		
		
		
		
		
		
		<div class="ItemBlock_Title1"><!-- 信息说明 --><div class="ItemBlock_Title1">
        	<img border="0" width="4" height="7" src="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 岗位设置 </div> 
        </div>
		
		<!-- 表单内容显示-岗位 -->
        <div class="ItemBlockBorder">    <!-- 白框蓝色边界 -->
            <div class="ItemBlock">      <!-- 白色背景框 -->
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr>
                        <td>
                        	<s:select name="roleIds" cssClass="SelectStyle"
                        		multiple="	true" size="10" 
                        		list="#roleList" listKey="id" listValue="name"
                        	/>按住Ctrl键可以多选或取消选择
                        </td>
                    </tr>
                </table>
            </div>
        </div>		
		
		
		
		
		
		
		
		

        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <input type="image" src="${pageContext.request.contextPath}/style/images/save.png"/>
            <a href="javascript:history.go(-1);"><img src="${pageContext.request.contextPath}/style/images/goBack.png"/></a>
        </div>
    </s:form>















</div>













<div class="Description">
	说明：<br />
	1，用户的登录名要唯一，在填写时要同时检测是否可用。<br /> 
	2，新建用户后，密码被初始化为"hadoop"。<br />
	3，密码在数据库中存储的是MD5摘要（不是存储明文密码）。<br />
</div>

</body>
</html>

