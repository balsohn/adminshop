package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MemberDTO {
	private String userid, name, pwd, email, phone, writeday;
	private int id, state;
	
	
}
