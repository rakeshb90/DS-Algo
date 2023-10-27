package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class OperationWithString {
//	There is string (s) and integer (k) and query string having string 'w','d' and 'u' characters which mean write,delete and undo
//	operation on input string (s).
//
//	input:
//	s="abbb" k=2     
//	query="waskd"
//
//	output:
//	abba
//
//	abbb=>abbbask=>abba 
//
//	input:
//	s="xy" k=1
//	query="waabbcwabdwsau"
//
//	output:
//	xyaabbca
//
//	xy=>xyaabbc=>xyaabbcab=>xyaabbca=> xyaabbcasa=>xyaabbca

	public static void main(String[] args) {
		String initial = "abb";
		int noOfCharToDelete = 2;
		String query = "wacbvxddwtht";
		// abb=>abbacbvx=>abbacb=>abbacbtht
		String ans = doOperation1(initial,noOfCharToDelete,query);
//		String ans = doOperation(initial,noOfCharToDelete,query);
		
		System.out.println("After operation result: "+ans);

	}
	// curr stack will have the result 
    // op will store the list of write and delete 
    // wop will store string whenever there is a write operation 
    // dop will store string whenever there is a delete operation 
    // for write add character to curr and add string to wop
    // for delete delete character from curr and add that string to dop
    // for undo pop last charcter from op , if its write then take string from wop and remove that count from curr 
    // if its delete then take string from dop and add it to curr 

	private static String doOperation1(String initial, int noOfCharToDelete, String query) {
	
	Stack<Character> curr = new Stack<>();
	Stack<Character> opp = new Stack<>();
	Stack<String> wop = new Stack<>();
	Stack<String> dop = new Stack<>();
	
	Stack<Character> op = new Stack<>();
	op.push('w');
	op.push('d');
	op.push('u');
	
	for(int i=0;i<initial.length();i++)
		curr.push(initial.charAt(i));
	int i=0;
	while(i<query.length()) {
		char ch = query.charAt(i);
		i++;
		if(ch == 'w') {
			opp.push('w');
			String temp = "";
			while(i<query.length() && op.contains(query.charAt(i))==false) {
				char cc = query.charAt(i);
				temp += cc;
				curr.push(cc);
				i++;
			}
			wop.push(temp);
		}
		else if(ch=='d') {
			opp.push('d');
			String temp = "";
			int k = noOfCharToDelete;
			while(curr.size()>0 && k > 0) {
				char cc = curr.pop();
				temp += cc;
				k--;
			}
			dop.push(temp);
		}
		else {
			if(opp.size()==0) continue;
			char chOp = opp.pop();
			if(chOp=='w') {
				int charToWrite = wop.pop().length();
				while(curr.size()>0 && charToWrite>0) {
					curr.pop();
					charToWrite--;
				}
				
			}
			else {
				String st = dop.pop();
				for(char c : st.toCharArray())
					curr.push(c);
				
			}
		}
	}
	String ans = "";
	while(curr.size()>0)
		ans = curr.pop()+ans; 
	
	return ans;
}


	private static String doOperation(String initial, int noOfCharToDelete, String query) {
		Stack<String> st = new Stack<>();
		st.add(initial);
		int i=0,n=query.length();
		String tackForUpdate = "";
		String operation="";
		while(i<n) {
			char ch = query.charAt(i);
			if(ch=='w') {
				operation+=ch;
				String s = "";
				i++;
				while(i<n && query.charAt(i)!='w' && query.charAt(i)!='d' && query.charAt(i)!='u') {
					s+=query.charAt(i);
					i++;
				}
				st.push(s);
			}
			else if(ch=='d') {
				operation+=ch;
				tackForUpdate = "";
				int d = noOfCharToDelete;
				while(!st.isEmpty() && st.peek().length()<=d) {
					tackForUpdate += st.peek();
					d -= st.pop().length();
				}
				if(d>0 && !st.isEmpty()) {
					String s1 = st.pop();
					tackForUpdate += s1.substring(d,s1.length());
					st.push(s1.substring(0,s1.length()-d));
				}
				i++;
			}
			else if(ch=='u') {
				char ch1 = operation.charAt(operation.length()-1);
				if(ch1 =='w') {
					st.pop();
				}
				else if(ch1 == 'd') {
					st.push(tackForUpdate);
				}
				operation+='u';
				i++;
			}
		}
		String ans ="";
		List<String> list = new ArrayList<>(st);
		for(i=0;i<list.size();i++)
			ans+=list.get(i);
		
		return ans;
	}

}
