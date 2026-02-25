// 1] print even number between 1 to n using for loop and if else

import java.util.Scanner;
public class For4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

// 2] print odd number between 1 to n using for loop and if else
                 //for(int i=1;i<=n;i++){
                 //   if(i%2!=0){
                 //       System.out.println(i);
                 //   }
                // }




// 3] //print even number between 1 to n using for loop and if else but in reverse
                //for(int i=n;i>=1;i--){
                //   if(i%2==0){
                //System.out.println(i);
                // }



// 4] //print odd number between 1 to n using for loop and if else but in reverse
                  //for(int i=n;i>=1;i--){
                 //   if(i%2!=0){
                 //       System.out.println(i);
                 //   }
                // }