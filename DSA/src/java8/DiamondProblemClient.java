package java8;

public class DiamondProblemClient implements DefaultMethodInterf,DiamondProblem {
	// If you comment this override method then you get issue
	public void method2() {
		System.out.println("DiamondProblemClient => method2");
		// OR we can call interface method for any of them 
		DefaultMethodInterf.super.method2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiamondProblemClient obj = new DiamondProblemClient();
		obj.method2();
//		DiamondProblem.val = 100;  we can not change this value
		System.out.println(DiamondProblem.val);
	}

}
