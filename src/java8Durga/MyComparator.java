package java8Durga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
	return (o1<o2)?-1:(o1>o2)?1:0;	
		
//	if(o1<o2) {
//		return +1;
//	}else if(o1>o2) {
//		return -1;
//		
//	}else {
//		return 0;
//	}
//		
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<>();
		l.add(12);
		l.add(34);
		l.add(3);
		l.add(34);
		l.add(45);
		l.add(1);
		System.out.println(l);
//		Collections.sort(l, new MyComparator());
//		System.out.println(l);
		
		
		
		
	}

}
