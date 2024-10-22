package mytest;

public class MyClass {
	private int kor,eng,mat,tot,avg;
	private String name;
	
	public void input(int kor,int eng,int mat) {
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		
		tot=kor+eng+mat;
		avg=tot/3;
	}
	
	public int tot() {

		return tot;
	}
	
	public int avg() {
		return avg;
	}
}
