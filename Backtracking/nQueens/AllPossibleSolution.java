

public class AllPossibleSolution {
    static int count=0;
    public static boolean isSafe(char Board[][],int i, int j){
        //vertical
        for(int row=i-1;row>=0;row--){
            if(Board[row][j]=='Q'){
                return false;
            }
        }
        //Left up
        for(int row=i-1,col=j-1;row>=0 && col>=0;row--,col--){
            if(Board[row][col]=='Q'){
                return false;
            }
        }
        //right up
        for(int row=i-1,col=j+1;row>=0 && col<Board.length;row--,col++){
            if(Board[row][col]=='Q'){
                return false;
            }
        }

        return true;
    }
    public static void nQueens(char Board[][],int row){
        if(row==Board.length){
            count++;
            //printBoard(Board);
            return;
        }
        for(int j=0;j<Board.length;j++){
            if(isSafe(Board,row,j)){
                Board[row][j]='Q';
                nQueens(Board,row+1);
                Board[row][j]='.';
            }
        }
    }

    public static void printBoard(char Board[][]){
        System.out.println("___________Chess Board___________");
        for(int i=0;i<Board.length;i++){
            for(int j=0;j<Board.length;j++){
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=5;
        char Board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Board[i][j]='.';
            }
        }
        nQueens(Board,0);
        System.out.println("No of Solutions: "+count);
    }
    
}
