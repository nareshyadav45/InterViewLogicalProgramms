package java8Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCount {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(12);
		l.add(34);
		l.add(20);
		l.add(90);
		l.add(89);
		l.add(100);
		//Stream
		System.out.println(l);
		 long count = l.stream().filter(i->i<=35).count();
		System.out.println(count);
	}

}
