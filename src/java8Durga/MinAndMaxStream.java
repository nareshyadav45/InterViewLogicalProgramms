package java8Durga;

import java.util.ArrayList;
import java.util.List;

public class MinAndMaxStream {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	l.add(12);
	l.add(13);
	l.add(45);
	l.add(2);
	l.add(1);
	System.out.println(l);
	
	Integer min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
	//System.out.println(min);
	
	Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
	//System.out.println(max);
	
	
	Integer Mininteger = l.stream().min((i1,i2)->{
		if(i1<i2) {
			return -1;
		}
		else if(i1>i2) { 
			return +1;
			}
		else{
				return 0;
			}}).get();
	System.out.println(Mininteger);
	
	
	Integer Maxinteger = l.stream().max((i1,i2)->{
		if(i1<i2) {
			return -1;
		}
		else if(i1>i2) { 
			return 1;
			}
		else{
				return 0;
			}}).get();
	System.out.println(Maxinteger);
	
	
	////////////////////////////////////////////
	
	Integer MinintegerDes = l.stream().min((i1,i2)->{
		if(i1<i2) {
			return +1;
		}
		else if(i1>i2) { 
			return -1;
			}
		else{
				return 0;
			}}).get();
	System.out.println(MinintegerDes);
	
	
	Integer MaxintegerDes = l.stream().max((i1,i2)->{
		if(i1<i2) {
			return 1;
		}
		else if(i1>i2) { 
			return -1;
			}
		else{
				return 0;
			}}).get();
	System.out.println(MaxintegerDes);
	
	
	
	//Stream
	
}
}
