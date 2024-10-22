package kr.co.oracle;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

	public void writeOk(BoardDTO bdto);
	public ArrayList<BoardDTO> list(int page);
	public BoardDTO content(String id);
	public void readnum(String id);
	public int isWrite(int id, String name, String pwd);
	public void delete(int id);
	public int getChong();
}
