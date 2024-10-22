package kr.co.board.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import kr.co.board.dto.BoardDTO;

@Mapper
public interface BoardMapper {
	
	public int getChong();
	public ArrayList<BoardDTO> list(int index);
	public void readnum(String id);
	public BoardDTO content(String id);
	public void delete(String id);
	public void writeOk(BoardDTO bdto);
	public void updateOk(BoardDTO bdto);
}
