// how to find 2nd largest element in an array


public class Array10{
    public static void main(String[] args) {
        int[] a={10,11,12};
        int max=Integer.MIN_VALUE;          //a[0];
        int second=Integer.MIN_VALUE;       //a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<a.length;i++){
            if(a[i]!=max){
                if(a[i]>second){
                    second=a[i];
                }
            }
        }
        System.out.println(second);
    }
}