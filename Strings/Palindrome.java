

public class Palindrome {

    public static boolean Palindrome(String str){
        int n=str.length();

        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String str="noon";
        if(!Palindrome(str)){
            System.out.println("Not a Palindrome");
        }
        else{
            System.out.println("Palindrome");

        }

    }
    
}
