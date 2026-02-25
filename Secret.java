import java.util.*;
public class Secret{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int secret=sc.nextInt();
        int n=sc.nextInt();
        int guess[]=new int[10];
        int limit=n;
        if(n>10){
            limit=10;
        }
        for(int i=0;i<limit;i++){
            guess[i]=sc.nextInt();
        }
        boolean guessedcorrectly=false;
        for(int i=0;i<limit;i++){
            int guesses=guess[i];
            if(guesses<secret){
                System.out.println("too low,try again");
            }
            else if(guesses>secret){
                System.out.println("too high,try again");
            }
            else{
                System.out.println("congratulations!you guessed the number");
                guessedcorrectly=true;
                break;
            }
        }
            if(!guessedcorrectly){
            System.out.println("you have tried all the attempts"+"and"+"the correct code is" +n);
        }
    }
}