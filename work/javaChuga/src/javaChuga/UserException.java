package javaChuga;
// exception을 사용자예외로 만들수 있다
public class UserException extends Exception{
	UserException() // 생성자
	{   // getMessage()의 출력값
		super("100점 이상 입력되면 안돼용");
	}
	// 사용자 예외의 출력내용
	public void errorMessage()
	{
		System.out.println("입력값을 확인해주세용");
	}

}
