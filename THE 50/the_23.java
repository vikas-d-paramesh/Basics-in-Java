
public class the_23 {
    public static int sumOfArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

     public static void main(String args[]){
        int[] arr={2,3,1,0,9,6};
        System.out.println(sumOfArray(arr));
    }
}
