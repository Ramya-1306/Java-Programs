import java.util.Scanner;
public class Array13{
    public void array(){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         int s=sc.nextInt();
         int[] b=new int[s];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];
     }
    }
    public static void main(String[] args) {
        Array13 obj=new Array13();
        obj.array();
        }
}