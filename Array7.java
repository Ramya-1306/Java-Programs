// get input for size of an array
//  get input for each element in an array
//  find and print MIDDLE ELEMENT in an array

//this is for even size(eg-4 numbers in an array)

import java.util.*;
public class Array7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter array element");
        for(int i=0;i<n;i++){                      //for(int i=0;i<=n-1;i++)
            a[i]=sc.nextInt();
        }
        int middle1=a[(a.length/2)-1];             //int middle1=a[(n/2)-1];
        int middle2=a[a.length/2];                 //int middle2=a[n/2];
        System.out.println("middle:"+middle1+"and"+middle2);
    }
}