package j0522;

public class Mun3 {
	 // 점수를 입력받아서 수,우,미,양,가를 리턴해주는 메소드를 만드시오
	
	public String check2(int kor){
		if(kor>=90)	{
			return "의 등급은 수";
		}else if(kor>=80) {
			return "의 등급은 우";
		}else if(kor>=70) {
			return "의 등급은 미";
		}else if(kor>=60) {
			return "의 등급은 양";
		}else {
			return "의 등급은 가";}
		}

}
