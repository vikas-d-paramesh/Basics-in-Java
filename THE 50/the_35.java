
public class the_35 {
    public static int countConsnants(String str){
        int cons=0;
        for(int i=0;i<str.length();i++){
            if(!(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u')){
                cons++;
            }
        }
        return cons;
    }

    public static void main(String args[]){
        String str="aeioubc";
        System.out.println(countConsnants(str));
    }
    
}
