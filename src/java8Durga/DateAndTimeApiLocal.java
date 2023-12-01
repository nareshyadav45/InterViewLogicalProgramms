package java8Durga;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeApiLocal {
	public static void main(String[] args) {
		
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		
		LocalTime time =LocalTime.now();
		System.out.println(time);
		
		LocalTime max =LocalTime.MAX;
		System.out.println(max);
		
		LocalTime min=LocalTime.MIN;
		System.out.println(min);
			
		LocalDate minDate=LocalDate.MAX;
		System.out.println(minDate);
		
		LocalDate maxDate=LocalDate.MIN;
		
		System.out.println(maxDate);
		
		LocalTime noon=LocalTime.NOON;
		System.out.println(noon);
		
		LocalTime midnight = LocalTime.MIDNIGHT;
		System.out.println(midnight);
		
		LocalTime of = LocalTime.of(12, 12);
		System.out.println(of);
	}

}
