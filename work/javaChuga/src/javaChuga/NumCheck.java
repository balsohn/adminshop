package javaChuga;

public class NumCheck {
	
	public void check(int num) throws UserException
	{
		if(num>100)
			throw new UserException();
		
		System.out.println(num);
	}

}
