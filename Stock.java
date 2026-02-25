import java.util.*;
public class Stock{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int a[]=new int[n];
        float sum=0;
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
           //System.out.println(a[i]);
           sum=sum+a[i];
        }
       sum=sum/n;
       System.out.printf("%.2f",sum);
    }
    }
