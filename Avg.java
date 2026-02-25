//Average


import java.util.*;
public class Avg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter mark for 5 subjects(mark1 to mark5)");
        double mark1=sc.nextDouble();
        double mark2=sc.nextDouble();
        double mark3=sc.nextDouble();                     //avg value will be in float.so here used double(pre thinking)
        double mark4=sc.nextDouble();
        double mark5=sc.nextDouble();
        double avg=(mark1+mark2+mark3+mark4+mark5)/5;
        System.out.println("avg:"+avg);
        if(avg<35){
            System.out.println("additional coaching is required");
        }
        else{
            System.out.println("you are good to go");
        }
    }
}