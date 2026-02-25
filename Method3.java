//to create a method to buy choco and cake using parameterized method

public class Method3{
    void choco(int money1){
        System.out.println(money1);
    }
    void cake(int money1){
        System.out.println(money1);
    }
    public static void main(String[] args) {
        Method3 m=new Method3();
        m.choco(20);
        m.cake(10);
    }
}