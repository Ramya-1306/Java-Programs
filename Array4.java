// create an integer array, get input for 5 nmbrs and print their sum or total using for loop


import java.util.Scanner;
public class Array4{
    public static void main(String args[]){
        int[] a=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 numbers");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+a[i];
        }

        
        System.out.println(sum);
        double r=(double)sum/2;
        System.out.println(r);
    }
}