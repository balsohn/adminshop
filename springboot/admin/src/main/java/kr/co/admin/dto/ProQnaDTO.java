package kr.co.admin.dto;

import lombok.Data;

@Data
public class ProQnaDTO {

	private int id,qna,ref;
	private String userid,pcode,content,writeday,title;
}
