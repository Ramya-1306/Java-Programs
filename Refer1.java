//to check whether the nmbr is even or odd, prime or not, three digit nmbr or not, and whether it is b/w 500 to 1500 or not


import java.util.Scanner;
public class Refer1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
         int sum=0;
         boolean flag=false;
        for(int i=1;i<=n;i+=2){
            sum=sum+i;
               System.out.println(sum);
               if(sum%2==0){
                System.out.println("even");
               }
               else{
                System.out.println("odd");
               }
                }
                for(int i=2;i<=sum/2;i++){
                    if(sum%i==0)
                    {
                        flag=true;
                        break;
                    }
                    else
                    {
                        flag=false;
                    }
                }
                if(!flag)
                {
                    System.out.println("Prime");
                }
                else
                {
                    System.out.println("Not a prime");
                }
                if((sum%2!=0)&&(sum>100)&&(sum<999))
                {
                    System.out.println("three digit number");
                }
                else{
                    System.out.println("not a three digit number");
                }
                if((!flag)&&(sum>500)&&(sum<1500))
                    {
                        System.out.println("between 500 to 1500");
                    }
                    else{
                        System.out.println("not between 500 to 1500");
                    }
            }
               }