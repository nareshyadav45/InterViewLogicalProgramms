package java8Durga;

import java.util.stream.Stream;

public class OfStream {
	public static void main(String[] args) {
		Stream<Integer> strm = Stream.of(9,90,89,78,67,56);
		strm.forEach(System.out::println);
		
		String[] s= {"a","n","j","k"};
		Stream<String> stream = Stream.of(s);
		stream.forEach(System.out::println);
		
		
		
	}

}
