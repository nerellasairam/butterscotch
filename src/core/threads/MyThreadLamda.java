package core.threads;

public class MyThreadLamda {

	
	
	
	public static void main (String... args) {
		
		Thread test=new Thread(() ->  {
			System.out.print("lamda runnable");	
			});
		
		test.start();
		
		
	}
	
}
