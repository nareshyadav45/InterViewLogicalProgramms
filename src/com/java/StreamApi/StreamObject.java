package com.java.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
	//Ways to create or Get Stream Object
	
//		Stream<Object> emptyStream = Stream.empty();
//		emptyStream.forEach(e->{
//			System.out.println(e);
//		});
	
		
		//Using Of() method
     String naames[]= {"alpha,beta,gama,physics"};
     Stream<String> streamNames = Stream.of(naames);
     streamNames.forEach(e->{
    	 System.out.println(e);
     });
    
	//using Builder Method
     Stream<Object> buildStream = Stream.builder().build();
     
     IntStream intStream = Arrays.stream(new int[] {112,34,5,11});
     intStream.forEach(e->{
    	 System.out.println(e);
     });
     
     
     //Using Collection Object
     
//     List<Integer> collectionStream = List.of(1,2,3,4,5,6);
//     Stream<Integer> stream = collectionStream.stream();
//     stream.forEach(e->{
//    	 System.out.println(e);
//     });
     
//     List<Integer> collect = stream.filter(e->e>1).collect(Collectors.toList());
//     System.out.println(collect);
     
     
    List<String> stringList=new ArrayList<>();
    stringList.add("one");
    stringList.add("three");
    stringList.add("four");
    stringList.add("kee");
    stringList.add("thumbe");
    
    Stream<String> stream = stringList.stream();
    List<String> collect = stream.filter(e->e.endsWith("e") && e.startsWith("t")).collect(Collectors.toList());
     System.out.println("names startwith 't' and endswith 'e'"+collect);
     
     
     
     
    
	
	}
}
