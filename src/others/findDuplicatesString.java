package others;

public class findDuplicatesString {
	
	public static void main(String[] args) {
		
	
//	String s="nareshyadavy";
//	char[] nh = s.toCharArray();
//	
//	int count=0;
//	for(int i=0;i<nh.length;i++) {
//		for(int j=i+1;j<nh.length;j++) {
//			if(nh[i]==nh[j]) {
//				System.out.println("duplicate char found : "+nh[i]);
//				count++;
//			}
//		}
//	}
//	
//	System.out.println("count of total duplicate characters " +count);
//	
	
	
	
	int n=1232453;
	String str = String.valueOf(n);
	char[] ch = str.toCharArray();
	int count=0;
    for(int i=0;i<ch.length;i++) {
    	for(int j=i+1;j<ch.length;j++) {
    		if(ch[i]==ch[j]) {
    			System.out.println("duplicate Value found "+ch[i]);
    			count++;
    		}
    	}
    }
    System.out.println("Num of duplicates "+count);
	
	}
	
	
	
	
	
}
