import java.util.Scanner;

public class userstring {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String for which you want to replace the character :");
        String str = sc.nextLine();
        String new_str = "";
        for(int i = 0 ; i <= str.length() - 1 ; i ++){
            if(str.charAt(i) == 'e'){
                new_str += 'i';
            } else {
                new_str += str.charAt(i);
            }
        }
        System.out.println();
        System.out.println("Modified string: " + new_str);
    }
}
