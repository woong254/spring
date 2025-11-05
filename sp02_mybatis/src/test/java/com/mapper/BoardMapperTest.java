package com.mapper;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring/datasource-context.xml")
public class BoardMapperTest {
	@Autowired BoardMapper boardMapper;
	
	@Disabled
	@Test
	void 전체조회() {
		//given
		
		
		//when
		List<BoardVO> list = boardMapper.getList();
		
		//then
		assertEquals((list.get(0).getWriter()), "user00");
		
		for(BoardVO board : list) {
			System.out.println(board.getBno() +":" +board.getTitle());
			for(ReplyVO reply : board.getReply()) {
				System.out.println(reply.getReply());
			};
		}
	}
	
	@Test
	void 등록() {
		//given
		BoardVO board = new BoardVO();
		board.setContent("등록테스트");
		board.setTitle("스프링");
		board.setWriter("user03");
		//when
		int result = boardMapper.insertBoard(board);
		long bno = board.getBno();
		System.out.println(bno);
		//then
		//등록된 번호로 단건조회
		assertEquals(result, 1);
		
	}
	@Disabled
	@Test
	void 수정() {
		//given
		BoardVO board = new BoardVO();
		board.setContent("수정테스트");
		board.setTitle("수정");
		board.setBno(4L);
		//when
		int result = boardMapper.updateBoard(board);
		//then
		assertEquals(result, 1);
		
	}
	@Disabled
	@Test
	void 삭제() {
		//when
		int result = boardMapper.deleteBoard(9L);
		//then
		assertEquals(result, 1);
		
	}
	@Disabled
	@Test
	void 검색() {
		BoardVO board = BoardVO.builder()
		.title("스프링")
		.writer("user03")
		.build();
		List<BoardVO> list = boardMapper.getListByWirter(board);
	}
	
}
