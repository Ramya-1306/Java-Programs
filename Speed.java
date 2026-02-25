import java.util.Scanner;
public class Speed{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter speed");
        int speed=sc.nextInt();
        if(speed<0){
            System.out.println("oops!Fuel is too low");
        }
        if(speed<=0&&speed>=200){
            if(speed==0){
                System.out.println("oops!Start the car!");
            }
            else if(speed>=1&&speed<=60){
                System.out.println("YOu are driving safely.keep it up!");
            }
            else if(speed>=61&&speed<=70){
                System.out.println("Warning:you are slightly over the speed limit.slow down!");
            }
            else if(speed>70){
                System.out.println("you are speeding!you will receive a ticket");
            }
        }
        else{
                System.out.println("invalid input");
            }
    }
}