
class SharedResource{
public void produce(){

}
public void consume(){

}
}
class Producer implements Runnable{
  SharedResource resource;
  Producer(SharedResource resource){
    this.resource=resource;
  }
public void run(){

}
for(int i=0;i<5;i++){
      resource.produce();
}
}

class Consumer implements Runnable{
  SharedResource resource;
  Consumer(SharedResource resource){
    this.resource=resource;
  }
public void run(){
    for(int i=0;i<5;i++){
      resource.consume();
    }
}
}

public class ThreadCommunication {
  public static void main(String[] args) {
    SharedResource resource=new SharedResource();
    Producer p=new Producer(resource);

    Consumer c=new Consumer(resource);
  }
}
