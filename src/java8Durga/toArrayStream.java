package java8Durga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class toArrayStream {
	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Naresh");
		l.add("suresh");
		l.add("Mahesh");
		l.add("nilesh");
		l.add("subhash");
		System.out.println(l);
		String[] array = l.stream().toArray(String[]::new);
//		for(String a:array) {
//			System.out.println(a);
//		}
		
		Stream<String> strm = Stream.of(array);
		strm.forEach(System.out::println);
		List<String> asList = Arrays.asList(array);
	}

}
