package java8Durga;

import java.util.function.Function;
import java.util.function.Predicate;

public class sample {
	
	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(4));
		
//		Function<Integer,Integer> f=i->i*i;
//		System.out.println(f.apply(3));
		
	}
	
	

}
