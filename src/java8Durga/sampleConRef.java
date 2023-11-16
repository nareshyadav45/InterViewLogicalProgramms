package java8Durga;

public class sampleConRef {
	
	public sampleConRef() {
		System.out.println("sampleCoNRef cdlass Construtor Execution ");
	}
	
	public sampleConRef(String name) {
		System.out.println("sampleConRef class construtor with agrument name :"+name);
	}
	public static void main(String[] args) {
		
		InterfaceConstr c=sampleConRef::new;
//		sampleConRef sample = c.get();
//		sampleConRef sampleConRef = c.get();
//		java8Durga.sampleConRef sampleConRef2 = c.get();
		//System.out.println(sample);
		
		InterfaceConstr cc=sampleConRef::new;
		cc.get("Naresh Yadav");
		cc.get("Sanghamesh Nandi");
		
		
		
	}

}
