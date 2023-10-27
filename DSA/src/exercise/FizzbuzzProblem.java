package exercise;

import java.util.ArrayList;

public class FizzbuzzProblem {
	public static ArrayList<String> fizzbuzz(int n){
		ArrayList<String> ans=new ArrayList<>();
	    
	   for(int i=1;i<=n;i++) {
		   if(i%15==0)
			   ans.add("FizzBuzz");
		   else if(i%5==0)
			   ans.add("Buzz");
		   else if(i%3==0)
			   ans.add("Fizz");
		   else
			   ans.add(i+"");
	   }
	    
	    
	    
	 return ans;   
	    
	    
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String x: fizzbuzz(15))
			System.out.println(x);

	}

}
