package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodRefernce {
	public static void myRun() {
		List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[] {1,3,4,5,8,9}));
		list.stream().map(x->{
		System.out.println("Child thread");
		return x*x;
		}).filter(x->x%5==0).collect(Collectors.toList()).forEach(System.out::println);
	}
	public void myRunInstance() {
		System.out.println("*************Instance method*************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Runnable r = MethodRefernce::myRun;
       Thread t1 = new Thread(r);
       t1.start();
       // Instance 
       MethodRefernce mr = new MethodRefernce();
       r = mr::myRunInstance;
       new Thread(r).start();
       
       Function<Integer,Integer> sqaure = x->x*x;
       System.out.println("Default use: "+sqaure.apply(5));
       // lambda with method reference
       Function<Integer,Integer> cube = mr::myApply;
       System.out.println("Custom use: "+cube.apply(5));
       
       
       
	}
	public Integer myApply(Integer x) {
		return x*x*x;
	}

}
