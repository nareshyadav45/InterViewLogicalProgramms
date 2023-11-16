package others;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int rem=0;
		int sum=0;
		
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum=sum+rem*rem*rem;
		}
		
		if(sum==temp) {
			System.out.println("armstrong number"+temp);
		}else {
			System.out.println("not a armstrong number");
		}
		
	}

}
