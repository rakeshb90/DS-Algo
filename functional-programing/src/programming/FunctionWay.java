package programming;

import java.util.List;

public class FunctionWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1,23,12,10,16,10,15);
//		printNumberFunctionalWay(numbers);
		printEvenNumberFunctionalWay(numbers);
	}
	private static boolean isEven(int num) {
		return num%2==0;
	}
	private static void printEvenNumberFunctionalWay(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream()
//		.filter(FunctionWay::isEven)
		.filter(num->num%2==0)
//		.forEach(FunctionWay::print);
		.forEach(System.out::println);
	}
	private static void print(int num) {
		System.out.println(num);
	}
	private static void printNumberFunctionalWay(List<Integer> numbers) {
		// TODO Auto-generated method stub
		//[1,23,12,10,16,10,15] => stream
		// 1
		// 23
		// 12 .. and so on 
		// what to do: functional approach
		numbers.stream().forEach(FunctionWay::print); // method reference
		
//		// how to do that : looping
//		for(int num:numbers)
//			System.out.println(num);
//		
	}
}
