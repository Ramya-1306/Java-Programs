//to compare which nmbr is greater and smaller or both are equal


import java.util.Scanner;
public class If6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
         System.out.println("enter b");
        int b=sc.nextInt();
        if(a>b) {
            System.out.println("a is big");
        }
        else if(a<b) {
            System.out.println("b is big");
        }
        else {
            System.out.println("a and b are equal");
        }
    }
}