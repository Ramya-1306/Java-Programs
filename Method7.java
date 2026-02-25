//to check wether the given number is odd or even using paramatererized constructor

import java.util.*;
public class Method7{
    void display(int num){
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        Method7 m=new Method7();
        int num=sc.nextInt();
        m.display(num);
    }
}