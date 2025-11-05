package com.yedam.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yedam.board.BoardVO;

@Mapper
public interface BoardMapper {
	//등록
	int insertBoard(BoardVO board);
	//수정
	int updateBoard(BoardVO board);
	//삭제
	int deleteBoard(long bno);
	//단건조회
	int count();
	//전체조회
	List<BoardVO> getList();
	//전체조회(검색)
	List<BoardVO> getListByWirter(BoardVO board);
	//페이징-전체건수조회
}
