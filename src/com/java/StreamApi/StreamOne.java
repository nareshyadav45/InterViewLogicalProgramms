package com.java.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOne {
	public static void main(String[] args) {
	
		List<Integer> IntegerList = List.of(24,25,29,17,31,39,45,99,100,44);
		//IntegerList.add(90);
		System.out.println(IntegerList);
		
		
//		List<Integer>  arraylist=new ArrayList<>();
//		arraylist.add(12);
//		arraylist.add(22);
//		arraylist.add(21);
//		arraylist.add(27);
//		arraylist.add(44);
//		System.out.println(arraylist);
		
		
//		List<Integer> asList = Arrays.asList(23,45,46,48,90,7,19);
//		//asList.add(22);
//		System.out.println(asList);
		
		List<Integer> evenList=new ArrayList<>();
		
		for(Integer even:IntegerList) {
			if(even%2==0) {
				evenList.add(even);
			}
		}
		
		
		System.out.println("Normal List "+IntegerList);
		System.out.println("Even Number List By Normal Approach: "+evenList);
		
		
		
		//with Stream Api Filtering the Data
		
		Stream<Integer> stream = IntegerList.stream();
		List<Integer> streamListEven = stream.filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("with stream even numbers"+ streamListEven);
		
		
		List<Integer> evenListInlessCode = IntegerList.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println("less code with stream "+ evenListInlessCode);
		
		
		List<Integer> elemetsGreater50 = IntegerList.stream().filter(w->w>60).collect(Collectors.toList());
		System.out.println("Elements Greater Than 50 "+elemetsGreater50);
		
		int[] aar= {10,20,59};
		
	//Arrays.stream(aar).filter(s->s>10).collect(null, null, null)
		
	}

}
