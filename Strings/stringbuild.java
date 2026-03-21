public class stringbuild {
    public static void main (String [] args){
        StringBuilder sb = new StringBuilder("Hello World");

        System.out.println("Original String: " + sb );
        System.out.print("Reversed String: ");
        for(int i = 0 ; i < sb.length() / 2; i++){
            int front = i;
            int back = sb.length() - i - 1;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }
        System.out.print(sb);
    }
}
