//example from john using .equals() method


import java.util.*;
public class If2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter colour");
        String colour=sc.nextLine();

        //1
        if(colour.equals("red")){                //java requires "" while entering strings
            System.out.println("stop");
        }
        else if(colour.equals("yellow")){        //java requires "" while entering strings
            System.out.println("get ready");
        }
        else if(colour.equals("green")){        //java requires "" while entering strings
            System.out.println("go");
        }
        else{
            System.out.println("none");
        }


        //2
       // switch (colour) {
          //  case "red":
           //     System.out.println("Stop");
           //     break;
          //  case "yellow":
          //      System.out.println("Get ready");
          //      break;
            //case "green":
              //  System.out.println("Go");
                //break;
          //  default:
            //    System.out.println("None");
       // }
    }
}