class RemoveDuplicates{
    public static void removeDuplicates(String str,int i, StringBuilder sb, boolean[] map){
        if(i==str.length()){
            System.out.print(sb);
            return;
        }

        int current=str.charAt(i)-'a';
        if(map[current]==true){
            removeDuplicates(str, i+1, sb, map);
        }
        else{
            map[current]=true;
            removeDuplicates(str, i+1, sb.append(str.charAt(i)), map);

        }
    }

    public static void main(String args[]){
        removeDuplicates("haarrdik", 0,new StringBuilder(), new boolean[26]);
    }
}