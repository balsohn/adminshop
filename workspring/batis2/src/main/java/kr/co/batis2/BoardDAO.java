package kr.co.batis2;

import java.util.ArrayList;

public interface BoardDAO {

	public ArrayList<BoardDTO> list(int index, int pageSize);
	public int getChong(int pageSize);
}
