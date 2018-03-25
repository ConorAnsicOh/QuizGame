<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/css/button.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/css/link.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/css/mainFrame.css"/>" />

<script type="text/javascript"
	src="<c:url value="/static/js/jquery-3.3.1.min.js"/>"></script>
<script type="text/javascript">
	$().ready(function() {
		
		$("#signIn").click(function() {

			$("#loginForm").attr({
				"method" : "post",
				"action" : "<c:url value="/login"/>"
			}).submit();

		});
	});
</script>

<style type="text/css">

.btnBox {
	width: 150px;
	height: 100px;
	margin-left: 20px;
	margin-right: 20px;
}

#startBtnBox {
	width: 150px;
	height: 100px;
}

#loginBox {
	border: 0px;
	margin-top: 20px;
	width: 300px;
}

#idInputBox {
	margin-left: 70px;
	margin-bottom: 30px;
}

#btnBox {
	margin-top: 40px;
}
</style>

<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="loginForm">
		<div id="wrapperBox">
			<div id="title">
				<h1>Quiz Game</h1>
			</div>
			<div>
				<div id="loginBox">
					<div id="idInputBox">
						ID : <input type="text" id="id" name="id" placeholder="WRITE HERE" />
					</div>
					<div>
						<form:errors path="userId"/><!--체크하고자하는 엘리먼트의 name을 적어준다.  -->
					</div>
					<div id="passwordInputBox">
						PASSWORD : <input type="text" id="password" name="password"
							placeholder="WRITE HERE" />
					</div>
					<div>
						<form:errors path="password"/><!--체크하고자하는 엘리먼트의 name을 적어준다.  -->
					</div>
				</div>
				<div id="btnBox">
					<div id="signUpBtn" class="button">
						<a href="<c:url value="/signUp"/>">회원가입</a>
					</div>
					<div id="signInBtn" class="button">
						<a href="<c:url value="/signIn"/>">로그인</a>
					</div>
				</div>
			</div>
			<div>
				<p>제작자 : 오안식</p>
			</div>
		</div>
	</form:form>
</body>
</html>