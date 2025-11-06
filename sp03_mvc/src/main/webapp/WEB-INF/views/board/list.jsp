<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
<link 
  href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
  rel="stylesheet">
<style>
  body {
    background-color: #f8f9fa;
  }
 /* 상단 영역 간격 */
.board-top {
  margin-bottom: 10px;
  padding: 0 4px;
}

/* 게시글 카드 */
.board-card {
  background: #fff;
  border-radius: 10px;
  box-shadow: 0 2px 8px rgba(0,0,0,0.05);
  padding: 20px;
  margin-bottom: 15px;
}

/* 제목 옆 수정 버튼 */
.btn-edit {
  padding: 2px 10px;
  font-size: 0.8rem;
  border-radius: 20px;
  transition: all 0.15s ease-in-out;
}
.btn-edit:hover {
  background-color: #0d6efd;
  color: #fff;
}

/* 글작성 버튼 */
.btn-write {
  background: linear-gradient(135deg, #ff7b7b, #ffb347);
  border: none;
  color: #fff;
  padding: 8px 18px;
  border-radius: 999px;
  font-weight: 600;
  font-size: 0.95rem;
  box-shadow: 0 4px 10px rgba(255, 123, 123, 0.4);
  transition: all 0.15s ease-in-out;
}
.btn-write:hover {
  transform: translateY(-1px);
  box-shadow: 0 6px 14px rgba(255, 123, 123, 0.55);
  opacity: 0.97;
}

/* 나머지 기본 스타일 유지 */
.board-header {
  border-bottom: 1px solid #dee2e6;
  margin-bottom: 10px;
  padding-bottom: 5px;
}
.board-title {
  font-size: 1.2rem;
  font-weight: 600;
}
.board-meta {
  color: #6c757d;
  font-size: 0.9rem;
}
.reply-card {
  background: #f1f3f5;
  border-left: 4px solid #0d6efd;
  border-radius: 5px;
  margin-top: 10px;
  padding: 10px 15px;
}
.replyer {
  font-weight: 600;
  color: #0d6efd;
}
  
</style>
</head>
<body>
<div class="container-lg mt-3">
  <!-- 상단 타이틀 + 글작성 버튼 -->
  <div class="board-top d-flex justify-content-between align-items-center mb-3">
    <h3 class="board-title-main mb-0">📋 게시글 목록</h3>
    <button type="button" class="btn btn-write" onclick="location.href='board/register'">
      <span class="me-1">✏️</span> 글 작성
    </button>
  </div>

  <!-- 게시글 목록 -->
  <c:forEach items="${list}" var="board">
    <div class="board-card">
      <!-- 게시글 헤더 -->
      <div class="board-header d-flex justify-content-between align-items-center">
        <div class="d-flex align-items-center gap-2">
          <div class="board-title">${board.title}</div>
          <button type="button" class="btn btn-sm btn-outline-primary btn-edit"
            onclick="location.href='board/update?bno=${board.bno}'">
            ✏️ 수정
          </button>
        </div>
        <div class="board-meta">
          번호: ${board.bno} | 작성자: ${board.writer}
        </div>
      </div>

      <!-- 게시글 내용 -->
      <div class="board-content mb-3">
        ${board.content}
      </div>

      <!-- 댓글 목록 -->
      <c:if test="${not empty board.reply}">
        <h6 class="text-secondary mb-2">💬 댓글</h6>
        <c:forEach items="${board.reply}" var="reply">
          <div class="reply-card">
            <div><span class="replyer">${reply.replyer}</span></div>
            <div>${reply.reply}</div>
          </div>
        </c:forEach>
      </c:if>
    </div>
  </c:forEach>
</div>
</body>
</html>