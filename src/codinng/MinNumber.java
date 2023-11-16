package codinng;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MinNumber {
	
	public boolean checkDuplicate() {
		
		Stream<Integer> of = Stream.of(1,2,3,4,5);
		List<Integer> list = of.collect(Collectors.toList());
		Set<Integer> set=new HashSet<>(list);
		BiPredicate<List<Integer>,Set<Integer>> bi=(i,l)->i.size()==l.size()?false:true;

		return bi.test(list, set);
		
	}
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(2,4,90,67,45,90,1);
		
//		Integer integer = stream.min((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println(integer);
		
		Integer max = stream.max((i1,i2)->i1.compareTo(i2)).get();
		//System.out.println(max);
		
		List<String> asList = Arrays.asList("naresh","dev","QA","IT","Finance","Hr","Suppport","Security");
		List<String> collect = asList.stream().filter(s->s.length()>=3).collect(Collectors.toList());
		//System.out.println(collect);
		
		
		Stream<Integer> of = Stream.of(5,10,15,20,25,30,35);
		List<Integer> collect2 = of.map(i->i*3).collect(Collectors.toList());
		//System.out.println(collect2);
		
		
		Stream<Integer> str1 = Stream.of(5,10,15,20,25,30,35);
		Stream<Integer> str2 = Stream.of(40,45,50,55,60,65,70);
		
		Stream<Integer> concat = Stream.concat(str1, str2);
		//concat.forEach(System.out::println);
		
		Stream<Integer> of2 = Stream.of(1,2,3,4,1,4,6,7,2,6,9,2,10);
		Set<Integer> collect3 = of2.collect(Collectors.toSet());
		//System.out.println(collect3);
		
		
		LocalDate now = LocalDate.now();
		//System.out.println(now);
		LocalTime now2 = LocalTime.now();
		//System.out.println(now2);
		
		LocalDateTime now3 = LocalDateTime.now();
		//System.out.println(now3);
		
		List<Integer> asList2 = Arrays.asList(1,2,3,4,5);
		int sum = asList2.stream().mapToInt(Integer::intValue).sum();
		//System.out.println(sum);
		
		
		Stream<Integer> of3 = Stream.of(100,22,30,60,70);
		List<Integer> collect4 = of3.filter(i->i>=50).map(i->i*i*i).collect(Collectors.toList());
		//System.out.println(collect4);
		
		Stream<Integer> of4 = Stream.of(1000,12,45,166,178,99,90,45000000,1,66,33,99);
		//List<Integer> collect5 = of4.filter(i->i%2==0).collect(Collectors.toList());
		//System.out.println(collect5);
		
		//List<String> collect6 = of4.map(String::valueOf).filter(d->d.startsWith("1")).collect(Collectors.toList());
		//System.out.println(collect6);
		
		
		Set<Integer> set=new HashSet<>();
		//of4.filter(i->!set.add(i)).forEach(System.out::println);
		//long count = of4.filter(i->!set.add(i)).count();
		//System.out.println(count);
		
//		Optional<Integer> optional = of4.findFirst();
//		optional.ifPresent(System.out::println);
		
		
//		long count = of4.count();
		//System.out.println(count);
		
//		Integer maxInteger = of4.max((o1,o2)->o1.compareTo(o2)).get();
//		System.out.println(maxInteger);
//		
		
		
		
		//of4.sorted((i1,i2)->i2.compareTo(i1)).forEach(System.out::println);
		
		//MinNumber mm=new MinNumber();
		//System.out.println(mm.checkDuplicate());
		
		
		Stream<String> of5 = Stream.of("abc","def","ghi","jkl");
		Stream<String> of6 = Stream.of("mno","pqr","sto","uvw","xyz");
		Stream<String> concat2 = Stream.concat(of5, of6);
	  //List<String> collect5 = concat2.collect(Collectors.toList());
	//  System.out.println(collect5);
	  
	  //concat2.forEach(System.out::println);
	  
	  Stream<Integer> of7 = Stream.of(10,20,60,70,80,90);
	 // of7.filter(i->i>50).map(i->i*i*i).forEach(System.out::println);
	  
	  
	int[] num= {34,99,12,2,3,4,1};
	
	  
	  Arrays.parallelSort(num);
	  
	  IntStream stream2 = Arrays.stream(num);
	 // stream2.forEach(System.out::println);
	  
	  
	  Stream<String> of8 = Stream.of("aa","bb","cc","dd");	  
	  of8.map(String::toUpperCase).forEach(System.out::println);
	  
	  
	  
	  
		
	}

}
