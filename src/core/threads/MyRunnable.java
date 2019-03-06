package core.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		
		try {
			Thread.sleep(20000);
			System.out.println("inside MyRunnable : run");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
