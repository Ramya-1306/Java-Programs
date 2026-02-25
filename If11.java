//example from john


import java.util.Scanner;
public class If11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter score");
        int score=sc.nextInt();
        //1
        if(score>90){
            System.out.println("mac pro");
        }
        else if(score>65){
            System.out.println("iphone");
        }
        else if(score>35){
            System.out.println("video game");
        }
        else{
            System.out.println("beat");
        }




        //2
        if(score>35&&score<65){
            System.out.println("video game");
        }
        else if(score>65&&score<90){
            System.out.println("iphone");
        }
        else if(score>90){
            System.out.println("mac pro");
        }
        else{
            System.out.println("beat");
        }


        //3
        if(score<50){
            System.out.println("you need to improve");
        }
        else if(score>=50&&score<=70){
            System.out.println("good");
        }
        else if(score>70){
            System.out.println("excellent");
        }
    }
}
