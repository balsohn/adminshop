package j0522;

public class Mun2 {

	//1~3까지의 값을 매개변수로 입력받은 후 1~3까지의 임의의 수를 발생시켜서
	//매개변수의 값과 임의의 변수의 값이 같으면 "숫자를 맞추었다"
	//아니면 "숫자를 못 맞추었다"라고 출력 


	public void isCheck(int n)
	{
		int m=(int)(Math.random()*3)+1;
		
		if(n==m)
		{
			System.out.println("숫자를 맞추었다");
		}else {
			System.out.println("숫자를 못 맞추었다");
		}
		
	}

	
}