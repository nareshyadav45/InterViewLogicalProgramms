package others;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter will check whether it's prime or not");
		int nextInt = s.nextInt();
		int temp = 0;
		for (int i = 2; i < nextInt; i++) {
			if (nextInt % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println("it's not a prime numbner");
		} else {
			System.out.println("it's a prime number");
		}
	}

}
