package getterandsetters;
import java.util.Scanner;
class CarsVehicles{
   private String vname;
   private int wheeler;
    CarsVehicles(String vname,int wheeler){
        this.vname=vname;
        this.wheeler=wheeler;
    }
    void setVname(String vname){
        if(wheeler==2||wheeler==4)
        this.vname=vname;
        else
            wheeler=0;

    }
    void getWheeler(int wheeler) {
        this.wheeler = wheeler;
    }
}


public class MenuDriven {
public static void main(String[] ags){
    Scanner sc=new Scanner(System.in);

    CarsVehicles[] obj=new CarsVehicles[5];
     for(int i=0; i<5;i++){

         String vname=sc.next();
         int wheeler;
     }
}
}
