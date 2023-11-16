package MethodAndConstrutReffernce;

import java.time.LocalDateTime;

public class Stuff {
	public static void doStuff() {
		System.out.println("I'm Naresh");
		System.out.println("method ref");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.toString());
	}
	
	
	
	public int printHello() {
		System.out.println("Hello World Non static");
		return 45;
	}

}
