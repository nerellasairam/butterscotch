package core.threads;

public class Example1 {

	public static void main(String... args) {
		
		
		Thread th=new Thread(new MyRunnable());
		
		th.start();
		
		System.out.println("out of main");
	}
	
}
