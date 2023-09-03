package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++)
			list.add(i);
		ArrayList<Integer> list1 = (ArrayList<Integer>) list.stream().filter((val)->val%2==0).collect(Collectors.toList());
		// 
		long evenCount = list.stream().filter((val)->val%2==0).count();
		list1.forEach(x -> System.out.print(x+" "));
		System.out.println("Count of even number present in list is: "+evenCount);
		ArrayList<String> names = new ArrayList<>();
		names.add("Ram");
		names.add("Shyam");
		names.add("Sita");
		names.add("Radha");
		// Short cut way
		names.stream().map(s->s.toUpperCase()).collect(Collectors.toList())
		.forEach(x->System.out.print(x+" "));
	
		
	}

}
