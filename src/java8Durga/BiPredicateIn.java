package java8Durga;

import java.util.function.BiPredicate;

public class BiPredicateIn {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bi=(a,b)->(a+b)%2==0;
		System.out.println(bi.test(10, 99));
	}

}
