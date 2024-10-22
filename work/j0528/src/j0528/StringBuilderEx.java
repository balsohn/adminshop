package j0528;


public class StringBuilderEx {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder("학교 종이 땡땡땡 어서 모이자");
		System.out.println(sb);
		
		//StringBuilder만 가능
		
		//원본이 바뀐다
		sb.append(" 오늘은 쉴께요"); //원본 뒤에 추가   
		System.out.println(sb);
		
		sb.insert(3,"흰"); //내부에 추가 
		System.out.println(sb);
		
		sb.delete(3, 5); //3,4만 삭제. 5전까지 
		System.out.println(sb);
		
		sb.replace(5, 8, "쾅쾅쾅");//5,6,7만 변경. 8전까지 
		System.out.println(sb);
	}

}
