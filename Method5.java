//adding two sums using return type

public class Method5{
    int sum(int a,int b){
        int c=a+b;
        return c;   // it will store the value of c in variable in r
    }
    public static void main(String[] args) {
        Method5 m=new Method5();
       int r= m.sum(10,40);     //it necessary to store the sum value in new variable while using return stateent 
        System.out.println(r);
    }
}