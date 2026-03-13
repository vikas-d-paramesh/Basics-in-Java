public class the_28 {

    public static int noOfDuplicates(int[] arr){
        int dup = 0;

        for(int i = 0; i < arr.length; i++){

            boolean alreadySeen = false;

            // check if arr[i] appeared before
            for(int k = 0; k < i; k++){
                if(arr[i] == arr[k]){
                    alreadySeen = true;
                    break;
                }
            }

            if(alreadySeen) continue;

            // check duplicates after i
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    dup++;
                    break;
                }
            }
        }

        return dup;
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,4,5};
        System.out.println(noOfDuplicates(arr));
    }
}