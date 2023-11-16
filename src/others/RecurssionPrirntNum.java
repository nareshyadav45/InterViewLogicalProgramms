package others;

public class RecurssionPrirntNum {
	
		public static void printNum(int n) {
			
			if(n==11) {
				return;
			}
			
			System.out.println(n);
			printNum(n+1);
			
		}
		public static void main(String[] args) {
			int num=1;
			printNum(num);
		}
	

}
