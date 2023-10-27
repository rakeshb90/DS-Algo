package oops;

public class BMW extends Car {
//	public float cost() { different premitive data type return not valid for overriding 
//		return 50.0f;
//	}
 public Float cost() { // Only Parent(Number) to Child(Float) is valid for non-premitive
	 System.out.println("Child: BMW class => cost()");
	 return 50.0f;
 }
 public final int getCount() { // Non-final method can be override as final but reverse not valid
	 System.out.println("Child: BMW class => getCount()");
	 return 100;
 }
}
