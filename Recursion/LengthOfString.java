

public class LengthOfString {
    public static int lengthOfString(String str,int n){
        if(n==str.length()){
            return 0;
        }
        return 1+lengthOfString(str, n+1);
        
    }
    
    public static void main(String args[]){
        String str="hardik";
        System.out.println(lengthOfString(str, 0));
    }
}
