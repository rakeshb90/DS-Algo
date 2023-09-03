package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Default sorted 
		List<Integer> nums = new ArrayList<>(Arrays.asList(new Integer[] {12,34,5,6,90,38,2,10}));
		nums.stream().sorted().collect(Collectors.toList())
		.forEach(x-> System.out.print(x+" "));
		System.out.println();
		// Custom sorted
		List<User> users = new ArrayList<>();
		users.add(new User("Ram",20,"ram@gmail.com"));
		users.add(new User("Abhishek",23,"abhi@gmail.com"));
		users.add(new User("Sita",18,"sita@gmail.com"));
		users.add(new User("Babu",22,"babu@gmail.com"));
		users.add(new User("Chandu",19,"chandu@gmail.com"));
		
		users.stream().sorted((obj1,obj2)->obj1.getName().compareTo(obj2.getName())).collect(Collectors.toList())
		.forEach(x->System.out.println(x));
		
		System.out.println("*****************Sorting based on Age*******************");
		users.stream().sorted((obj1,obj2)->obj1.age.compareTo(obj2.age)).collect(Collectors.toList())
		.forEach(x->System.out.println(x));
		System.out.println("*****************Sorting string*******************");
		List<String> names=new ArrayList<>(Arrays.asList(new String[] {"Raj","Abhiram","Sonu","Babalu","Tannu"}));
		names.stream().sorted((str1,str2)->str1.compareTo(str2)).collect(Collectors.toList())
		.forEach(x->System.out.print(x+" "));
		
	}

}
