//example from john


public class If8{
    public static void main(String args[]){
        boolean hungry=true;
        boolean icecream=true;
        if((hungry&&icecream)){
            System.out.println("Eat");
        }
        else{
            System.out.println("not eat");
        }
        boolean cricket=false;
        boolean football=false;
        if((cricket||football)){
            System.out.println("play");
        }
        else{
            System.out.println("not play");
        }
    }
}


