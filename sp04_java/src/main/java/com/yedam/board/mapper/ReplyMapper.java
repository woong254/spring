package com.yedam.board.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yedam.board.service.ReplyVO;

@Mapper
public interface ReplyMapper {

	int insertReply(ReplyVO reply);

	List<ReplyVO> replyList(Long bno);

	int deleteReply(Long rno);
}
