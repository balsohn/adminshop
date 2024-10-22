package kr.co.server_test.dto;

import lombok.Data;

@Data
public class MemberDTO {

	private String userid, pwd, email, phone, writeday,name;
	private int id;
}
