package assignment;
/*W.A.J. P to create one thread by extending Thread class in another Class. */

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread started running...");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(300); // Pause for 300 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println("Thread finished running.");
    }
}  
    
    public class program_43{
    	
    
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        // Main thread continues to run
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted: " + e.getMessage());
            }
        }
        System.out.println("Main thread finished.");
    }
}


