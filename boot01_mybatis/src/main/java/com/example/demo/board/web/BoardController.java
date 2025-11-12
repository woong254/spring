package com.example.demo.board.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.board.service.BoardService;
import com.example.demo.board.service.BoardVO;
import com.example.demo.user.service.UserVO;

@Controller
public class BoardController {
	
	@Autowired BoardService boardService;
	
	//json
	@GetMapping("/api/board")
	@ResponseBody
	public List<BoardVO> selectJson() {
		return boardService.getList();
	}
	
	//전체조회
	@GetMapping("/board")
	public String selectall(Model model, @AuthenticationPrincipal UserVO userVO) {
		System.out.println("로그인 사용자" + userVO.getFullName());
		UserVO user = (UserVO)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println("시큐리티 컨텍스트: "+ userVO.getRole());
		//String userid = secuUtil.getName();
		model.addAttribute("list", boardService.getList());
		return "board/list";
	}
	//등록페이지
	@GetMapping("/board/register")
	public String registerpage() {
		return "board/register";
	}
	//등록처리
	@PostMapping("/board/regis"
			+ "ter")
	public String register(BoardVO board) {
		boardService.insertBoard(board);
		return "redirect:/board";
	}
	
	//수정페이지로 이동
	@GetMapping("/board/update") //  /board/update?bno=1 /board/update/1
	public String updatepage(Model model, @RequestParam("bno") Long bno) {
		BoardVO vo = boardService.getBoard(bno);
		model.addAttribute("board", vo);
		return "board/register";
	}
	//수정처리
	
	@PostMapping("/board/update")
	public String update(BoardVO board) {
		boardService.updateBoard(board);
		return "redirect:/board";
	}
	
	//삭제처리
	@PostMapping("/board/delete")
	public String updatepage(@RequestParam Map<String, Object> map) {
		boardService.deleteBoard(map);
		return "redirect:/board";
	}
	
	@GetMapping("/board/info")
	public void info(@RequestParam("bno") Long bno, Model model) {
		model.addAttribute("board", boardService.getBoard(bno));
		
	}
	
	
}
