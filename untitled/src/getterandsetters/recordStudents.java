package getterandsetters;

class Students{
  String name;
  int marks;
  public Students(){

  }
   // Constructures: 
   //1.Are called during object creation
   //2.To initialize the class
   //3.there are two types of constures:
   //   *Parameterised constructure and without parameterised constructure
   // Constuctures are special type of methods
   //We need to define none prameterised constructure when we already defined a prameteried and want to use default constructure(unparameterised)
   //Generally during object creation when we don't pass parameters then java automatical creates the default constructure
   public Students(String name, int marks){
    this.name=name;                    // Here this refers to current object 
    this.marks=marks;
  }
  // Getters are used to get the values
  public String getName(){
    return name;
  }
  //To initialize the class
  public int getMarks(){
    return marks;
  }
  // Setters are used to initialize the class but the only difference between setters and constructures is constructures can be used only once but 
  //setters can be used many times 
  public void setName(String name){
    this.name=name;
  }
  public void setMarks(int marks){
    this.marks=marks;
  }
  public String toString(){
   return ""+this.name+" "+this.marks;                     // toString method is called when we print the object and if toString method
                                                          //is not written then it's address will be printed on to the screen
  }

}
public class recordStudents {
    
  static int id=123;
  int k=100;                                      // Static things can access static 
   public static void main(String [] args){
     recordStudents r=new recordStudents();
                  System.out.println(r.k);                                          // If we want to print a non static varible declared outside the main class
                                                                                  // then we need to create a object of the getterandsetters.recordStudents and access using it
     Students s1=new Students("Ankith",50);
     
    System.out.println(recordStudents.id);                                    // IF the variable is static then we can access it using the class name or variable name
     Students s2=new Students();
     
     s2.setMarks(60);
    s2.setName("Bhomraj");                  

     Students s3=new Students();
     s3.name="Yogendra";
     s3.marks=60;
 
     Students st[]=new Students[3];
     
     
     st[0]=s1;
     st[1]=s2;
     st[2]=s3;
 
      for(Students x:st){                                    // For each loop 
       System.out.println(x.getName()+" "+x.getMarks());
      }
      System.out.println(s1);
 
   }
}
