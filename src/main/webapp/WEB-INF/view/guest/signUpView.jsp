<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/css/mainFrame.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/css/button.css"/>" />
	
<script type="text/javascript"	src="<c:url value="/static/js/jquery-3.3.1.min.js"/>"></script>
<script type="text/javascript">

	$().ready(function() {
		
		$("#cancelBtn").click(function() {
			location.href = "<c:url value = "/" />"
		});
		$("#confirmBtn").click(function() {
			alert("회원 가입을 완료했습니다.")
			location.href = "<c:url value = "/" />"
		});
	});

</script>	

<style type="text/css">

	#submitBox {
		margin-top: 30px;
	}

</style>
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="regist">
		<div	id="wrapperBox">
			<div	id="title">
				<h1>회원가입</h1>
				<p style="font: 5pt; color: #9EBEC4">아래 내용을 모두 입력해주세요.</p>
			</div>
			
			<div	id="registBox">
				<div style="margin-left: 90px;">
					ID : <input	type="text"	id="id"	name="userId"	placeholder="WRITE ID"/>			
				</div>
				<div style=" margin-top: 10px; margin-left: 20px;">
					PASSWORD : <input	type="text"	id="password" name="password" placeholder="WRITE PASSWORD"/>			
				</div>
				<div style=" margin-top: 10px;">
					REPASSWORD : <input	type="text"	id="passwordCheck"	placeholder="WRITE PASSWORD"/>
				</div>
				<div style=" margin-top: 10px; margin-left: 20px;">
					NICKNAME : <input	type="text"	id="nickname"	name="nickname"	placeholder="WRITE NICKNAME"/>
				</div>
				<div style=" margin-top: 10px; margin-left: 55px;">
					EMAIL : <input	type="email"	id="email"	name="email"	placeholder="WRITE EMAIL"/>				
				</div>
			</div>
			<div	id="submitBox">
				<div	id="cancelBtn"	class="button">취소</div>
				<div style="margin-left: 30px;"	id="confirmBtn"	class="button">작성완료</div>
			</div>
		</div>
	</form:form>
</body>
</html>