package com.example.demo.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.board.mapper.ReplyMapper;
import com.example.demo.board.service.ReplyService;
import com.example.demo.board.service.ReplyVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService{
	
	private final ReplyMapper replyMapper;
	
	@Override
	public int insertReply(ReplyVO reply) {
		return replyMapper.insertReply(reply);
	}

	@Override
	public List<ReplyVO> replyList(Long bno) {
		return replyMapper.replyList(bno);
	}

	@Override
	public int deleteReply(Long rno) {
		return replyMapper.deleteReply(rno);
	}

	
	
}
