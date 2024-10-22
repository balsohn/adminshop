package com.example.demo.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.TourDTO;

@Mapper
public interface TourMapper {
	public ArrayList<TourDTO> list();
	public void writeOk(TourDTO tdto);
	public TourDTO content(int id);
	public boolean isPwd(TourDTO tdto);
	public String getFname(int id);
	public void delete(int id);
	public TourDTO getFiles(int id);
	public void updateOk(TourDTO tdto);
}
