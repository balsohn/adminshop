package kr.co.batisEx;

import java.util.ArrayList;

public interface MyDAO {
	
	public ArrayList<MyDTO> list(int index);
	public int getChong();
	public void readnum(String id);
	public MyDTO content(String id);
	public void delete(String id);
	public MyDTO update(String id);
}
