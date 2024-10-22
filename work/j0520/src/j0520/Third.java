package j0520;

public class Third {

	//사용자에게 주문할 내용을 숫자로 입력받는다
	//내용: 1.짜장면 2.짬뽕 3.탕수육 4.전가복
	//주문받은 내용을 주방에 전달한다.(???가 주문되었습니다)
	
	int chk;
	
	public void jubang()
	{
		switch(chk) 
		{
		case 1: 
			System.out.println("짜장면이 주문되었습니다.");break;
		case 2:
			System.out.println("짬뽕이 주문되었습니다.");break;
		case 3: 
			System.out.println("탕수육이 주문되었습니다.");break;
		case 4:
			System.out.println("전가복이 주문되었습니다.");break;
		default:System.out.println("잘못 입력");break;
		}
		
		
		
		
	}
	
	
	

}
