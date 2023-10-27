package oops;

public class OverridingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW child = new BMW();
		child.cost();
		child.getCount();
		
		Car parent = new Car();
		parent.cost();
		parent.getCount();
		
		// Child object having parent reference 
		Car child1 = new BMW();
		child1.cost();
		child1.getCount();
		
		
		

	}

}
