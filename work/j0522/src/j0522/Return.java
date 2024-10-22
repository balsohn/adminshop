package j0522;

public class Return {

	//--------------------------return문----------------------//
	/*
	 return문은 메소드의 실행을 강제 종료하고 호출한 곳으로 돌아간다는 의미이다.
	 메소드 선언에 리턴 타입이 있을 경우에는 return문 뒤에 리턴값을 추가로 지정해야 한다.
	  
	 return [리턴값];
	 
	 return문 이후에 실행문을 작성하면 'unreachable code'라는 컴파일 에러가 발생한다.
	 return문 이후의 실행문은 결코 실행되지 않기 때문이다.
	 
	 
	 int plus(int x, int y){
	 
	 int result = x+y;
	 return result;              //return에서 종료 
	 system.out.println(result); //unreachable code 
	 
	 하지만
	 boolean isLeftGas(){
	 
	 if(gas==0){
	 System.out.println("gas가 없습니다."); ------------------1
	 return false;
	 }
	 System.out.println("gas가 있습니다.");-------------------2
	 return true;
	 }
	 
	 if문의 조건식이 false가 되면 정상적으로 2가 실행되기 때문에 unreachable code 발생하지 않음.
	 if문의 조건식이 true가 되면 1이 실행되고 return false가 실행되어 메소드는 즉시 종료. 2는 실행되지 않음.
	 
	<Gas 참고> 
	 */
	
		// ------------------------(수업 시작)자료형별 리턴값----------------------//
	/*
	 [1] 리턴값은 오직 하나만 보낼수 있다.
	 
	 [문제 1] 둘 이상의 값을 보내는 경우가 발생할 수 있다..
	 
	 - 배열 => 동일한 자료형 
	 - 클래스(dto) => 서로 다른 자료형/ getter,setter 
	 - 문자열 => 위의 두경우에 사용하던 옛날방법 (문자열을 다루는 다양한 메소드) 
	 	 		
	 
	 */
}
