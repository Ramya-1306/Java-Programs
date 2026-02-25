import java.util.*;
public class Student{
    public static void main(String args[]){
    String a[]=new String[3];
    int b[]=new int[3];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a");
    for(int i=0;i<3;i++){
        a[i]=sc.nextLine();
        b[i]=sc.nextInt();
        sc.nextLine();
    }
    System.out.println("students are");
    for(int i=0;i<3;i++){
        System.out.println("Name:"+a[i]+","+"Rollno:"+b[i]);
    }
    }
}