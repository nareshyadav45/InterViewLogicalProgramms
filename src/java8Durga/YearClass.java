package java8Durga;

import java.time.Year;
import java.util.Scanner;

public class YearClass {
	public static void main(String[] args) {
		
		//Scanner s=new Scanner(System.in);
		//System.out.println("please enter year number");
		//int n = s.nextInt();
		//Year y=Year.of(n);
		//if(y.isLeap()) {
		//	System.out.printf("given year is leap year %d",n);
		//}else {
		//	System.out.printf("Given Year is Not a leap year %d",n);
		//}
		
		Year yy=Year.now();
		System.out.println(yy);
		
		
	}

}
