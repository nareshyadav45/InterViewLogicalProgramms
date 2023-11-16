package others;

public class demonThread extends Thread{

	public void run()
	{
		if(Thread.currentThread().isDaemon()) {
			System.out.println("I'm Demon thread");
		}else {
			System.out.println("not a demon thread");
		}
	}	
	public static void main(String[] args) {
		demonThread d=new demonThread();
		d.setDaemon(true);
		d.start();
		demonThread d2=new demonThread();
		d2.start();
		//d.setDaemon(true);
		demonThread d3=new demonThread();
		d3.start();
	}
}
