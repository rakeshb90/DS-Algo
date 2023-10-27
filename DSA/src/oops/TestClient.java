package oops;

import java.util.ArrayList;
import java.util.Arrays;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Test t = new Test();
         System.out.println("Hello world");
         t.Test();// as constructor has return type then it is no longer Constructor or it is method now
	     t.Test(10);
	     TestChild tc = new TestChild();// Execution of parent class constructor during child class object creation
	     
	     System.err.println("This is printing without Sysout");
	     // array to list (Arrays.asList(arr))
	     ArrayList<Integer> al = new ArrayList<>(Arrays.asList(new Integer[] {1,2,3,5,8,9}));
	     // list to array (list.toArray(arr))
	     Integer[] arr = new Integer[al.size()];
	    		 arr = al.toArray(arr);
	     for(int x: arr)
	    	 System.out.print(x+" ");
	     
	}

}
