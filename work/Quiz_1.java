package j0528;

	import java.util.Scanner;

	public class CharacterCount {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt user for input
	        System.out.println("문자열을 입력하세요:");
	        String input = scanner.nextLine();
	        
	        // Specify the character to count (you can change this character)
	        char targetChar = 'a';
	        
	        // Count occurrences of the target character
	        int count = 0;
	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) == targetChar) {
	                count++;
	            }
	        }
	        
	        // Print the result
	        System.out.println("특정 문자 '" + targetChar + "' 의 갯수: " + count);
	        
	        scanner.close();
	    }

	}

