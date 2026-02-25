import java.util.*;
public class Amount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=5;
        System.out.println("enter amount");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                if((a[i]+a[j])==k){
                    System.out.println(a[i]+","+a[j]);
                    break;
                }
            }
        }
    }
}
