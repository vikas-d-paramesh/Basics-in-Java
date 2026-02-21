public class SearchingSortedArray {

    public static void Searching(int arr[][], int key) {

        int rows = arr.length;
        int cols = arr[0].length;

        int row = 0;
        int col = cols - 1;

        while(row < rows && col >= 0) {

            if(key == arr[row][col]) {
                System.out.println(row + " , " + col);
                return;
            }
            else if(key < arr[row][col]) {
                col--;      // move LEFT
            }
            else {
                row++;      // move DOWN
            }
        }

        System.out.println("Not Found");
    }

    public static void main(String args[]) {

        int arr[][] = {
            {1,4,7,11},
            {2,5,8,12},
            {3,6,9,16},
            {10,13,14,17}
        };

        Searching(arr, 4);
    }
}