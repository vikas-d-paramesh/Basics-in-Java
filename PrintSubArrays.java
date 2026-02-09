public class PrintSubArrays {
    public static void SubArr(int arr[]){

        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            for(j=0;j<i+1;j++){
                System.out.print(arr[j]);
            }
j++;
            System.out.print(" ");
        }
    }

    public static void main(String arg[]){
        int arr[]={1,2,3,4,5};
        SubArr(arr);
    }
    
}
