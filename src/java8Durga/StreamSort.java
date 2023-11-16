package java8Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamSort {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(20);
		l.add(90);
		l.add(12);
		l.add(3);
		l.add(3);
		l.add(129);
		System.out.println(l);
		//Stream
		//Comparator
		List<Integer> collect = l.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Integer> collect3 = l.stream().sorted((i1,i2)->{
			if(i1<i2) {
				return -1;
			}else if(i1>i2) {
				return +1;
			}else {
				return 0;
			}
		}).collect(Collectors.toList());
		System.out.println(collect3);

	
	
	List<Integer> collect4 = l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
	System.out.println(collect4);
	
	List<Integer> collect5 = l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
	System.out.println(collect5);
	
	
	
	}
}
