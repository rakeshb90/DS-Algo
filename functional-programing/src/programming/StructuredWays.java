package programming;

import java.util.List;

public class StructuredWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       printNumberStructuredWay(List.of(1,23,12,10,16,10,15));
	}

	private static void printNumberStructuredWay(List<Integer> numbers) {
		// TODO Auto-generated method stub
		// how to do that : looping
		for(int num:numbers)
			System.out.println(num);
		
	}

}
