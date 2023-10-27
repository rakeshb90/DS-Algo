package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<Integer> a = new HashSet<>(Arrays.asList(1,3,2,4,8,9,0));
		Set<Integer> b = new HashSet<>(Arrays.asList(1,3,7,5,4,0,7,5));
		
		Set<Integer> union = new HashSet(a); 
		Set<Integer> intersection = new HashSet(a);
		Set<Integer> difference = new HashSet(a);
		
		System.out.println("set a: "+a);
		System.out.println("set b: "+b);
		
		union.addAll(b);
		System.out.println("a uninon b: "+union);
		
		intersection.retainAll(b);
		System.out.println("a intersection b: "+intersection);
		
		difference.removeAll(b);
		System.out.println("a difference b: "+difference);
	}
	
}
