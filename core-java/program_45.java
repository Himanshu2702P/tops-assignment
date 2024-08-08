package assignment;
/*• W.A.J.P to start the same Thread twice by calling start () method twice. Test
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start (); */

class TestThreadTwice1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is running...");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread: " + i);
			try {
				Thread.sleep(1000); // Pause for 1000 milliseconds
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thread finished running.");
	}

	public class program_45 {
		public static void main(String[] args) {
			TestThreadTwice1 t1 = new TestThreadTwice1();
			try {
				t1.start();
				t1.start(); // This will throw IllegalThreadStateException
			} catch (IllegalThreadStateException e) {
				System.out.println("Exception caught: " + e);
			}
		}
	}

}