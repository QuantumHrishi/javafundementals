class MyTaskRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Task running: " + Thread.currentThread().getName());
        
        // CPU-intensive task to show core utilization
        long sum = 0;
        for(int i = 0; i < 1000000000; i++) {
            sum += Math.sqrt(i) * Math.sin(i);
            if(i % 100000000 == 0) {
                System.out.println(Thread.currentThread().getName() + " progress: " + i/100000000);
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished with sum: " + sum);
    }
}

public class MyTask {
    public static void main(String[] args) {
        System.out.println("=== Testing with start() - Multiple cores ===");
        //htop -p $(pgrep -f java)
        Thread t1 = new Thread(new MyTaskRun());
        Thread t2 = new Thread(new MyTaskRun());
        Thread t3 = new Thread(new MyTaskRun());
        Thread t4 = new Thread(new MyTaskRun());
        
         t1.start();  // Creates new thread - can use different cores
         t2.start();  // Creates new thread - can use different cores
         t3.start();  // Creates new thread - can use different cores
         t4.start();  // Creates new thread - can use different cores
        
        // Uncomment below to test with run() - Single core
        
        // System.out.println("\n=== Testing with run() - Single core ===");
        // t1.run();   // Runs in main thread only
        // t2.run();   // Runs in main thread only
        // t3.run();   // Runs in main thread only
        // t4.run();   // Runs in main thread only
        
    }
}




