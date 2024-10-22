package kr.co.admin.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import kr.co.admin.dto.*;

@Mapper
public interface AdminMapper {
	public ArrayList<DaeDTO> getDae();
	public ArrayList<CompanyDTO> getCompany();
	public ArrayList<JungDTO> getJung(String daecode);
	public ArrayList<SoDTO> getSo(String daejung);
	public void productAddOk(ProductDTO pdto);
	public int getPcode(String pcode);
	public ArrayList<HashMap> gumaeAll();
	public void chgState(String state, String id);
	public ArrayList<ProQnaDTO> qnaList();
	public void writeAnswerOk(ProQnaDTO pdto);
}
