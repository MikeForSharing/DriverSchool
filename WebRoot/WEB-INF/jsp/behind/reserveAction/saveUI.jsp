<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>

<html>
<head>
	<title>考试预约设置</title>
	<sx:head/>
    <%@ include file="/WEB-INF/jsp/behind/public/common.jspf" %>
</head>
<body> 

<!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 考试预约信息设置
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id="MainArea">

    <s:form action="reserve_%{ id == null ? 'add' : 'edit' }">
    	<s:hidden name="id"></s:hidden>
    
        <div class="ItemBlock_Title1">
        <!-- 信息说明-->
        	<DIV CLASS="ItemBlock_Title1">
        		<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 预约信息 
        	</DIV>  
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
                    
                    
                    
                    <tr><td width="100">选择学员</td>
                        <td>
                        	<s:select name="studentId" cssClass="SelectStyle"
                        		list="#studentList" listKey="id" listValue="name"
                        		headerKey="" headerValue="==请选择学员=="
                        	/>
                        </td>
                    </tr>
                    
                    
                    <tr>
                        <td width="100">预约日期</td>
                        <td><sx:datetimepicker label="" name="date" ></sx:datetimepicker></td>
                    </tr>
                    <tr>
                        <td>预约说明</td>
                        <td><s:textarea name="description" cssClass="TextareaStyle"  ></s:textarea></td>
                    </tr>
                    <tr>
                        <td>预约科目</td>
                        <td><s:textarea name="type" cssClass="TextareaStyle"></s:textarea></td>
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

</body>
</html>

