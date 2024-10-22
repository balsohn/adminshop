package kr.co.folder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 현재 컨트롤러가 tour 폴더만 접근한다면
@RequestMapping("/tour")
public class TourController {

	@RequestMapping("content")
	public String content() {
		return "/tour/content";
	}
}
