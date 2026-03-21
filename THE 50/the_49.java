public class the_49 {

    public static void zeroAtEnd(int[] arr){

        int j = 0; // position to place next non-zero

        for(int i = 0; i < arr.length; i++){

            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }

        // fill remaining with zeros
        while(j < arr.length){
            arr[j] = 0;
            j++;
        }

        // print array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int[] arr = {2,4,0,0,5,0,4,3,2,0};
        zeroAtEnd(arr);
    }
}