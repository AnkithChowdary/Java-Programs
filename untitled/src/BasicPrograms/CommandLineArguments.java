package BasicPrograms;

public class CommandLineArguments {
  public static void main(String[] args) {
    if(args.length>0){
      System.out.println("The commandline arguments are :");
System.out.println(args[0]);
      for(String val:args)
      System.out.println(val);
    }else
    System.out.println("No commandline arguments found");
  }
}
