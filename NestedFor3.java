// to print this as output:
//     (or)
// Right-Angled Triangle (Left-Aligned)
//    *
//    **
//    ***


public class NestedFor3{
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}