package C2;

class Ankith1 {
    private int s1;
    private int s2;
    private int s3;
    public void setS1(int k){
        this.s1=k;
    }
    public int getS1(){
        return this.s1;

    }
    public void setS2(int k){
        this.s2=k;
    }
    public int getS2(){
        return this.s2;

    }
    public void setS3(int k){
        this.s3=k;
    }
    public int getS3(){
        return this.s3;

    }
    public double avg(){
        double a=(double)(getS1()+getS2()+getS3())/3;
        return a;
    }
    public String toString(){
        return "sub1: "+getS1()+"\nsub2: "+getS2()+"\n  Sub3: "+getS3()+"\n avg: "+avg();
    }


}
