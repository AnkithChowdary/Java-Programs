package Abstract;
class Unknown{
  public void display(){
    System.out.println("In Unknown Class");
  }
  public void display2(){
    System.out.println("In Unknown Class Display2 method");
  }
}

public class Anonymous{

  public static void main(String[] args)
  {
     Unknown obj=new Unknown()
     {
         public void display()
         {                       
          System.out.println("In Anonymous class");    //This method output will be printed instead of Unknown class method
         }
     };
     obj.display();
     obj.display2();

  }
}