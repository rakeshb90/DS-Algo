package backtracking;

public class GenerateBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		generate("",n,0,0);

	}

	private static void generate(String brackets, int n, int open, int close) {
		// TODO Auto-generated method stub
		// base case
		if(brackets.length() == 2*n) {
			System.out.println(brackets);
		}
		// recursive case
		// opening bracket
		if(open<n) {
			generate(brackets+"(",n,open+1,close);
		}
		// closing bracket
		if(close<open)
		   generate(brackets+")",n,open,close+1);
		
	}

}
