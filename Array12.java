// how to find 2nd smallest element in an array


public class Array12{
    public static void main(String[] args) {
        int[] a={3,2,1};
        int min=Integer.MAX_VALUE;          //a[0];
        int second=Integer.MAX_VALUE;       //a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
        for(int i=0;i<a.length;i++){
            if(a[i]!=min){
                if(a[i]<second){
                    second=a[i];
                }
            }
        }
        System.out.println(second);
    }
}