package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isOdd = (x)-> x%2 !=0;
		Predicate<Integer> isGreater5 = val -> val>5;
		Predicate<String> isLength5 = str -> str.length()==5;
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
				                                         new Integer[]{1,2,3,4,5,8,10,25,19,20}));
		list.stream().filter(isOdd).filter(isGreater5).collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("Is 18 odd and greater than 5: "+isOdd.and(isGreater5).test(18));
		System.out.println("Is 18 odd OR greater than 5: "+isOdd.or(isGreater5).test(18));
		System.out.println("Is 18 not greater than 5: "+isGreater5.negate().test(18));
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList(new String[] {"Rakesh","Ramji","Vikas","Sikha"}));
		names.stream().map(x->x.toUpperCase()).filter(isLength5)
		.collect(Collectors.toList()).forEach(System.out::println);
		
		
		System.out.println();

	}

}
