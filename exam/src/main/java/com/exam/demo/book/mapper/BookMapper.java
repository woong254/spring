package com.exam.demo.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.exam.demo.book.service.BookVO;

@Mapper
public interface BookMapper {
	int insertBook(BookVO bookvo);
	Long getBookNo();
	List<BookVO> bookList();
}
