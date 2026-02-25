//print the number which are divisible by both 3 and 5

import java.util.Scanner;
public class For6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if((i%3==0)&&(i%5==0)){
                System.out.println(i);
            }
        }
    }
}