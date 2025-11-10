<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board/info.jsp</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style>
body {
	background-color: #f4f5f7;
	font-family: system-ui, -apple-system, BlinkMacSystemFont, "Segoe UI",
		sans-serif;
}

.board-wrapper {
	max-width: 900px;
	margin: 40px auto;
}

.board-card {
	background: #ffffff;
	border-radius: 14px;
	box-shadow: 0 8px 24px rgba(15, 23, 42, 0.08);
	padding: 28px 30px 24px;
}

.board-header {
	display: flex;
	align-items: baseline;
	justify-content: space-between;
	gap: 12px;
	margin-bottom: 20px;
}

.board-title {
	font-size: 1.6rem;
	font-weight: 700;
	color: #111827;
}

.board-meta {
	font-size: 0.9rem;
	color: #6b7280;
}

.board-content-box {
	background: #f9fafb;
	border-radius: 10px;
	padding: 18px 16px;
	font-size: 0.98rem;
	line-height: 1.6;
	color: #374151;
	white-space: pre-wrap;
}

.label-text {
	font-weight: 600;
	color: #4b5563;
	margin-right: 4px;
}

/* 댓글 영역 */
.reply-section-title {
	font-size: 1.1rem;
	font-weight: 600;
	color: #111827;
	margin-bottom: 10px;
}

#replyform {
	display: flex;
	flex-wrap: wrap;
	gap: 10px;
	align-items: center;
	padding: 14px 16px;
	background: #f9fafb;
	border-radius: 10px;
	margin-bottom: 18px;
}

#replyform input {
	flex: 1 1 150px;
}

#replyer, #reply {
	border-radius: 999px;
	border: 1px solid #d1d5db;
	padding: 6px 12px;
	font-size: 0.92rem;
	outline: none;
	transition: border-color 0.15s ease, box-shadow 0.15s ease;
}

#replyer:focus, #reply:focus {
	border-color: #2563eb;
	box-shadow: 0 0 0 3px rgba(37, 99, 235, 0.15);
}

.btnInsert {
	padding: 6px 18px;
	border-radius: 999px;
	border: none;
	background: linear-gradient(135deg, #2563eb, #4f46e5);
	color: #fff;
	font-size: 0.9rem;
	font-weight: 600;
	box-shadow: 0 6px 14px rgba(37, 99, 235, 0.35);
	transition: transform 0.1s ease, box-shadow 0.1s ease, opacity 0.1s ease;
	white-space: nowrap;
}

.btnInsert:hover {
	transform: translateY(-1px);
	box-shadow: 0 8px 18px rgba(37, 99, 235, 0.4);
	opacity: 0.95;
}

.btnInsert:active {
	transform: translateY(0);
	box-shadow: 0 4px 10px rgba(37, 99, 235, 0.25);
}

/* 댓글 리스트 */
#replyList {
	margin-top: 4px;
}

#replyList .row {
	align-items: center;
	padding: 10px 8px;
	border-radius: 10px;
	border: 1px solid #e5e7eb;
	background: #ffffff;
	margin-bottom: 8px;
	transition: background-color 0.12s ease, box-shadow 0.12s ease,
		transform 0.08s ease;
}

#replyList .row:hover {
	background-color: #f9fafb;
	box-shadow: 0 4px 10px rgba(15, 23, 42, 0.06);
	transform: translateY(-1px);
}

#replyList .col {
	font-size: 0.9rem;
}

#replyList .col-7 {
	font-size: 0.92rem;
	color: #374151;
}

#replyList .btn {
	font-size: 0.78rem;
	padding: 4px 10px;
	border-radius: 999px;
}

#replyList .btn-danger {
	border: none;
}

#replyList .btn-success {
	border: none;
}

hr {
	margin: 24px 0 18px;
	border-top: 1px solid #e5e7eb;
}

/* 반응형 */
@media ( max-width : 576px) {
	.board-card {
		padding: 20px 16px 18px;
	}
	.board-header {
		flex-direction: column;
		align-items: flex-start;
		gap: 4px;
	}
	#replyList .row {
		font-size: 0.85rem;
	}
	#replyList .btn {
		margin-top: 4px;
	}
}
</style>

</head>
<body>
	<div class="board-wrapper">
		<div class="board-card">
			<div class="board-header">
				<div class="board-title">게시글 상세보기</div>
				<div class="board-meta">글번호 #${board.bno}</div>
			</div>

			<div class="mb-2">
				<span class="label-text">작성자</span> <span>${board.writer}</span>
			</div>

			<div class="mb-3">
				<span class="label-text">내용</span>
			</div>
			<div class="board-content-box">${board.content}</div>

			<hr>

			<div class="reply-section-title">댓글</div>

			<div id="replyform">
				<input id="replyer" name="replyer" class="form-control"
					placeholder="작성자"> <input id="reply" name="reply"
					class="form-control" placeholder="댓글 내용">
				<button type="button" class="btnInsert">댓글 작성</button>
			</div>

			<div id="replyList"></div>
		</div>
	</div>

<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<script>
var bno = ${board.bno};
</script>
<script src="/resources/reply.js"></script>
</body>
</html>