package j0522;

public class ThisEx1Main {

	public static void main(String[] args) {
		
		ThisEx1 te1=new ThisEx1();
		
		/*
		te1.kor=99; //ThisEx1의 int kor;의 속성을 private으로 설정하니까 갑자기 빨간줄
		te1.eng=98;
		te1.mat=88;
		*/
		
		te1.input(99, 98, 88); //값을 할당할 메소드 
	
		//te1.hap(); 			   //합의 출력 명령이 있는 메소드 
		//this를 사용하면 설계도가 있는 클래스안에서 출력 명이 있는 메소드를 불러와서 
		//main 메소드에 입력하지 않아도 출력이 가능하다. 
							
	}

}
