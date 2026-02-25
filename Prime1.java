//to check wether a num is prime or not


import java.util.*;
public class Prime1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}