package others;

public class swappingThreeVar {
	public static void main(String[] args) {
		int a=50;//90
		int b=70;//60
		int c=90;//50
		int d=60;//70
		
		int temp=b;
		b=d;
		d=temp;
		int temp2=a;
		a=c;
		c=temp2;
		
		
		//without third variable
//		a=a+b+c;
//		b=a-(b+c);
//		c=a-(b+c);
//		a=a-(b+c);
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
		
	}
	
	
	
	
	

}
