
public class the_34 {
    public static int countVowels(String str){
        int vowel=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'){
                vowel++;
            }
        }
        return vowel;
    }

    public static void main(String args[]){
        String str="aeioubc";
        System.out.println(countVowels(str));
    }
    
}
