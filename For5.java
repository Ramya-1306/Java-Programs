//count the number of odd number from 1 to n

import java.util.Scanner;
public class For5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
                count=count+1;
            }
        }
        System.out.println("count:"+count);
    }
}