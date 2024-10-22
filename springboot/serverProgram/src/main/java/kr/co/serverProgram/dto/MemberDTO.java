package kr.co.serverProgram.dto;

import lombok.Data;

@Data
public class MemberDTO {

	private String userid, pwd, email, phone, name, writeday;
	private int id;
}
