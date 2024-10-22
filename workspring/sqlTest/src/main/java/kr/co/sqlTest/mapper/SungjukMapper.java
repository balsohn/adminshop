package kr.co.sqlTest.mapper;

import java.util.ArrayList;

import kr.co.sqlTest.dto.SungjukDTO;

public interface SungjukMapper {

	ArrayList<SungjukDTO> list(String type1);

	String getIphak(String name);

}
