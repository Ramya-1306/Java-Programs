//to print prime number from 1 to n


import java.util.*;
public class Prime2{
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
        if(isprime){
            System.out.println(i);
        }
        }
    }
}