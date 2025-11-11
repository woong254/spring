package com.example.demo.board.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.service.BoardVO;

@Mapper
public interface BoardMapper {
	//등록
	int insertBoard(BoardVO board);
	//수정
	int updateBoard(BoardVO board);
	//삭제
	int deleteBoard(Map<String, Object> map);
	//단건조회
	BoardVO getBoard(long bno);
	//전체조회
	List<BoardVO> getList();
	//전체조회(검색)
	List<BoardVO> getListByWirter(BoardVO board);
	//페이징-전체건수조회
	int count();
}
