package ArraysProblems;

public class ArrayCmd {
    public static void main(String[] args){
        float s=0;
        for(String k:args){
            s+=Float.parseFloat(k);
        }
        float max=Float.parseFloat(args[0]);
        for(String n:args)
        {
            if(Float.parseFloat(n)>max)
                max=Float.parseFloat(n);
        }
        System.out.println(s);
        int x=args.length;
    }
}
