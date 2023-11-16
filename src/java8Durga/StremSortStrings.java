package java8Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremSortStrings {
public static void main(String[] args) {
	List<String> l=new ArrayList<>();
	l.add("modi narendra");
	l.add("putin valdimir");
	l.add("biden joe");
	l.add("Jin ping 11");
	l.add("raja paksa");
	l.add("rishi sunak ");
	l.add("rishi aunak");
	System.out.println(l);
	
//	List<String> collect = l.stream().sorted().collect(Collectors.toList());
// List<String> collect2 = l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
// System.out.println(collect);
// System.out.println(collect2);
	
	List<String> collect = l.stream().sorted((i1,i2)->{
		if(i1.length()<i2.length()) {
			return -1;
		}else if(i1.length()>i2.length()) {
			return +1;
		}else {
			return 0;
		}
		
	}).collect(Collectors.toList());
	
	System.out.println(collect);
	
	
	List<String> collect2 = l.stream().sorted((i1,i2)->{
		if(i1.length()<i2.length()) {
			return 1;
		}else if(i1.length()>i2.length()) {
			return -1;
		}else {
			return 0;
		}
		
	}).collect(Collectors.toList());
	
	System.out.println(collect2);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
