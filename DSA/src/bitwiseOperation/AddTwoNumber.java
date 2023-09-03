package bitwiseOperation;

public class AddTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add two number without using +,- operator
		int a=5,b=3;
		while(a != 0) {
			//System.out.println("a is "+a);
			int carry = a&b;
			//System.out.println("carry is "+carry);
			b = a^b;
			//System.out.println("b is "+b);
			a = carry<<1;
		}
		System.out.println("******************************************");
       System.out.println("Sum is "+b);
	}

}
