package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalProgramingConcept {
	public  static int evaluate() {
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User>users=new ArrayList<>();
		users.add(new User("Ram",20,"ram@gmail.com"));
		users.add(new User("Syam",22,"syam@gmail.com"));
		users.add(new User("Aman",18,"aman@gmail.com"));
		users.add(new User("Tam",21,"tam@gmail.com"));
		
		// using functionalInterface logic or lambda
		Comparator<User> nameComp = (u1,u2)->{
			if(u1.getName().length()==u2.getName().length())
				return u1.getName().compareTo(u2.getName());
			if(u1.getName().length()>u2.getName().length()) 
				return 1;
			return -1;
		};
		
		Collections.sort(users,nameComp);
		System.out.println(users);

	}

}
