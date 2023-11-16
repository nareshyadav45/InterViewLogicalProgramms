package java8Durga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaWithCollections {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(34);
		l.add(3);
		l.add(34);
		l.add(45);
		l.add(1);
		System.out.println(l);
//		Comparator<Integer> c = (t1, t2) -> (t1 < t2) ? -1 : (t1 > t2) ? 1 : 0;
//
//		Collections.sort(l, c);
//		l.stream().forEach(System.out::println);
//		List<Integer> collect = l.stream().filter((i)->i%2==0).collect(Collectors.toList());
//		System.out.println(collect);
		//System.out.println(l);

//	Comparator<Integer> c=(t1,t2)->{
//		if(t1<t2) {
//			return -1;
//		}else if(t1>t2)
//		{
//			return +1;
//		}else {
//			return 0;
//		}
//		};
//	
	}

}
