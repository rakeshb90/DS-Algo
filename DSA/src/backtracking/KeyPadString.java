package backtracking;

public class KeyPadString {
	private static String[] keypad= {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="23";
		printString(num,"",0);

	}


	private static void printString(String num,String currStr, int i) {
		// TODO Auto-generated method stub
		// Base case
		if(i==num.length()) {
			System.out.println(currStr);
			return;
		}
		// Recursive case
		int digit = num.charAt(i)-'0';
		
		if(digit == 0 || digit == 1) {
			printString(num,currStr,i+1);// Skip 0 and 1 digit and go for next digit 
		}
		for(int k=0;k<keypad[digit].length();k++) { // iterate each char of keypad string
			printString(num,currStr+keypad[digit].charAt(k),i+1);
		}
		
	}

}
