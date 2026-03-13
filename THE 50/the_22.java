

public class the_22 {
    public static int smallest(int[] arr){
        int n=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<n){
                n=arr[i];
            }
        }
        return n;
    }
    
    public static void main(String args[]){
        int[] arr={2,3,1,0,9,6};
        System.out.println(smallest(arr));
    }
    
}
