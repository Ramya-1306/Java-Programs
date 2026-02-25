//to create a method to add 2 nmbrs using parameterized method and also for sub, mul, div

public class Method4{
    void sum(int a,int b){
        int c=a+b;
        System.out.println("c:"+c);
    }
    public static void main(String [] args){
        Method4 m=new Method4();
        m.sum(20,30);
    }
}