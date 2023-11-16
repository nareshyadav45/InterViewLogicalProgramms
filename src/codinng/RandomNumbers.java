package codinng;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		
		Random r=new Random();
		r.ints().limit(5).forEach(System.out::println);
		
		
		
	}

}
