public class the_36 {

    public static StringBuilder removeDuplicates(String str){

        StringBuilder nodu = new StringBuilder();
        boolean[] seen = new boolean[26];

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int idx = ch - 'a';

            if(!seen[idx]){
                nodu.append(ch);
                seen[idx] = true;
            }
        }

        return nodu;
    }

    public static void main(String args[]){
        String str = "haarrdik";
        System.out.println(removeDuplicates(str));
    }
}