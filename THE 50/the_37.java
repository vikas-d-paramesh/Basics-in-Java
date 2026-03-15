

public class the_37 {
    public static void lowerToUpperCase(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
            char upper=(char)(ch-32);
            System.out.print(upper);
            }
            else{
                System.out.print(ch);
            }
        }
    }
    
    public static void main(String args[]){
        String str="hardi*kH";

        // System.out.println(str.toUpperCase());
        // System.out.println(str.toLowerCase());
        lowerToUpperCase(str);
    }
}
