package com.exam.demo.book.service;

import java.util.List;

public interface BookService {
	int insertBook(BookVO bookvo);
	Long getBookNO();
	List<BookVO> bookList();
}
