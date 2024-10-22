package kr.co.server_test.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import kr.co.server_test.dto.TourDTO;

@Mapper
public interface TourMapper {

	public void writeOk(TourDTO tdto);

	public ArrayList<TourDTO> list(int index);

	public int getChong();

	public TourDTO content(String id);

	public void delete(String id);

	public String getFname(int id);

	public void updateOk(TourDTO tdto);

}
