package j0529;

abstract class GrandFather {
	public abstract void input();
}

abstract class Father extends GrandFather{
	public abstract void output();
}

abstract class MultiAbs extends Father{
	
	//상속받은 추상클래스를 다시 상속받을때
	//모든 추상메소드를 전부 오버라이딩(재정의)한다.
	
	@Override
	public void output()
	{
		
	}
	
	@Override
	public void input()
	{
		
	}
	
}
