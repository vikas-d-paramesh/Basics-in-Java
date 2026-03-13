public class the_30 {

    public static int maxDifferenceInarr(int arr[]){
        int maxDiff = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                int diff = arr[j] - arr[i];

                if(diff > maxDiff){
                    maxDiff = diff;
                }
            }
        }

        return maxDiff;
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        System.out.println(maxDifferenceInarr(arr));
    }
}