package kr.co.boardModel3.dao;

import java.util.ArrayList;

import kr.co.boardModel3.dto.BoardDto;

public interface BoardDao {
    public ArrayList<BoardDto> list(int index);
    public int getChong();
    public void readnum(String id);
    public BoardDto content(String id);
    public boolean isPwd(int id,String pwd);
    public void delete(int id);
    public void updateOk(BoardDto bdto);
    public void writeOk(BoardDto bdto);
}
