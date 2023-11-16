package others;

public class missingNumberArray {
	public static void main(String[] args) {
		int a[]= {1,3,4,5,7,2,6,8,9,11,12,13,14,15,10,17,19,18,20,21,22,};
		System.out.println(a.length);
		
		int sumOfEleArr=0;
		for(int i=0;i<a.length;i++) {
			sumOfEleArr=sumOfEleArr+a[i];
		}
		System.out.println(sumOfEleArr);
	
	
	int sumOfRange=0;
	for(int i=1;i<=22;i++) {
		sumOfRange=sumOfRange+i;
	}
		
	System.out.println(sumOfRange);
	
	System.out.println(sumOfRange-sumOfEleArr+":Missing element in array ");
	
	}
}
