package java8Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFilternew {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(12);
		l.add(45);
		l.add(35);
		l.add(32); 
		l.add(20);
		System.out.println(l);
		
		//Stream
		List<Integer> l2 = l.stream().filter(i->i<35).collect(Collectors.toList());
		System.out.println(l2);
		
		List<Integer> collect2 = l2.stream().map(o->o+5).collect(Collectors.toList());
		System.out.println(collect2);
		
		//var x=10;
		
		//Function<Integer, Integer> f=i->i+5;
		
		//List<Integer> collect = l.stream().map(f).collect(Collectors.toList());
//		List<Integer> collect = l.stream().map(f->f+5).collect(Collectors.toList());
//		System.out.println(collect);
	}

}
