<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = null;
	try{
		id = (String)session.getAttribute("session");
	}catch(Exception e){
		e.printStackTrace();
		id=null;
	}
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(id==null){
%>
	<button onclick="location.href='Controller?command=signIn'">로그인</button>
	<button>회원가입</button>
<% 		
	}else if(id.equals("admin")){
%>
	<span>관리자</span>
<%		
	}else{
%>	
	<button onclick="location.href='Controller?command=signOut'">로그아웃</button>
<% 		
	}
%>
</body>
</html>