//to print name and phn nmbrs of a person using method and return type

public class Method6{
    String getname(String name){
        return name;
    }
    long getphnnmbr(long phn){
        return phn;
    }
    public static void main(String[] args) {
        Method6 m=new Method6();
        String r=m.getname("ramya");
        long s=m.getphnnmbr(8220016327L);
        System.out.println(r);
        System.out.println(s);
    }
}