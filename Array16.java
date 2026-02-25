public class Array16{
    public static void main(String args[]){
        int a[]={1,1,2,3,2,4};
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(a[i]!=a[j]){
                    count++;
                }
                else{
                    continue;
                }
            }
            }
            System.out.println(count);
        }
}