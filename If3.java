//check wether the number is divide by 3 and 5


import java.util.Scanner;
public class If3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        if(number%3==0&&number%5==0){
            System.out.println("divide by 3 and 5");
        }
        else if(number%3==0){
            System.out.println("divide by 3");
        }
        else if(number%5==0){
            System.out.println("divide by 5");
        }
        else{
            System.out.println("not divide by 3 and 5");
        }
        }
        }