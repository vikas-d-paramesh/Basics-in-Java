

public class the_33 {
    public static boolean palindrome(String str){
        int len=str.length()-1;
        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(len)){
                return false;
            }
            len--;
        }
        return true;
    }

    public static void main(String args[]){
        String str="lal";
        if(palindrome(str)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
