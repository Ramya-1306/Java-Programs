import java.util.*;
public class NumCraft{
    public static void main(String[] args) {
        int a[]=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
            int t1=(a[0]/1000)%10;
            int t2=(a[1]/1000)%10;
            int t3=(a[2]/1000)%10;
            if((t1<t2)&&(t1<t3)){
                System.out.print(t1);
            }
                else if(t2<t3){
                    System.out.print(t2);
                }
                else{
                    System.out.print(t3);
                }
                int h1=(a[0]/100)%10;
                int h2=(a[1]/100)%10;
                int h3=(a[2]/100)%10;
                if((h1>h2)&&(h1>h3)){
                    System.out.print(h1);
                }
                else if(h2>h3){
                    System.out.print(h2);
                }
                else{
                    System.out.print(h3);
                }
                int ten1=(a[0]/10)%10;
                int ten2=(a[1]/10)%10;
                int ten3=(a[2]/10)%10;
                if((ten1<ten2)&&(ten1<ten3)){
                    System.out.print(ten1);
                }
                else if(ten2<ten3){
                    System.out.print(ten2);
                }
                else{
                    System.out.print(ten3);
                }
                int u1=a[0]%10;
                int u2=a[1]%10;
                int u3=a[2]%10;
                if((u1>u2)&&(u1>u3)){
                    System.out.print(u1);
                }
                else if(u2>u3){
                    System.out.print(u2);
                }
                else{
                    System.out.print(u3);
                }
            }
    }


