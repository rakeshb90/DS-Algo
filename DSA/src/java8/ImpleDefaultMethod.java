package java8;

public class ImpleDefaultMethod implements DefaultMethodInterf,DefaultMethodIntf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImpleDefaultMethod imp = new ImpleDefaultMethod();
		imp.method2();
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		DefaultMethodInterf.super.method2();
		DefaultMethodIntf1.super.method2();
		System.out.println("*************Implementation class************");
	}	

}
