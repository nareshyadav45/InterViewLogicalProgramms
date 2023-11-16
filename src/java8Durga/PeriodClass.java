package java8Durga;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodClass {
	public static void main(String[] args) {
		LocalDate birthday=LocalDate.of(2000+65, Month.MAY, 27);
		
		LocalDate today=LocalDate.now();
		
		Period p=Period.between(birthday, today);
		int years = p.getYears();
		//System.out.println(years);
		//System.out.printf("%d age in years, %d months, %d days",p.getYears(),p.getMonths(),p.getDays());
		
		Period pp=Period.between(birthday, today);
		
		int days =  pp.getYears()*365+pp.getMonths()*30+pp.getDays();
		
		System.out.printf("Your staying days on earth is %d ",days);
		
		
	}

}
