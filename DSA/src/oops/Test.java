package oops;

public class Test {
//	static Test(){ // only valid modifiers are public,private,protected and default
//		
//	}
	   Test(){
		System.out.println("Parent Test class constructor");
	}
	void Test() {
		System.out.println("Test executed");
	}
	static int Test(int x) {
		System.out.println("Test executed int-arg method");
		return 10*x;
	}

}
