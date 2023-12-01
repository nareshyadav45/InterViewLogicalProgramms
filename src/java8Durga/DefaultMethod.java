package java8Durga;

import others.recurssion;

public interface DefaultMethod {
	
	
	public void m1();
	public void m2();
	default void m3() {
		System.out.println("default method");
	}
//	default int hashCode() {
//		return 10;
//	}

}
