package nested;

public class MultiClassMain {

	public static void main(String[] args) {
		MultiClass mc=new MultiClass();
		MultiClass.Father father=mc.new Father();
		MultiClass.Father.My my=father.new My();
		
		my.print();
	}
}
