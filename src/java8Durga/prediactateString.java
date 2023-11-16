package java8Durga;

import java.util.function.Predicate;

public class prediactateString {
	public static void main(String[] args) {
		String[] s= {"naresh","suresh","mallesh","mahesh","raju","anji"};
		//Predicate<String> p=(str)->str.length()>5;
		Predicate<String> p=(str)->str.length()%2==0;
		for(String ss:s) {
			if(p.test(ss)) {
				System.out.println(ss);
			}
		}
	}

}
