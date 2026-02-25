// to print this as output:
//     (or)
// Right-Angle Triangle with Numbers(Inverted)
//    1234
//    123
//    12
//    1


public class NestedFor8{
    public static void main(String[] args) {
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print(j);
            }
            System.out.println();
        }
    }
}