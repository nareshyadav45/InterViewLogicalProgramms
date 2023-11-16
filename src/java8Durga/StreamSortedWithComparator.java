package java8Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedWithComparator {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(23);
		l.add(44);
		l.add(12);
		l.add(34);
		l.add(2);
		System.out.println(l);
		
		List<Integer> collect2 = l.stream().sorted((i1,i2)->{
			if(i1<i2) {
				return -1;
			}else if(i1>i2) {
				return +1;
			}else {
				return 0;
			}
		}).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Integer> collect = l.stream().sorted((i1,i2)-> i1<i2?+1:i1>i2?-1:0).collect(Collectors.toList());
		System.out.println(collect);
	}

}
