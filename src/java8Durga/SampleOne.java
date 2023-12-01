package java8Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleOne {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(14);
		l.add(39);
		l.add(26);
		l.add(78);
		l.add(39);
		l.add(33);
		
		
		
		
		
		long count = l.stream().filter((m)->m<=35).count();
		//System.out.println(count);
       
		List<Integer> collect = l.stream().filter(m->m<=35).collect(Collectors.toList());
		//System.out.println(collect);
		
		
		List<Integer> collect2 = l.stream().map(m->m+5).collect(Collectors.toList());
		//System.out.println(collect2);
		
		
		List<Integer> collect3 = l.stream().sorted().collect(Collectors.toList());
		//System.out.println(collect3);
		
		
		List<Integer> collect4 = l.stream().sorted((i1,i2)->(i1<i2)?+1:(i1>i2)?-1:0).collect(Collectors.toList());
		//System.out.println(collect4);
		
		List<Integer> collect5 = l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		//System.out.println(collect5);
		
		List<Integer> collect6 = l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		//System.out.println(collect6);
		
		List<Integer> collect7 = l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		//System.out.println(collect7);
		
		List<Integer> collect8 = l.stream().sorted().collect(Collectors.toList());
		//System.out.println(collect8);
		
		//System.out.println(collect8.get(1));
		
		List<Integer> collect9 = l.stream().sorted((l1,l2)->(l1<l2)?+1:(l1>l2)?-1:0).collect(Collectors.toList());
		
		//System.out.println(collect9);
		//System.out.println(collect9.get(0));
	
//		Stream<T>
//		l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
//		System.out.println(l);
		Integer min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		//System.out.println(min);
	
		Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		//System.out.println(max);
		
		Integer maxRev = l.stream().min((i1,i2)->i2.compareTo(i1)).get();
		//System.out.println(maxRev);
		
		Integer minRev = l.stream().max((i1,i2)->-i1.compareTo(i2)).get();
		//System.out.println(minRev);
		
//		l.stream().forEach(System.out::println);
//		l.stream().forEach(i->{
//			System.out.println("square of number "+i+" is "+i*i);
//		});
		
//		Consumer<Integer> c=i->{
//			System.out.println(i*i);
//		};
//		
//		Function<Integer, Integer> f=(i)->i*i;
//		
//		l.stream().forEach(c);
		
		
		Integer[] array = l.stream().toArray(Integer[]::new);
//		System.out.println(array);
//		for(Integer i1:array) {
//			System.out.println(i1);
//		}
		
//		Integer[] array2 = l.toArray(Integer[]::new);
//		for(Integer s:array2) {
//		System.out.println(s);
//		}
		
		
		
		Stream<Integer> streams = Stream.of(1,45,78,90);
		//System.out.println(stream);
		// streams.forEach(System.out::println);
		List<Integer> collect10 = streams.filter(i->i%2==0).collect(Collectors.toList());
		//System.out.println(collect10);
		
		Integer[] aa= {2,45,66,24,12};
		
		Stream<Integer> strm = Stream.of(aa);
		List<Integer> collect11 = strm.map(i->i-1).collect(Collectors.toList());
		
		System.out.println(collect11);
		
		
		
		
		
		
		
//		
		//Predicate<Integer> f=(k)->k%2==0;
//		Function<Integer, Integer> i=(ll)->ll+5;
//		
//		
//		for(Integer kk:l) {
//			Integer apply = i.apply(kk);
//			System.out.println(apply);
//			}
			
//			if(f.test(kk)) {
//			System.out.println(kk);
//			}
			
			
//			if(kk%2==0) {
//				System.out.println(kk);
//			}
		}
	}


