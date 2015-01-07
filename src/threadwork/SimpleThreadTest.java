package threadwork;

public class SimpleThreadTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable(), "T1");
		Thread t2 = new Thread(new MyRunnable(), "T2");
		t1.start();
		t2.start();
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out
					.println(Thread.currentThread().getName() + " says: " + i);
		}
	}
}
