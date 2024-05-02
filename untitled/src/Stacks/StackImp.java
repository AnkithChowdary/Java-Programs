package Stacks;

import java.util.ArrayList;

class Stack{
    static ArrayList<Integer> li=new ArrayList<>();
    int peek(){
        return li.get(li.size()-1);
    }
    public static void push(int value){
        li.add(value);
    }
    public static boolean isEmpty(){
        return li.size()==0;
    }
    int pop(){
        int t=li.get(li.size()-1);
        li.remove(li.size()-1);
        return t;
    }

}
public class StackImp {
    public static void main(String[] args) {
        Stack i=new Stack();
        i.push(1);
        i.push(2);
        i.push(3);
        while(!i.isEmpty()){
            System.out.println(i.peek());
            i.pop();
        }
    }
}
