package MethodAndConstrutReffernce;

public class RunnMethod {
	
	public static void sqaure() {
		for (int i=1;i<=10;i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
