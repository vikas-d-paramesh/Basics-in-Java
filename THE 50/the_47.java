public class the_47{
    public static void printSubArrays(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                        System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]){
        int[] arr={3,4,5,5,6,5};
        printSubArrays(arr);
    }
}