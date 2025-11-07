package com.yedam.board.service;

import java.util.List;

public interface ReplyService {
	//등록
	int insertReply(ReplyVO reply);
	//조회
	List<ReplyVO> replyList(Long bno);
	//삭제
	int deleteReply(Long rno);
}
