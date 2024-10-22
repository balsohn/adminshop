package j0527;

public class FirstMain {

	public static void main(String[] args) {

		
		First f=new First();
		
		//상속을 받은 FirstSon
		
		FirstSon fs=new FirstSon();
		fs.num1=10;
		fs.num2=6;
		
		fs.add();
		fs.sub();
		fs.mul();
		fs.div();
		
		
	}

}
