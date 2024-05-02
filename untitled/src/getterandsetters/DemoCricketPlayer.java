package getterandsetters;

import java.util.Scanner;

class CricketPlayer{
    private String name;
    private String country;
    private int playedM;
    private int truns;
    CricketPlayer(String name,String country,int playedM,int truns){
        this.name=name;
        this.country=country;
        this.playedM=playedM;
        this.truns=truns;
    }
    void setName(String n){
        this.name=n;
    }
    String getName(){
        return this.name;
    }
    void setCountry(String c){
        this.country=c;
    }
    String getCountry(){
        return this.country;
    }
    void setPlayedM(int p){
        this.playedM=p;
    }
    int getPlayedM(){
        return this.playedM;
    }
    void setTruns(int t){
        this.truns=t;
    }
    int getTruns(){
        return this.truns;
    }
//    @Override
    public String toString(){
        return "PlayerName:"+getName()+"\n Country:"+getCountry()+"\n No of played match:"+getPlayedM();
    }
}

public class DemoCricketPlayer {
    static CricketPlayer[] arr = new CricketPlayer[5];
    static int i;

    public static void addPlayer(Scanner sc) {
        String name;
        String country;
        int playedM;
        int truns;
        System.out.print("Enter the pname:");
        name=sc.next();

        System.out.print("Enter the country:");
        country=sc.next();
        System.out.print("Enter the played matches:");
        playedM=sc.nextInt();
        System.out.print("Enter the total runs:");
        truns=sc.nextInt();
        arr[i]=new CricketPlayer(name,country,playedM,truns);
        i++;
    }
    public static void display() {
        for(int j=0; j<i;j++) {
            if(arr[j].getPlayedM()>50){
                System.out.println(arr[j].toString());
            }
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int x = 1;
            while (x == 1) {

                System.out.println("1.Add new Cricketer\n2.Display(More than 50 matches)\n3.Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        addPlayer(sc);
                        break;

                    case 2:
                        display();
                        break;
                    case 3:
                        x=0;
                        break;

                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
            sc.close();
        }
    }
