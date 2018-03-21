<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>

#wrapperBox {
	margin: 0px;
}

h3 {
	padding-top: 10px;
	padding-bottom: 10px;
}

div {
	border: 1px solid black;
}

</style>
<title>Insert title here</title>
</head>
<body>
	<div id="wrapperBox">
		<div>
			<h3>게임 시작을 누른 후</h3>
			<h3>3분 내에 문제 10개를</h3>
			<h3>맞추시는 게임 입니다.</h3>
			
			<p>문제 난이도는 쉬운 순으로</p>
			<p>등장하며, 난이도 평균과</p>
			<p>클리어 타임으로 랭킹에</p>
			<p>올려지게 됩니다.</p>
		</div>
		
		<div>
			<input type="button" id="startGame" value="게임 시작"/>
		</div>
	</div>
</body>
</html>