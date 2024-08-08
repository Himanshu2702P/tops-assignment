package assignment;
/*W.A.J. P to create one thread by implementing Runnable interface in
Class*/

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
    public class program_42{
    	
    
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        // Main thread continues to run
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        		}
        
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
   }
