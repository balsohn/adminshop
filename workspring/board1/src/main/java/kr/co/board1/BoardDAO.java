package kr.co.board1;

import java.util.ArrayList;

public interface BoardDAO {
	public ArrayList<BoardDTO> list(int index);
	public int getChong();
	public void readnum(String id);
	public BoardDTO content(String id);
}
