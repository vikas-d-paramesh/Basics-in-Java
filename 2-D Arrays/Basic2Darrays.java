import java.util.Scanner;

public class Basic2Darrays {

    public static boolean Search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("Found in index "+ i+","+j);
                    return true;
                }
            }
        
        }
        return false;

    }

    public static int Largest(int matrix[][]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                Largest=Math.max(Largest,matrix[i][j]);
                }
            }
        return Largest;
    }

    public static int Smallest(int matrix[][]){
        int Smallest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                Smallest=Math.min(Smallest,matrix[i][j]);
                }
            }
        return Smallest;
    }



    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];

        int key=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        boolean ind=Search(matrix, key);
        if(ind){
            System.out.println();
        }
        else{
            System.out.print("Not founde");
        }

        System.out.println(Largest(matrix));
        System.out.println(Smallest(matrix));



    }
    
}
