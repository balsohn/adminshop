package kr.co.serverProgram.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import kr.co.serverProgram.dto.BoardDTO;

@Mapper
public interface BoardMapper {
	public ArrayList<BoardDTO> list(int index);
	public int getChong();
	public void readnum(String id);
	public BoardDTO content(String id);
	public void writeOk(BoardDTO bdto);
	public void delete(String id);
	public void updateOk(BoardDTO bdto);
}
