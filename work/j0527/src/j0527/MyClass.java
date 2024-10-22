package j0527;

//상속은 멀티상속이 가능하다
//하나의 java파일에 여러개의 클래스가 가능하다(비추) => java파일의 이름과 public클래스의 이름이 같아야 한다
//public은 하나만 사용한다.

class GrandFather{
	int kor;
}

class Father extends GrandFather{
	int eng;
	//kor+eng
}

public class MyClass extends Father{
	int mat;
	//kor+eng+mat
}
