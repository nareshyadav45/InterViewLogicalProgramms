package others;

public class DuplicateArray {
public static void main(String[] args) {
	
	
//	String s[]= {"java","python","java","c","python"};
//	boolean duplicate=false;
//	for(int i=0;i<s.length;i++) {
//		for(int j=i+1;j<s.length;j++) {
//			if(s[i]==s[j]) {
//				System.out.println("duplicate element found "+s[i]);
//				duplicate=true;
//				
//			}
//		}
//	}
//	
//	if(duplicate==true) {
//		System.out.println("dulpicate element found");
//	}else {
//		System.out.println("duplicate element not found");
//	}
	
	//length of array each element
//	String s[]= { "python","java", "c" ,".net"};
//	for(int i=0;i<s.length;i++) {
//	        int length = s[i].length();
//	        System.out.println(length);
//	}
	
	String s= "python java c .net";
	
		String[] split = s.split(" ");
		for(int j=0;j<split.length;j++) {
			int length = split[j].length();
			System.out.println(length);
		}
	
	
	
	
	
	
//	String a[]= {"java","python","java","c","python"};
//	System.out.println(a.length);
//	for(int i=0;i<a.length;i++) {
//		for(int j=i+1;j<a.length;j++) {
//			if(a[i]==a[j]) {
//				System.out.println("duplicate element found "+a[i]);
//			}
//		}
//	}
	
	//int array
	
//	int n[]= {1,2,3,4,5,1,5};
//	for(int i=0;i<n.length;i++) {
//		for(int j=i+1;j<n.length;j++) {
//			if(n[i]==n[j]) {
//				System.out.println("duplicate int element found ="+n[i]);
//			}
//		}
//	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
