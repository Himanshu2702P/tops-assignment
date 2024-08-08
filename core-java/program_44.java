package assignment;

class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread 1: " + i);
			try {
				Thread.sleep(2000); // Pause for 2000 milliseconds
			} catch (InterruptedException e) {
				System.out.println("Thread 1 interrupted: " + e.getMessage());
			}
		}
		System.out.println("Thread 1 finished.");
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread 2: " + i);
			try {
				Thread.sleep(2000); // Pause for 2000 milliseconds
			} catch (InterruptedException e) {
				System.out.println("Thread 2 interrupted: " + e.getMessage());
			}
		}
		System.out.println("Thread 2 finished.");
	}
}

	public class program_44 {
	public class ThreadExample {
		public static void main(String[] args) {
			MyThread1 thread1 = new MyThread1();
			MyThread2 thread2 = new MyThread2();

			thread1.start();
			thread2.start();
		}
	}

}
