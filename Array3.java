// get input for 5 nmbrs using array and for loop

import java.util.*;
public class Array3{
    public static void main(String args[]){
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 nmbrs");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the nmbrs you entered");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}

