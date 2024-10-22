package j0522;

public class ConstEx3 {

	//final :final은 해당변수의 값을 변경시키지 못한다.
	//When you want to ensure that the array reference 
	//cannot be changed to point to another array
	//final을 사용할 경우 초깃값을 설정해줘야 한다. (고정시킬 값이 있어야 변화도 못 시키겠지...)
	//final변수여야 되는데 클래스를 생성시 값을 부여하지 못할때 
	//1.변수 생성시 할당 2.생성자 통해 할당 
	
	final int[] kors;
	final int num;
	int num2;
	//1.final 변수 생성시 값을 전달한 예
	final int chk=11;
	final String str="하하하"; 
	
	
	//2. 생성자를 통해서 값을 전달한 예 
	ConstEx3(int n, int num)
	{
		kors=new int[n]; //생성자를 통해 값 전달 
		this.num=num;
	}
	
	//생성자는 생략하면 매개변수가 없는 그리고 실행내용이 없는 생성자가 실행됨.
	//생성자가 존재하면 해당 생성자의 형식을 따라야 한다. 
	
	
}
