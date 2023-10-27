package springCoreConcept;

import java.util.Stack;

public class Test {
//	You have given a string that contains the braces (brackets), both opening and closing braces. 
	//You have to find the length of the longest balanced subarray.
//	 
//	Input : {}{}{()[]()
//	Output: 6
//	Input : {}{}{()[](){}{}]]{}[]
//	Output: 10
//	Input : {}{}(){}(){()[]()
//	Output: 10

	public static void main(String[] args) {
		
		String input="{}{}{()[](){}{}]]{}[]";
		int result = getMaxLengthBalanced(input);
		System.out.println("Result: "+result);
	}

private static int getMaxLengthBalanced(String input) {
	Stack<Character> st = new Stack<>();
	int currCount=0,maxCount=0,balancedCount=0;
	int i=0;
	System.out.println("input: "+input);
	for(char ch: input.toCharArray()) {
		if(ch == '{' || ch == '[' || ch == '(' ) {
//			currCount++;
			st.push(ch);
		}
		else {
			if(!st.isEmpty() && isValid(st,ch)) {
				currCount+=2;
				st.pop();
				if(st.isEmpty())
				balancedCount =currCount;
				else {
					currCount = 2;
					balancedCount = 2;
				}
					
				maxCount = Math.max(maxCount, balancedCount);
			}
			else {
                maxCount = Math.max(maxCount, balancedCount);
				st = new Stack<>();
				currCount = 0;
				balancedCount = 0;
			}
		}
//		System.out.println(st);
		i++;
		
	}
	return maxCount;
}

private static boolean isValid(Stack<Character> st, char ch) {
	 switch(ch) {
	 case '}':
		return st.peek()=='{';
	 case ']':
			return st.peek()=='[';
	 case ')':
			return st.peek()=='(';
	 }
	return false;
}

}
