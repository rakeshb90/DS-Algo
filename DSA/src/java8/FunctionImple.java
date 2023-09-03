package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> getLength = s->s.length();
		Predicate<Integer> isEven = x->x%2==0;
		ArrayList<String> names = new ArrayList<>(Arrays.asList(new String[] {"Rakesh","Ram","Sita","Shyam"}));
		// Find length of even length string
		names.stream().map(x->x.toUpperCase()).map(getLength).filter(isEven)
		.collect(Collectors.toList()).forEach(System.out::println);

	}

}
