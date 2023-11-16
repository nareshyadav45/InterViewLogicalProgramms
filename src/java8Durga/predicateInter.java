package java8Durga;

import java.util.function.Predicate;

public class predicateInter {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p=(i)->{
			if(i%2==0) {
				return true;
			}else {
				return false;
			}
		};
		
		
		//Predicate<Integer> i=(k)->{return (k%2==0)?true:false;};
		
		//Predicate<Integer> i=(k)->k%2==0;
		System.out.println(p.test(12));
		
		
		//Predicate<String> s=(k)->{return (k.length()>5)?true:false;};
//		Predicate<String> f=(l)->{
//			if(l.length()>5) {
//				return true;
//			}else {
//				return false;
//			}
//		};
		Predicate<String> d=(h)->h.length()>5;
		System.out.println(d.test("naresh"));
		
		
		
		
	}

}
