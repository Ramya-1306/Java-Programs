//example from john


import java.util.Scanner;
public class If9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        String Meghna=sc.nextLine();
        if(Meghna.equals("dead")){
            System.out.println("surya meets ramya");
        }
        else{
            System.out.println("surya weds Meghna");
        }
        System.out.println("enter mark");
        int mark=sc.nextInt();
        if(mark>35){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        System.out.println("enter num");
        double a=sc.nextInt();
        if((a%3==0)&&(a%5==0)){
            System.out.println("divide by 3&5");
        }
        else{
            System.out.println("not divide by 3&5");
        }
    }
}