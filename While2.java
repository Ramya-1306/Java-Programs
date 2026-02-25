import java.util.Random;
public class While2{
    public static void main(String[] args) {
         Random rand=new Random();
         int n=0;
        while(n!=5){
            n=rand.nextInt(6);
            System.out.println(n);
        }
    }
}