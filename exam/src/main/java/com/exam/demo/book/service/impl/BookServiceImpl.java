package com.exam.demo.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.demo.book.mapper.BookMapper;
import com.exam.demo.book.service.BookService;
import com.exam.demo.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookMapper bookMapper;

	@Override
	public int insertBook(BookVO vo) {
		return bookMapper.insertBook(vo);
	}

	@Override
	public Long getBookNO() {
		return bookMapper.getBookNo();
	}

	@Override
	public List<BookVO> bookList() {
		return bookMapper.bookList();
	}
	
	
}
