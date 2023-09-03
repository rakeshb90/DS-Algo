package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToArrayProcessingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[] {1,8,9,20,10,5}));
		Integer[] arr = list.stream().toArray(Integer[]::new);
		for(int val:arr)
			System.out.print(val+" ");
		System.out.println("**************************************Stream.of*********************");
		Stream s = Stream.of(99,999,9999);
		s.forEach(System.out::println);
		Stream str = Stream.of("R","A","J","B","C");
		Object vals = str.filter(x->!x.equals("A")).collect(Collectors.toList());
		System.out.println(vals.toString());

	}

}
