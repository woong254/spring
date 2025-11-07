package com.yedam.board;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;
import com.yedam.config.DataSourceConfig;
import com.yedam.config.MybatisConfig;
import com.yedam.config.RootConfig;
@SpringJUnitConfig(classes = {DataSourceConfig.class,
        MybatisConfig.class, 
        RootConfig.class})
public class ReplyServiceTest {

	@Autowired ReplyService replyservice;
	
	@Test
	public void 등록() {
		ReplyVO replyVO = new ReplyVO();
		replyVO.setReply("댓글테스트");
		replyVO.setReplyer("정지웅");
		replyVO.setBno(7L);
		int result = replyservice.insertReply(replyVO);
		assertEquals(result, 1);
	}
	
	@Disabled
	@Test
	public void 조회() {
		Long bno = 7L;
		List<ReplyVO> result = replyservice.replyList(bno);
		System.out.println(result);
	}
	@Disabled
	@Test
	public void 삭제() {
		Long rno = 1L;
		int result = replyservice.deleteReply(rno);
		assertEquals(result,1);
	}
}
