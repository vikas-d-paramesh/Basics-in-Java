public class NoOfTimes {
     public static int NoOfTimes(int arr[][],int key){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(key==arr[i][j]){
                    sum++;
                }
            }
        }

        return sum;
     }
    public static void main(String args[]) {
        int arr[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int key=3;
        System.out.print(NoOfTimes(arr,key));
    }
    
}
