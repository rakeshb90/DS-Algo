package java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Predefine functional interface (Function,Predicate,Consumer,Suplier)
		Function<Integer,Integer> square = val->val*val;
		Predicate<Integer> isEven= val -> val%2==0;
		System.out.println("Square of 4: "+square.apply(4));
		System.out.println("Is 28 is even: "+isEven.test(28));
		// using Runnbale interface
		Runnable r = ()->{
				for(int i=0;i<5;i++)
					System.out.println("Cube of "+i+" is: "+i*i*i);
				System.out.println("Child Thread 1");
		};
		Thread t1 = new Thread(r);
		t1.start();
		// OR We can use lambda in other way
		Thread t = new Thread(()->{
			for(int i=0;i<5;i++)
				System.out.println("sqaure of "+i+" is: "+i*i);
			System.out.println("Child Thread 2");
		});
		
		t.start();
		// User define
		SquareFP sq=(x)->x*x;
		System.out.println("Sqare of 20: "+sq.square(20));

	}

}
