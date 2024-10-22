package Quiz;

import java.util.Scanner;

public class Quiz_2 {

		class NameHandler {
		    private String[] nameArray = new String[5];

		    // 콘솔창으로 5명의 이름을 입력받아서 구분자 "-"를 이용하여 하나의 문자열로 만들어 names에 저장한다.
		    public void input() {
		        Scanner scanner = new Scanner(System.in);

		       System.out.println("5명의 이름을 입력하세요:");
		        for (int i = 0; i < 5; i++) {
		            System.out.print((i + 1) + "번째 이름: ");
		            nameArray[i] = scanner.nextLine();
		        }
		    }

		    // names문자열에 있는 이름을 분리하여 출력한다.
		    public void output() {
		        System.out.println("입력된 이름 문자열:");
		        for (int i = 0; i < nameArray.length; i++) {
		            if (i > 0) {
		                System.out.print("-");
		            }
		            System.out.print(nameArray[i]);
		        }
		        System.out.println();
		        
		        System.out.println("분리된 이름:");
		        for (String name : nameArray) {
		            System.out.println(name);
		        }
		    }
		}
			/*
		public class MainClass {
		    public static void main(String[] args) {
		        NameHandler nameHandler = new NameHandler();
		        nameHandler.input();
		        nameHandler.output();
		    }
		}
	*/
		
	}


