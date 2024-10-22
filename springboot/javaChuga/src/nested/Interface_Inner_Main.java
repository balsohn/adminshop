package nested;

import nested.Interface_Inner.MyJob;

public class Interface_Inner_Main {

	public static void main(String[] args) {
		
		MyJobImpl mj=new MyJobImpl();
		mj.print();
		
		MyJob mj2=new Interface_Inner.MyJob() {
			
			@Override
			public void print() {
				System.out.println("임의구현방식");
				
			}
		};
		mj2.print();
	}
}
