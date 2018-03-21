<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<div>
			<div>
				<h1>Quiz Game</h1>
				<h3>문제 출제</h3>
			</div>
			<div>
				<a href="<c:url value="/howToPost"/>">문제 제출 요령 보기</a>
			</div>
			<div>
				<div>
					닉네임 : <!-- 계정 아이디 불러오기. -->
				</div>
				<div>
					<div>문제 제목 : </div>
					<div>	
						<input type="text" id="title" name="title" value="문제 제목"/>
					</div>						
				</div>
				<div>
					<div>문제 내용 : </div>
					<div>
						<textarea rows="" cols="" id="body" name="body" placeholder="문제 내용"></textarea>
					</div>
				</div>
				<div>
					<div>답안 : </div>
					<div>
						<input type="text" id="answer" name="answer" value="문제 답"/>
					</div>
				</div>
				<div>
					<div>난이도</div>
					<div>
						<!-- 난이도 선택을 무슨 input type으로 할지 결정 후 코딩. -->
					</div>
				</div>
				<div>
					<input type="submit" id="postBtn" name="postBtn" value="제출"/>				
				</div>
			</div>
		</div>
	</form>
</body>
</html>