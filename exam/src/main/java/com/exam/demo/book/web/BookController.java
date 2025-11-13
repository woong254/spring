package com.exam.demo.book.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.demo.book.service.BookService;
import com.exam.demo.book.service.BookVO;

@Controller
public class BookController {

	@Autowired BookService bookService;

	@GetMapping("/BookInsertPage")
	public String BookInsertPage(Model model) {
		model.addAttribute("no",bookService.getBookNO());
		return "bookinsert";
	}
	
	@GetMapping("/BookListPage")
	public String BooKListPage(Model model) {
		model.addAttribute("book", bookService.bookList());
		return "bookList";
	}
	

}
