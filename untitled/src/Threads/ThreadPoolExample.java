package Threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Instead of creating multiple threads for multiple tasks, 
        // we create a thread pool that manages a fixed number of threads.

        //types of thread pools in Java:
        //1.newFixedThreadPool(n) - Creates a pool with a fixed number of threads.
        //2.newCachedThreadPool() - Creates a dynamic pool where JVM manages the number of threads.
        //3.newSingleThreadExecutor() - Creates a pool with a single worker thread.
        //4.newScheduledThreadPool(n) - Used to schedule tasks with a delay or periodic execution.
        //Example: scheduler.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS)

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  

        // Creating a fixed thread pool with 3 threads
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Submitting tasks to the thread pool
        for (Integer i : arr) {    
            service.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " processing: " + i);
                try {
                    Thread.sleep(2000); // Simulating task execution delay
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            });
        }
        
        // Shutdown should be called after submitting all tasks, not inside the loop.
        service.shutdown();
    }
}
