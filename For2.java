//print 1 to n in reverse order using for loop

import java.util.Scanner;
public class For2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}