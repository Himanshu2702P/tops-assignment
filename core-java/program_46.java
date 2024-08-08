package assignment;
/*W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set
Daemon () method of Thread class and check whether the thread is set daemon or
not by using is Daemon () method.
TestDaemonThread2 t1=new TestDaemonThread2();
TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
t1.setDaemon(true);//will throw exception here t2.start();*/

class TestDaemonThread2 extends Thread {
	@Override
	public void run() {
		if (isDaemon()) {
			System.out.println(Thread.currentThread().getName() + " is a daemon thread.");
		} else {
			System.out.println(Thread.currentThread().getName() + " is a user thread.");
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public class program_46 {
		public static void main(String[] args) {
			TestDaemonThread2 t1 = new TestDaemonThread2();
			TestDaemonThread2 t2 = new TestDaemonThread2();

			t1.setDaemon(true); 

			t1.start();
			t2.start();
		}
	}

}
