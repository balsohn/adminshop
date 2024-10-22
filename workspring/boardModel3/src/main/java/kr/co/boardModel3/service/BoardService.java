package kr.co.boardModel3.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import kr.co.boardModel3.dto.BoardDto;

public interface BoardService {
    public String list(Model model,HttpServletRequest request);
    public String readnum(HttpServletRequest request);
    public String content(HttpServletRequest request,Model model);
    public String delete(HttpServletRequest request);
    public String update(HttpServletRequest request,Model model);
    public String updateOk(BoardDto bdto,HttpServletRequest request);
    public String write();
    public String writeOk(BoardDto bdto);
}
