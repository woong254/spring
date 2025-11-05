<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/board/register.jsp</title>
</head>
<body> 
	<form method="post" action="/board/register">
	<lable> 제목
	<input name="title"/>
	</lable>
	<br/>
	<lable> 작성자
	<input name="writer"/>
	</lable>
	<br/>
	<lable> 내용
	<textarea name="content"></textarea>
	</lable>
	<br/>
	<button>등록</button>
	</form>
</body>
</html>