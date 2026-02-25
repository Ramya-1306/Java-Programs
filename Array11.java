// how to find smallest element in an array


public class Array11{
    public static void main(String[] args) {
        int[] a={3,2,1};
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}