<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>## Munsuhyeon Profile</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/span.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/table.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/members.js"></script>
</head>
<body>
	<%@ include file="include/header.jsp" %>
	
	<center>
	 <table class="t-type01" width="75%" border="0" cellspacing="0" cellpadding="20">
      <tr>
         <td><span class="title01">DEVELOPER SUHYEON'S PROFILE</span></td>
      </tr>
      <tr>
         <td><span class="title02">I'm Suhyeon Mun, a developer who wants a development job. Please call me back.</span></td>
      </tr>
      <tr>
         <table  width="70%" border="0" cellspacing="0" cellpadding="10">
            <tr>
               	<td height="500" bgcolor="#D5D5D5" align="center">
               		<table border="0" cellspacing="0" cellpadding="10">
               			<form action="joinOk" method="post" name="reg_frm">
               				<tr>
               					<td class="td-type03">NO</td>
               					<td class="td-type03">ID</td>
               					<td class="td-type03">QUESTION</td>
               					<td class="td-type03">NAME</td>
               					<td class="td-type03">DATE</td>
               				</tr>
               				<tr>
               					<td class="td-type03">10</td>
               					<td class="td-type03">tiger</td>
               					<td class="td-type03">hello</td>
               					<td class="td-type03">호랑이</td>
               					<td class="td-type03">2022-5-12 12:30:20</td>
               				</tr>
               				<tr>
               					<td class="td-type03">10</td>
               					<td class="td-type03">tiger</td>
               					<td class="td-type03">hello</td>
               					<td class="td-type03">호랑이</td>
               					<td class="td-type03">2022-5-12 12:30:20</td>
               				</tr>
               			</form>
               		</table>  
		        </td>
            </tr>        
         </table>
      </tr>   
   </table>
   </center>
	
	<%@ include file="include/footer.jsp" %>
</body>
</html>