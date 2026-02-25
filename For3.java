// 1] get input for a and b and print the nmbr from a to b

import java.util.Scanner;
public class For3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}

// 2] get input for a and b and print the nmbr from b to a
                 //for(int i=b;i>=a;i--){
                //     System.out.println(i);
               //    }