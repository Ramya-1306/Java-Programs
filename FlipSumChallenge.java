import java.util.*;
public class FlipSumChallenge{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("choose the option1 or option2");
        int o1=sc.nextInt();
        if(o1==1){
            int result1=(n+1)/2;
            System.out.println(result1);
        }
        if(o1==2){
        int result2=(n+1/2)^2;
        System.out.println(result2);
        }
    }
}
