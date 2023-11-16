package others;

public class MinAndMaxValueInarray {
	public static void main(String[] args) {
		int a[]= {12,3,4,5,1};
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("min element present in array is : " +min);
	}

}
