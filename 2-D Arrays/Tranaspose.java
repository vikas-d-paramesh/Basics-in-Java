public class Tranaspose {
    public static void Transpose(int arr[][]){
        int n=arr[0].length;
        int m=arr.length;
        int trans[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                trans[i][j]=arr[j][i];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6}};

        Transpose(arr);
    }
    
}
