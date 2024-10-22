package kr.co.thboard;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

	public ArrayList<BoardDTO> list(int index);
	public int getChong();
	public void readnum(String id);
	public BoardDTO content(String id);
	public void writeOk(BoardDTO bdto);
	public boolean isWrite(String id, String name, String pwd);
	public void delete(String id);
	public void updateOk(BoardDTO bdto);

}
