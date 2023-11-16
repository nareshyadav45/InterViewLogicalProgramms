package java8Durga;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneClass {
	public static void main(String[] args) {
		
		ZoneId local=ZoneId.systemDefault();
		System.out.println(local);
		
		ZoneId usa=ZoneId.of("America/Los_Angeles");
		ZonedDateTime now = ZonedDateTime.now(usa);
		System.out.println(now);
		
		ZonedDateTime now2 = ZonedDateTime.now();
		System.out.println(now2);
		
	
	}

}
