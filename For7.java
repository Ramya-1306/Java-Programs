//multiplication using for loop

import java.util.Scanner;
public class For7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=i*2;
            System.out.println(a);
        }
        }
    }