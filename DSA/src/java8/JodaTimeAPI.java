package java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class JodaTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println("Date: "+date);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.println("dd mm yyyy: "+dd+" "+mm+" "+yy);
		LocalTime time = LocalTime.now();
		System.out.println("Time: "+time);
		
		LocalDate bDate = LocalDate.of(1999,12,15);
		Period p = Period.between(bDate,date);
		System.out.println("Period: "+p);
		
         System.out.println(test());// always return from finally block consider in all case
	}
	public static int test() {
		try {
			System.out.println(10/10);
			return 100;
		}
		catch(Exception e) {
			return 200;
		}
		finally{
			return 300;
		}
	}

}
