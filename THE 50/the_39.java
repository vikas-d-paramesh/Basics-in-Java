public class the_39 {

    public static void countFrequency(String str){

        for(int i = 0; i < str.length(); i++){

            int count = 0;
            boolean visited = false;

            // check if already counted
            for(int k = 0; k < i; k++){
                if(str.charAt(i) == str.charAt(k)){
                    visited = true;
                    break;
                }
            }

            if(visited){
                continue;
            }

            // count occurrences
            for(int j = i; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " : " + count);
        }
    }

    public static void main(String args[]){
        String str = "programming";
        countFrequency(str);
    }
}