package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsUtil {
	class Pair{
		String name;
		int frequency;
		Pair(String name,int frequency){
			this.name = name;
			this.frequency = frequency;
		}
	}

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
		names.add("Shyama");
		names.add("Sita");
		names.add("Radha");
		names.add("Sita");
		// Short cut way
		names.stream().map(s->s.toUpperCase()).collect(Collectors.toList())
		.forEach(x->System.out.print(x+" "));
		String longestStr = names.stream().reduce((str1,str2)->str1.length()>str2.length()?str1:str2).get();
	    System.out.println("LongestStr: "+longestStr);
	    
//	    names.stream().map(str->new Pair(str1,1))
//	    .reduce((pair1,pair2)->(pair1.name).equals(pair2.name)?
//	    		new Pair(pair1.name,pair1.frequency+pair2.frequency): pair2))
//	    
		
	}

}
