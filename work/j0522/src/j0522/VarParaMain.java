package j0522;

public class VarParaMain {

	public static void main(String[] args) {
		
		VarPara vp=new VarPara();
		
		vp.hap(4,9);
		vp.hap(1,2,6,7);
		vp.hap(1,2,3,4,5,6,7);
		
		System.out.println(); //칸 띄우기 
		
		
		//간단한 for
		String[] names= {"뽀로로","윌키","브레드","차탄","팅커벨"};
		//문자열 배열 names안에 { , , , ,} 할당 
		for(String name:names) //names(문자열 배열 혹은 어떠한 집합) ":"을 기준으로 우측 
		{					   // ":"을 기준으로 오른쪽에서 왼쪽으로 입력값 대입 
			System.out.println("이름 : "+name);//name을 출력해라 
			//이름 : 뽀로로 
			//이름 : 윌키 .......배열에 입력된 값만큼 출력됨. 
		}
		

	}

}
