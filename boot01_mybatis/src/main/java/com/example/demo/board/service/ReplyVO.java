package com.example.demo.board.service;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ReplyVO {

	private Long rno;
	private Long bno;
	private String reply;
	//@JsonProperty("writer")
	private String replyer;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date replydate;
	@JsonIgnore
	private Date updatedate;
	
}
