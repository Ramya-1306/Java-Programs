// to print this as output:
//     (or)
// Inverted Triangle (Left-Aligned)
//    ***
//    **
//    *


public class NestedFor4{
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=3;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}