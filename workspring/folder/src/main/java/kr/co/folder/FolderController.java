package kr.co.folder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FolderController {

	@RequestMapping("/")
	public String home() {
		return "redirect:/main/index";
	}
	@RequestMapping("/main/index")
	public String index() {
		return "/main/index";
	}
	
	@RequestMapping("board/list")
	public String boardList() {
		return "/board/list";
	}
	
	@RequestMapping("notice/list")
	public String noticeList() {
		return "notice/list";
	}
}
