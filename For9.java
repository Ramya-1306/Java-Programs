// print any tables by using for loop


import java.util.Scanner;
public class For9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter table");
        int table=sc.nextInt();
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int c=i*table;
            System.out.println(i+"x"+table+"="+c);
        }
    }
}