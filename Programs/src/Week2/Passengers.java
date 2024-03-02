package Week2;

public class Passengers {
    private String name;
    private long mno;
    private int distance;

    Passengers(String name,long mno,int distance){
        this.name=name;
        this.mno=mno;
        this.distance=distance;
    }
    void setName(String name){
        this.name=name;
    }

    String getName(){
        return this.name;
    }
    void setMno(long n){
        this.mno=n;
    }
    long getMno(){
        return this.mno;
    }
    void setDistance(int d){
        this.distance=d;
    }
    int getDistance(){
        return this.distance;
    }
    int computeFare(){
     return this.distance*10;

    }
    @Override
    public String toString(){
        return "Passenger Name:"+getName()+"\n Mobile Number"+getMno()+"\n Fair:"+computeFare();
    }


}
