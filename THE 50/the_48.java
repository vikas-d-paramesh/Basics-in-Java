public class the_48{
    public static void printSubArrays(int[] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                        sum+=arr[k];
                        if(sum>=max){
                            max=sum;
                        }
                }
            }
        }
         System.out.println(sum);
    }

    public static void main(String args[]){
        int[] arr={3,4,5,5,6,5};
        printSubArrays(arr);
    }
}