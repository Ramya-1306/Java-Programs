//example form john


public class If1{
    public static void main(String[] args) {
        boolean kfc=true;
        boolean chicken=true;
        boolean pepsi=true;
        if(kfc){
            System.out.println("enter kfc");
            if(chicken){
                System.out.println("eat chicken");
                if(pepsi){
                    System.out.println("drink pepsi");
                }
            }
        }
        else{
                    System.out.println("no");
                }
    }
}