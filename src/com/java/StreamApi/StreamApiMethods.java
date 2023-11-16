package com.java.StreamApi;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiMethods {
	public static void main(String[] args) {
		
		//filter 
		
		List<String> StringStream = List.of("Naresh Yadav","Yelladri Yadav","Teja Reddy","Purushotham");
		Stream<String> stream = StringStream.stream();
		//List<String> collect = stream.filter(e->e.endsWith("Yadav")).collect(Collectors.toList());
		//System.out.println(collect);
		
	       stream.filter(e->e.endsWith("Yadav")).forEach(System.out::println);
		
		
		
		
		//Map
		
		List<Integer> of = List.of(1,2,3,4);
		//List<Integer> collect2 = of.stream().map(i->i*3).collect(Collectors.toList());
		//System.out.println(collect2);
		
		System.out.println("forEcah");
		of.stream().map(i->i*3).forEach(System.out::println);
		
		
		List<String> of2 = List.of("a","b","c","d","e","z","y","k");
		List<String> collect3 = of2.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		//System.out.println(collect3);
		
		
		//ForEach
		
		of.stream().forEach(d->{
			//System.out.println(d);
		});
         
		//Sort
		
//	 List<String> collect4 = of2.stream().sorted().collect(Collectors.toList());
//	 System.out.println(collect4);
	
		 of2.stream().sorted().forEach(System.out::println);
		 
//Min 
		 Integer minvalue = of.stream().min((n,y)->n.compareTo(y)).get();
		//System.out.println(minvalue);
		
		Integer max = of.stream().max((x,y)->x.compareTo(y)).get();
		//System.out.println(max);
		
		
		

		
	}
	
	
	
	
	
	
	
	
	

}
