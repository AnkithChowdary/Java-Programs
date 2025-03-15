package Threads;
import java.lang.Runnable;
class MyThreadClass implements Runnable{
  public void run(){
  System.out.println("Hello");
  }
}
public class ThreadsUsingRunnable {
  public static void main(String[] args) {
    Thread t1=new Thread(new MyThreadClass());
    t1.start();
  }
}
