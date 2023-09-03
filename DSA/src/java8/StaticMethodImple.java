package java8;

public class StaticMethodImple implements  StaticMethodInterf{
	// this is not override method, if you comment this method then we can not call 11 line 
	public static void message() {
		System.out.println("Hi, I am StaticMethodImple");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodImple obj = new StaticMethodImple();
		obj.message();// not available
		StaticMethodInterf.message();

	}

}
