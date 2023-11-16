package java8Durga;

import java.time.LocalTime;

public class LocalTimeFormat {
	public static void main(String[] args) {
		
		LocalTime time=LocalTime.now();
		System.out.println(time);

		int hr = time.getHour();
		
		int min = time.getMinute();
		
		int sec = time.getSecond();
		
		int nano = time.getNano();
		
	
		
		System.out.println(hr+":"+min+":"+sec+":"+nano);
		System.out.printf("%d:%d:%d:%d",hr,min,sec,nano);
		
	}
}
