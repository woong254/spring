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
<h3>
<c:if test="${empty board.bno}">게시글등록</c:if>
<c:if test="${not empty board.bno}">게시글수정</c:if>
</h3>
	<form method="post" action="${empty board.bno ? "/board/register" : "/board/update"}" name="frm">
	<input type="hidden" name="bno" value="${board.bno }">
	<lable> 제목
	<input name="title" value="${board.title}"/>
	</lable>
	<br/>
	<lable> 작성자
	<input name="writer" value="${board.writer}"/>
	</lable>
	<br/>
	<lable> 내용
	<textarea name="content">${board.content }</textarea>
	</lable>
	<br/>
	<button>${empty board.bno ? "등록" : "수정"}</button>
	<c:if test="${not empty board.bno }">
	<button type="button" onclick="boardDelete()">삭제</button>
	</c:if>
	</form>
	
	<script >
	function boardDelete() {
		if(confirm('삭제할까요')) {
			document.frm.action = "/board/delete";
			document.frm.submit();
		}
		
	}
	</script>
</body>
</html>