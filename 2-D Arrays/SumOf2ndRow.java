public class SumOf2ndRow {
    public static int SumOf2ndRow(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
                sum+=arr[1][i];
                }
                return sum;
        }

        
    

    public static void main(String args[]) {
        int arr[][] = {{1,2,3},{1,2,3},{1,2,3}};
        System.out.print(SumOf2ndRow(arr));
    }

} 
    


    
