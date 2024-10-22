package javaChuga;

public class UserMain {

	public static void main(String[] args) {
		NumCheck nc=new NumCheck();
		
		try
		{
			nc.check(105);
		}
		catch(UserException e)
		{
			System.out.println(e.getMessage());
			e.errorMessage();
		}

	}

}
