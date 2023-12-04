package java8Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(12);
		l.add(34);
		l.add(3);
		l.add(1);
		l.add(4);
		l.add(80);
		System.out.println(l);
//		Stream<T>
//		List<Integer> streamOfElements = l.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(streamOfElements);
		
	}

}
