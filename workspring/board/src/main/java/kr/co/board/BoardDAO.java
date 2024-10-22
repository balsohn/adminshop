package kr.co.board;

import java.util.ArrayList;

public interface BoardDAO {
	public ArrayList<BoardDTO> list();
	public void writeOk(BoardDTO bdto);
	public void readnum(String id);
	public BoardDTO content(String id);
	public void delete(String id);
	public boolean isPwd(BoardDTO bdto);
	public void updateOk(BoardDTO bdto);
}
