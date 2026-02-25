//example from john


import java.util.*;
public class If7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter salary and age");
        int salary=sc.nextInt();
        int age=sc.nextInt();
        if(salary>=20000||age<=25){
            System.out.println("enter loan amount");
            int loanamount=sc.nextInt();
            if(loanamount<=50000){
                System.out.println("you are eligible for loan");
            }
            else if(loanamount>50000){
                System.out.println("maximum loan amount is 50000");
            }
        }
        else{
            System.out.println("you are not eligible for loan");
        }
    }
}