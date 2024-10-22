package kr.co.thboard;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;

public interface BoardService {

	public String list(Model model, HttpServletRequest request);
	public String readnum(HttpServletRequest request);
	public String content(HttpServletRequest request, Model model);
	public String writeOk(BoardDTO bdto);
	public String delete(HttpServletRequest request);
	public String update(HttpServletRequest request, Model model);
	public String updateOk(BoardDTO bdto, HttpServletRequest request);
}
