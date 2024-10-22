package kr.co.json;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JsonMapper {
	public void writeCal(JsonDTO jdto);
	public ArrayList<JsonDTO> cal(String ym);
}
