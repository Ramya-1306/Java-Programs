import java.util.Scanner;
public class Ternary{
    public static void main(String args[]){
        //1
        boolean rain=true;
        String example=rain?"umbrella":"enjoy sunlight";
        System.out.println(example);

        //2
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        String c=(a>b)?"a is greater":"b is greater";
        System.out.println(c);

        //3
        int d=(a>b)?a:b;
        System.out.println(d);    
    }
}