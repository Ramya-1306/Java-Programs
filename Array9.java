// how to find largest element in an array


public class Array9{
    public static void main(String[] args) {
        int[] a={10,11,12};
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}