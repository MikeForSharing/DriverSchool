<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>登录驾校管理系统</title>
<style>



html, body

{

    height: 100%;

}



body

{

    font: 12px 'Lucida Sans Unicode', 'Trebuchet MS', Arial, Helvetica;    

    margin: 0;

    background-color: #d9dee2;

    background-image: -webkit-gradient(linear, left top, left bottom, from(#ebeef2), to(#d9dee2));

    background-image: -webkit-linear-gradient(top, #ebeef2, #d9dee2);

    background-image: -moz-linear-gradient(top, #ebeef2, #d9dee2);

    background-image: -ms-linear-gradient(top, #ebeef2, #d9dee2);

    background-image: -o-linear-gradient(top, #ebeef2, #d9dee2);

    background-image: linear-gradient(top, #ebeef2, #d9dee2);    

}



/*--------------------*/



#login

{

    background-color: #fff;

    background-image: -webkit-gradient(linear, left top, left bottom, from(#fff), to(#eee));

    background-image: -webkit-linear-gradient(top, #fff, #eee);

    background-image: -moz-linear-gradient(top, #fff, #eee);

    background-image: -ms-linear-gradient(top, #fff, #eee);

    background-image: -o-linear-gradient(top, #fff, #eee);

    background-image: linear-gradient(top, #fff, #eee);  

    height: 240px;

    width: 400px;

    margin: -150px 0 0 -230px;

    padding: 30px;

    position: absolute;

    top: 50%;

    left: 50%;

    z-index: 0;

    -moz-border-radius: 3px;

    -webkit-border-radius: 3px;

    border-radius: 3px;  

    -webkit-box-shadow:

          0 0 2px rgba(0, 0, 0, 0.2),

          0 1px 1px rgba(0, 0, 0, .2),

          0 3px 0 #fff,

          0 4px 0 rgba(0, 0, 0, .2),

          0 6px 0 #fff,  

          0 7px 0 rgba(0, 0, 0, .2);

    -moz-box-shadow:

          0 0 2px rgba(0, 0, 0, 0.2),  

          1px 1px   0 rgba(0,   0,   0,   .1),

          3px 3px   0 rgba(255, 255, 255, 1),

          4px 4px   0 rgba(0,   0,   0,   .1),

          6px 6px   0 rgba(255, 255, 255, 1),  

          7px 7px   0 rgba(0,   0,   0,   .1);

    box-shadow:

          0 0 2px rgba(0, 0, 0, 0.2),  

          0 1px 1px rgba(0, 0, 0, .2),

          0 3px 0 #fff,

          0 4px 0 rgba(0, 0, 0, .2),

          0 6px 0 #fff,  

          0 7px 0 rgba(0, 0, 0, .2);

}



#login:before

{

    content: '';

    position: absolute;

    z-index: -1;

    border: 1px dashed #ccc;

    top: 5px;

    bottom: 5px;

    left: 5px;

    right: 5px;

    -moz-box-shadow: 0 0 0 1px #fff;

    -webkit-box-shadow: 0 0 0 1px #fff;

    box-shadow: 0 0 0 1px #fff;

}



/*--------------------*/



h1

{

    text-shadow: 0 1px 0 rgba(255, 255, 255, .7), 0px 2px 0 rgba(0, 0, 0, .5);

    text-transform: uppercase;

    text-align: center;

    color: #666;

    margin: 0 0 30px 0;

    letter-spacing: 4px;

    font: normal 26px/1 Verdana, Helvetica;

    position: relative;

}



h1:after, h1:before

{

    background-color: #777;

    content: "";

    height: 1px;

    position: absolute;

    top: 15px;

    width: 120px;   

}



h1:after

{ 

    background-image: -webkit-gradient(linear, left top, right top, from(#777), to(#fff));

    background-image: -webkit-linear-gradient(left, #777, #fff);

    background-image: -moz-linear-gradient(left, #777, #fff);

    background-image: -ms-linear-gradient(left, #777, #fff);

    background-image: -o-linear-gradient(left, #777, #fff);

    background-image: linear-gradient(left, #777, #fff);      

    right: 0;

}



h1:before

{

    background-image: -webkit-gradient(linear, right top, left top, from(#777), to(#fff));

    background-image: -webkit-linear-gradient(right, #777, #fff);

    background-image: -moz-linear-gradient(right, #777, #fff);

    background-image: -ms-linear-gradient(right, #777, #fff);

    background-image: -o-linear-gradient(right, #777, #fff);

    background-image: linear-gradient(right, #777, #fff);

    left: 0;

}



/*--------------------*/



fieldset

{

    border: 0;

    padding: 0;

    margin: 0;

}



/*--------------------*/



#inputs input

{

    background: #f1f1f1 url(http://www.mycodes.net/login-sprite.png) no-repeat;

    padding: 15px 15px 15px 30px;

    margin: 0 0 10px 0;

    width: 353px; /* 353 + 2 + 45 = 400 */

    border: 1px solid #ccc;

    -moz-border-radius: 5px;

    -webkit-border-radius: 5px;

    border-radius: 5px;

    -moz-box-shadow: 0 1px 1px #ccc inset, 0 1px 0 #fff;

    -webkit-box-shadow: 0 1px 1px #ccc inset, 0 1px 0 #fff;

    box-shadow: 0 1px 1px #ccc inset, 0 1px 0 #fff;

}



#username

{
	position:absolute;
    left:33px;
    top:98px;
    z-index:0;

    background-position: 5px -2px !important;

}



#password

{
	position:absolute;
    left:33px;
    top:138px;
    z-index:0;
    background-position: 5px -52px !important;

}





#inputs input:focus

{

    background-color: #fff;

    border-color: #e8c291;

    outline: none;

    -moz-box-shadow: 0 0 0 1px #e8c291 inset;

    -webkit-box-shadow: 0 0 0 1px #e8c291 inset;

    box-shadow: 0 0 0 1px #e8c291 inset;

}



/*--------------------*/

#actions

{

    margin: 25px 0 0 0;

}

#a1 
{
	position:absolute;
    left:225px;
    top:205px;
    z-index:0;
    font-weight:bold;
}

#a2 
{
	position:absolute;
    left:360px;
    top:205px;
    z-index:0;
    font-weight:bold;
    
}

#submit

{		

	position:absolute;
    left:33px;
    top:205px;
    z-index:0;

    background-color: #ffb94b;

    background-image: -webkit-gradient(linear, left top, left bottom, from(#fddb6f), to(#ffb94b));

    background-image: -webkit-linear-gradient(top, #fddb6f, #ffb94b);

    background-image: -moz-linear-gradient(top, #fddb6f, #ffb94b);

    background-image: -ms-linear-gradient(top, #fddb6f, #ffb94b);

    background-image: -o-linear-gradient(top, #fddb6f, #ffb94b);

    background-image: linear-gradient(top, #fddb6f, #ffb94b);

    

    -moz-border-radius: 3px;

    -webkit-border-radius: 3px;

    border-radius: 3px;

    

    text-shadow: 0 1px 0 rgba(255,255,255,0.5);

    

     -moz-box-shadow: 0 0 1px rgba(0, 0, 0, 0.3), 0 1px 0 rgba(255, 255, 255, 0.3) inset;

     -webkit-box-shadow: 0 0 1px rgba(0, 0, 0, 0.3), 0 1px 0 rgba(255, 255, 255, 0.3) inset;

     box-shadow: 0 0 1px rgba(0, 0, 0, 0.3), 0 1px 0 rgba(255, 255, 255, 0.3) inset;    

    

    border-width: 1px;

    border-style: solid;

    border-color: #d69e31 #e3a037 #d5982d #e3a037;



    float: left;

    height: 35px;

    padding: 0;

    width: 120px;

    cursor: pointer;

    font: bold 15px Arial, Helvetica;

    color: #8f5a0a;

}



#submit:hover,#submit:focus

{		

    background-color: #fddb6f;

    background-image: -webkit-gradient(linear, left top, left bottom, from(#ffb94b), to(#fddb6f));

    background-image: -webkit-linear-gradient(top, #ffb94b, #fddb6f);

    background-image: -moz-linear-gradient(top, #ffb94b, #fddb6f);

    background-image: -ms-linear-gradient(top, #ffb94b, #fddb6f);

    background-image: -o-linear-gradient(top, #ffb94b, #fddb6f);

    background-image: linear-gradient(top, #ffb94b, #fddb6f);

}	



#submit:active

{		

    outline: none;

   

     -moz-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.5) inset;

     -webkit-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.5) inset;

     box-shadow: 0 1px 4px rgba(0, 0, 0, 0.5) inset;		

}



#submit::-moz-focus-inner

{

  border: none;

}



#actions a

{

    color: #3151A2;    

    float: right;

    line-height: 35px;

    margin-left: 10px;

}



/*--------------------*/



#back

{

    display: block;

    text-align: center;

    position: relative;

    top: 60px;

    color: #999;

}



</style>


<%@ include file="/WEB-INF/jsp/behind/public/common.jspf" %>
	<link href="${pageContext.request.contextPath}/style/blue/login.css" type=text/css rel=stylesheet>
	<script type="text/javascript">
		$(function(){
			document.forms[0].loginName.focus();
		});
		
		// 在被嵌套时就刷新上级窗口
		if(window.parent != window){
			window.parent.location.reload(true);
		}
	</script>


</head>


<body>





<s:form action="user_login" focusElement="loginNameInput" id="login">

	
    <h1>登录</h1>

    <fieldset id="inputs">

        <s:textfield name="loginName" size="25" tabindex="1"  id="username" /> 

        <s:password name="password" id="password" size="25" tabindex="2" showPassword="false" />


    </fieldset>

    <fieldset id="actions">

        <input type="submit" id="submit" value="Log in">

        <a id="a1" href="">Forgot your password?</a>
        <a id="a2" href="">Register</a>

    </fieldset>


</s:form>











<!-- 显示表单 -->
<!-- <s:form action="user_login" focusElement="loginNameInput"> -->
<!--                 <table BORDER=0 CELLSPACING=0 CELLPADDING=0 width=100%> -->
<!--                 	<tr> -->
<!--                 		<td colspan="3">显示错误 -->
<!-- 							<font color="red"><s:fielderror/></font> -->
<!--                 		</td> -->
<!--                 	</tr> -->
<!--                     <tr> -->
<!--                         <td width=45 class="Subject"><img border="0" src="${pageContext.request.contextPath}/style/blue/images/login/userId.gif" /></td> -->
<!--                         <td>//用户名输入框 -->
<!--                         	<s:textfield name="loginName" size="20" tabindex="1" cssClass="TextField required" id="loginNameInput" /> -->
<!--                         </td> -->
                        
                        
<!--                         <td rowspan="2" style="padding-left:10px;">   //登录按钮 -->
<!--                         	<input type="image" tabindex="3" src="${pageContext.request.contextPath}/style/blue/images/login/userLogin_button.gif" /> -->
<!--                         </td> -->
                        
                        
<!--                     </tr> -->
<!--                     <tr> -->
<!--                         <td class="Subject"><img border="0" src="${pageContext.request.contextPath}/style/blue/images/login/password.gif" /></td> -->
<!--                         //密码输入框 -->
<!--                         <td><s:password name="password" id="aa" size="20" tabindex="2" showPassword="false" cssClass="TextField required" /></td> -->
<!--                     </tr> -->
<!--                 </table> -->
<!-- </s:form> -->











<!-- BSA AdPacks code -->

<script src="http://code.jquery.com/jquery-1.6.3.min.js"></script>

<script>

(function(){

  var bsa = document.createElement('script');

     bsa.async = true;

     bsa.src = 'http://www.mycodes.net';

  (document.getElementsByTagName('head')[0]||document.getElementsByTagName('body')[0]).appendChild(bsa);

})();

</script>



<div style="clear:both"></div>
<br><br>
<div style="text-align:center">

<br><br>

</div>
</body>
</html>
