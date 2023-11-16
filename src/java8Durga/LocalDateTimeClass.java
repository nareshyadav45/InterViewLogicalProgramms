package java8Durga;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeClass {
	public static void main(String[] args) {
//		LocalDateTime dt=LocalDateTime.now();
//		System.out.println(dt);
//		
//		int dd = dt.getDayOfMonth();
//		
//		int mm = dt.getMonthValue();
//		
//		int yyyy = dt.getYear();
//		
//		System.out.printf("%d-%d-%d",dd,mm,yyyy);
//		System.out.println();
//		
//		int hr = dt.getHour();
//		
//		int min = dt.getMinute();
//		
//		int sec = dt.getSecond();
//		
//		int nano = dt.getNano();
//		
//		System.out.printf("%d:%d:%d:%d",hr,min,sec,nano);
		
		LocalDateTime pdt=LocalDateTime.of(2023, Month.JULY, 27, 12, 25);
		System.out.println(pdt);
		
		
		LocalDateTime plusDate = pdt.plusMonths(3);
		System.out.println("After 3 Months |"+plusDate);
		Month month = plusDate.getMonth();
		System.out.println(month);
		DayOfWeek dayOfWeek2 = plusDate.getDayOfWeek();
		System.out.println(dayOfWeek2);
		
		LocalDateTime minusMonths = pdt.minusMonths(7);
		System.out.println("Before 7 months |"+minusMonths);
		System.out.println(minusMonths.getDayOfWeek());
		
		Month month2 = minusMonths.getMonth();
		System.out.println(month2);
		
		LocalDateTime minusDays = pdt.minusDays(1);
		System.out.println(minusDays);
		
		System.out.println(minusDays.getDayOfWeek());
		
	
		
		
		
		
		DayOfWeek dayOfWeek = pdt.getDayOfWeek();
		//System.out.println(dayOfWeek);
		
		
		
		
		
		
		
		
	}

}
