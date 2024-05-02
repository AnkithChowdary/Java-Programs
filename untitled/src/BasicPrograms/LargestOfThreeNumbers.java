package BasicPrograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {
  public static void main(String[] args)   
{  
// The code is finding the largest of three numbers entered by the user.
 Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();  

if(a>=b && a>=c)  
System.out.println(a+" is the largest Number");  

else if (b>=a && b>=c)  
System.out.println(b+" is the largest Number");  
else  

System.out.println(c+" is the largest number");  
sc.close();
}  
}
