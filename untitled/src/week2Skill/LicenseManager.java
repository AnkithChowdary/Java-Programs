package week2Skill;

import java.util.Scanner;

public class LicenseManager {
  private static LicenseManager obj;
  private LicenseManager(){};
   public static LicenseManager getInstance(){
    if(obj==null){
      obj=new LicenseManager();
    }
    return obj;
   }

   public boolean validateLicense(int i){
      return i==1?true:false;
   }

   public String getLicense(int i){
    return validateLicense(i)?"License is valid":"License is not valid";
   }

   public static void main(String [] args){
    LicenseManager li=LicenseManager.getInstance();
    Scanner sc=new Scanner(System.in);
    System.out.println(li.getLicense(1));
   }
}
