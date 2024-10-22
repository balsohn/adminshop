package jstl;

import javax.servlet.http.HttpServletRequest;

public class Test {

	public void calc(HttpServletRequest request)
	{
		int kor=90;
		int eng=88;
		
		int avg=(kor+eng)/2;
		
		request.setAttribute("avg",avg);
	}
}
