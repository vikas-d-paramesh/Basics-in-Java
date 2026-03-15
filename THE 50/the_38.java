public class the_38 {

    public static char firstNonRepeatingChar(String str){

        for(int i = 0; i < str.length(); i++){
            int count = 0;

            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }

            if(count == 1){
                return str.charAt(i);
            }
        }

        return '_'; // if no non-repeating character
    }

    public static void main(String args[]){
        String str = "hhardik";
        System.out.println(firstNonRepeatingChar(str));
    }
}