package java8Durga;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateJoining {
	public static void main(String[] args) {
		
		int[] k= {1,2,4,6,80,67,55,66,34,88};
		Predicate<Integer> p1=(i)->i%2==0;
		Predicate<Integer> p2=(kk)->kk>10;
		Predicate<Integer> p3=(h)->h>50;
		for(int l:k) {
//			if(p1.and(p2).and(p3).test(l)) {
//				System.out.println(l);
//			}
			
//			if(p1.or(p2).or(p3).test(l)) {
//				System.out.println(l);
//			}
			
//			if(p1.negate().test(l)) {
//				System.out.println(l);
//			}
			
			if(p1.negate().test(l)) {
				System.out.println(l);
			}
			
		}
		

		
	}

}
