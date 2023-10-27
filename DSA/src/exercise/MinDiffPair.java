package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MinDiffPair {
	// Logic using two pointer approach move from start of both array and collect diff
	// for each pair and move the lowest value pointer forward.
	public static Pair minDifference(List<Integer> a,List<Integer> b){
	    //Complete this method
	    Pair ans = null;
	    Collections.sort(a);
	    Collections.sort(b);
	    int i=0,j=0,minDif = Integer.MAX_VALUE;
	    while(i<a.size() && j<b.size()) {
	    	int currDif = Math.abs(a.get(i)-b.get(j));
	    	if(currDif < minDif) {
	    		minDif= currDif;
	    		ans = new Pair(a.get(i),b.get(j));
	    	}
	    	if(a.get(i) < b.get(j)) {
	    		i++;
	    	}
	    	else {
	    		j++;
	    	}
	    }
	    return ans;
	}
	/*
	 * Minimum Difference
Implement a function that takes in two non-empty arrays of integers, finds the pair of numbers (one from each array) who absolute difference is closest to zero, and returns a pair containing these two numbers, with the first number from array. Only one such pair will exist for the test.

Input

Array1 = [23, 5, 10, 17, 30]
Array2 = [26, 134, 135, 14, 19]
Output

17,19
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = Arrays.asList(23,5,10, 17, 30);
		List<Integer> b = Arrays.asList(26, 134, 135, 14, 19);
		Pair ans = minDifference(a,b);
		System.out.println("Ans: "+ans.first+", "+ans.second);
//		Logger logger = Logger.getLogger(MinDiffPair.class.getName());
//		logger.log(Level.SEVERE,"this is testing log message");

	}

}
