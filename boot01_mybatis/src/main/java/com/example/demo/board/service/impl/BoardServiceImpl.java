package com.example.demo.board.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.service.BoardService;
import com.example.demo.board.service.BoardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	private final BoardMapper boardMapper;
	
	@Override
	public int insertBoard(BoardVO board) {
		return boardMapper.insertBoard(board);
	}

	@Override
	public int updateBoard(BoardVO board) {
		return boardMapper.updateBoard(board);
	}

	@Override
	public int deleteBoard(Map<String, Object> map) {
		return boardMapper.deleteBoard(map);
	}

	@Override
	public BoardVO getBoard(long bno) {
		return boardMapper.getBoard(bno);
	}

	@Override
	public List<BoardVO> getList() {
		return boardMapper.getList();
	}

	@Override
	public List<BoardVO> getListByWirter(BoardVO board) {
		return boardMapper.getListByWirter(board);
	}

	@Override
	public int count() {
		return 0;
	}
	
}
