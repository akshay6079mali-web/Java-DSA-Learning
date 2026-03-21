public class compressstr {
    public static void main (String [] args){
        StringBuilder sb = new StringBuilder("aaabbcccd");

        for(int i = 0; i < sb.length() ; i++){
            int count = 1;
            while(i < sb.length() - 1 && sb.charAt(i) == sb.charAt(i + 1)){
                count++;
                i++;
            }
            System.out.print(sb.charAt(i) + "" + count + " ");
        }
    }
}
