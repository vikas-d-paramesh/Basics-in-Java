public class MaxOfSubarr {
    public static void PrintSubArray(int arr[]) {
        int n = arr.length;
        int maxSum=0;

        for (int i = 0; i < n; i++) {          
            for (int j = i; j < n; j++) {     
                int sum=0;
                for (int k = i; k <= j; k++) { 
                    System.out.print(arr[k]);
                    sum+=arr[k];
                }
                System.out.print("="+sum);
                if(sum>maxSum){
                    maxSum=sum;
                }
                System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println("Max Sum of subarray in the above array :"+ maxSum);
    }

    public static void main(String args[]) {
        int arr[] = new int[]{1,2,3,4,5,5};
        PrintSubArray(arr);
    }
}
