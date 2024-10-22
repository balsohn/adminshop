package board;

import javax.servlet.http.HttpServletRequest;

public class MyTest {
	private int kor=0;
	private int eng=0;
	private int mat=0;
	public void getName(HttpServletRequest request)
	{
		String[] names={"서재균","이주찬","오은주","장동원","유지인","유승준","손지호","정민철","최태민","김금파","호현주","남정범"};

		int num=(int)(Math.random()*names.length);
		String a=names[num];
		
		request.setAttribute("a", a);
	}
	
	public void getNum(HttpServletRequest request)
	{
		int kor=90;
		int eng=80;
		int mat=77;
		
		int hap=kor+eng+mat;
		int avg=hap/3;
		
		request.setAttribute("b", hap);
		request.setAttribute("c", avg);
	}
	
	public MemberDto getMember(HttpServletRequest request)
	{
		String name="홍길동";
		int age=33;
		double height=170.5;
		String email="hong@naver.com";
		
		MemberDto mdto=new MemberDto();
		mdto.setName(name);
		mdto.setAge(age);
		mdto.setHeight(height);
		mdto.setEmail(email);
		
	//	request.setAttribute("mdto", mdto);
		return mdto;
	}
	
	public void getMember3(HttpServletRequest request)
	{
		String name="홍길동";
		int age=33;
		double height=170.5;
		String email="hong@naver.com";
		
		MemberDto mdto=new MemberDto();
		mdto.setName(name);
		mdto.setAge(age);
		mdto.setHeight(height);
		mdto.setEmail(email);
		
		request.setAttribute("mdto", mdto);
	
	}
}
