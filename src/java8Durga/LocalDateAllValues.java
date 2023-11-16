package java8Durga;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.IsoEra;

public class LocalDateAllValues {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		int dd = date.getDayOfMonth();
		
		int mm = date.getMonthValue();
		
		int yyyy = date.getYear();
		
		System.out.println(dd+"-"+mm+"-"+yyyy);
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.println(dayOfWeek);
		
		Month month = date.getMonth();
		System.out.println(month);
		
		int dayOfYear = date.getDayOfYear();
		System.out.println(dayOfYear);
		
		
		
	}

}
