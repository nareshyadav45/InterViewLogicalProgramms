package others;

public class fabinacci {
	public static void main(String[] args) {
		int n1=0,n3;
		int n2=1;
		
		for(int i=0;i<=5;i++) {
			n3=n1+n2;
			System.out.print(n3+" , ");
			n1=n2;
			n2=n3;
		}
		
	}

}
