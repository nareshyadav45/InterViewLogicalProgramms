package java8Durga;

import java.util.function.Function;

public class FunctionInter {
	public static void main(String[] args) {
		
//		Function<Boolean, Boolean> f=(k)->k.booleanValue();
//		System.out.println(f.apply(false));
		
		//Function<String, Integer> f=(k)->k.length();
		//Function<String, String> f=(k)->k.toUpperCase();
		Function<Integer, String> f=(k)->{return (k<100)?"greatervalue":"less value";};
		System.out.println(f.apply(44));
		
	}

}
