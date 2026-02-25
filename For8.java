//multiply 2 nmbrs without using multiplication operator


import java.util.Scanner;
public class For8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=1;i<=b;i++){
            c=c+a;
        }
        System.out.println(c);
        }
    }