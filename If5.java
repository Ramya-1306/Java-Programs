//to find whether the nmbr is odd or even


import java.util.Scanner;
public class If5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("even");
        }
        else if(number%2==1){
            System.out.println("odd");
        }
        }
        }