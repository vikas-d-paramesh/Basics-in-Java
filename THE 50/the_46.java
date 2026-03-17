public class the_46 {

    public static void sumOfArray(int[] arr, int target){

        for(int i = 0; i < arr.length; i++){

            for(int j = i + 1; j < arr.length; j++){

                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }

            }

        }
    }

    public static void main(String args[]) {
        int[] arr = {1,4,5,7,6,8};
        sumOfArray(arr, 9);
    }
}