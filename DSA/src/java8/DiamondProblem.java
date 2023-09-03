package java8;

public interface DiamondProblem {
//	private int val=10;
	int val=10; // by default variable "val" is public,static and final
	
//	we can not declare static and instance block (Diamond problem)
//	{
//		int x=100;
//	}
//	static {}
	public int hashCode() {
		return 10;
	}
	
	public default void method2() {
		System.out.println("DiamondProblem => method2");
	}

}
