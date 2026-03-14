

public class the_32 {
    public static StringBuilder reveString(String str){
        StringBuilder revstr=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            revstr.append(str.charAt(i));
        }
        return revstr;
    }

    public static void main(String args[]){
        String str="hardik";
        System.out.println(reveString(str));
    }
    
}
