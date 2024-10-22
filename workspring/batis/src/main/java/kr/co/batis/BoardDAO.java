package kr.co.batis;

import java.util.ArrayList;

public interface BoardDAO {

	public ArrayList<BoardDTO> list(int index,int pageSize);
	public int getChong(int pageSize);
	public void readnum(String id);
	public BoardDTO content(String id);
	public BoardDTO update(String id);
	public boolean isPwd(int id, String pwd);
	public void delete(int id);
	public void updateOk(BoardDTO bdto);
}
