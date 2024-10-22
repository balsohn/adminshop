<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

	//배열의 선언이 틀리다
	//java : 자료형[] 배열명=new 자료형[크기];
	//javascript : var 배열명=new Array(크기);
	
	var nums=new Array(4);
	nums[0]=11;
	nums[1]=23;
	nums[2]=33;
	nums[3]=25;
	nums[4]=17; 		//크기를 벗어난 인덱스가 오면 배열의 크기를 늘린다 
	nums[100]=22;		//0~100까지 num.lenght는 101로 출력됨. 
	
	//alert(nums[10]); 	//값을 지정하지 않은 배열은 undefined로 나타남 
	
	//할당시 선언된 크기를 벗어나는 인덱스가 가능하다
	//그래도 java문법에 맞게끔 사용하자 
	
	//alert(nums.length);
	//alert(nums[100]);
	
	//[2]배열을 생성과 동시에 초기값 전달
	//java : 자료형[] 배열명={값,값,값,값};
	//javascript : var 배열명=[값,값,값,값];
	
	var names=["무민파파","무민마마","무민","스노크메이든"];
	alert(names[2]);

</script>

</head>
<body><!-- jsArray.jsp -->

</body>
</html>