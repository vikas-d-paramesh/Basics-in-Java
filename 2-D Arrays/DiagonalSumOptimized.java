public class DiagonalSumOptimized {
    public static void DiagonalSum(int arr[][]) {

        int Dia_1 = 0;
        int Dia_2 = 0;
        int n=arr.length;
    

        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < n; j++) {

        //         if(i == j) {
        //             Dia_1 += arr[i][j];
        //         }

        //         if(i + j == n - 1) {
        //             Dia_2 += arr[i][j];
        //         }
        //     }
        // }

        // System.out.println(Dia_1 + " " + Dia_2);
        for(int i=0;i<n;i++){
            Dia_1+=arr[i][i];
            Dia_2+=arr[i][n-1-i];
        }
        System.out.println(Dia_1 + " " + Dia_2);
    
    }

    public static void main(String args[]) {
        int arr[][] = {{1,2,3},{1,2,3},{1,2,3}};
        DiagonalSum(arr);
    }
    
}
