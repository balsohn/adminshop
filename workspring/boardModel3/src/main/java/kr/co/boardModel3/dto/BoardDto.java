package kr.co.boardModel3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor // 모든 필드의 값을 매개변수로 받는 생성자
@NoArgsConstructor  // 매개변수없는 생성자
@Data
public class BoardDto {
    private int id,readnum;
    private String title,name,content,pwd,writeday;
    
	private String imsi;   // 새로 추가해도 자동으로 getter,setter가 생성
}
