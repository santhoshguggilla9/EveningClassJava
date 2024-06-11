package multithreadingDemo;

public class MultithreadingExample {

	public static void main(String[] args) {
		
		Runnable l1 = () -> // lambda operator
						{
							for (int i = 1; i <= 10; i++) {
								System.out.println("Hi");
								try {
									Thread.sleep(3000); // pause the execution of thread for few milliseconds
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						};
					
		Runnable c1 = () -> // lambda operator
						{
								for (int i = 1; i <= 10; i++) {
								System.out.println("Hello");
									try {
										Thread.sleep(3000);	} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
						};
		
		Thread t1 = new Thread(l1); // passing runnable objects to the thread class constructor
		Thread t2 = new Thread(c1);
		
		t1.start(); // starting the thread
		t2.start();
	}
}
