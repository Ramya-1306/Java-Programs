//to print prime number from 1 to n excluding the number 3 if it is in unit digit


import java.util.*;
public class Prime3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            boolean isprime=true;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                isprime=false;
                break;
            }
        }
        int r=i%10;
            if(r!=3){
        if(isprime){
            System.out.println(i);
        }
            }
        }
    }
}