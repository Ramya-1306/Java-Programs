//to check pass or fail

import java.util.*;
public class Method8{
    String display(int score){
        if(score>35){
            return "pass";
        }
        else{
            return "fail";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter score");
        int score=sc.nextInt();
        Method8 m=new Method8();
        String result=m.display(score);
        System.out.println(result);
    }
}