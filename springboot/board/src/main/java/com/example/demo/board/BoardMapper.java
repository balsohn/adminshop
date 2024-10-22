package com.example.demo.board;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BoardMapper {
	
	public ArrayList<BoardDTO> list(int index,int pageSize,String stype, String sword);
	public void readnum(String id);
	public BoardDTO content(String id);
	public void delete(String id);
	@Update("update pageboard set name=#{name}, content=#{content} where id=#{id}")
	public void updateOk(BoardDTO bdto);
	public int getChong(int pageSize,String stype, String sword);
	public boolean isPwd(String id, String pwd);
}
