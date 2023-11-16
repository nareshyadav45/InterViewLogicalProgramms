package java8Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachStream {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(23);
		l.add(34);
		l.add(45);
		l.add(21);
		l.add(22);
		System.out.println(l);
		Consumer<Integer> c = i -> {
//		System.out.println(i+i);
//		System.out.println(i*3);
			if (i % 2 == 0) {
				System.out.println(i);

			} else {
				System.out.println(i);
			}
		};
		l.stream().forEach(System.out::println);
		l.stream().forEach(c);

	}
}
