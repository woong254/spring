package com.exam.demo.book.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.demo.book.service.BookService;
import com.exam.demo.book.service.BookVO;
@RestController
public class BookRestController {
	
	@Autowired BookService bookService;
	
	@PostMapping("/BookInsert")
	public Map<String,Object> BookInsert(@RequestBody BookVO vo) {
		bookService.insertBook(vo);
		Map<String,Object> map = new HashMap<>();             // { "result": "success", "data": 1 }
		map.put("result", "succuss");
		map.put("data", vo);
		return map; // {result : "success", data:vo}
		
		
		
	}
}

