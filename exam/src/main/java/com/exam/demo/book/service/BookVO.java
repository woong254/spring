package com.exam.demo.book.service;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookVO {
	private Long bookNo;
	private String bookName;
	private String bookCoverimg;
	private Date bookDate;
	private Long bookPrice;
	private String bookPublisher;
	private String bookInfo;
	
}
