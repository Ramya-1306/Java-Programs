// to print this as output:
//     (or)
// Right-Angled Triangle (Right-Aligned)
//      *
//     **
//    ***


public class NestedFor5{
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}