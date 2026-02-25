import java.util.*;
public class TimetableGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 

        for (int d = 1; d <= N; d++) {
            for (int i = 0; i < d; i++) {
                int number;
                if (d % 2 == 1) {
                    number = 2 * i + 1;
                } else {
                    number = 2 * (i + 1);
                }
                System.out.print(number + " ");
            }
            System.out.println(); 
        }

        sc.close();
    }
}
