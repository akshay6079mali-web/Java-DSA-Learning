import java.util.Scanner;

public class username {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);   
        System.out.println("Enter Your Gmail ID :");
        String username = sc.nextLine();

        System.out.println("Your username is :");
        for(int i = 0 ; i <= username.length() - 1 ; i ++){
            if (username.charAt(i) == '@'){
                break;
            }else {
                System.out.print(username.charAt(i));
            }
            
        }
    }
}
