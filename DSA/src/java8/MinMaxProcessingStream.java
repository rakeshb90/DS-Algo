package java8;

import java.util.ArrayList;
import java.util.List;

public class MinMaxProcessingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<>();
		users.add(new User("Ram",20,"ram@gmail.com"));
		users.add(new User("Abhishek",23,"abhi@gmail.com"));
		users.add(new User("Sita",18,"sita@gmail.com"));
		users.add(new User("Babu",22,"babu@gmail.com"));
		users.add(new User("Chandu",19,"chandu@gmail.com"));
		User minAgeUser=users.stream().min((u1,u2)->u1.age.compareTo(u2.age)).get();
		System.out.println(minAgeUser);
		User User = users.stream().max((u1,u2)->u1.getName().compareTo(u2.getName())).get();
		System.out.println("maxCharNameUser: "+User);
		

	}

}
