import java.util.Scanner;

public class stringlength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        String [] arr = new String[n];
        int len =0, total_len = 0;
        for(int i = 0 ; i <= n - 1 ; i ++){
            System.out.print("Enter the string " + (i + 1) + ": ");
            arr[i] = scanner.next();
        }

        for(int i = 0 ; i <= n - 1 ; i ++){
            len = arr[i].length();
            System.out.print("Length of string " +(i + 1)+ ":" + len + "\n");
            total_len += len;
        }
        System.out.print("Total length of all strings: " + total_len);
    }
}


