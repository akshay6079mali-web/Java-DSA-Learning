import java.util.Scanner;

public class transposematrix {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows :");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns :");
        int col = sc.nextInt();
        int [][] arr = new int [row][col];

        for (int i = 0 ; i < row ; i ++){
            for (int  j = 0 ; j < col ; j++){
                System.out.print("Enter the number of elements in array at index ("+ i +","+ j +") :");
                arr [i][j] = sc.nextInt();
            }
        }

        System.out.println("The given Matrix is :");
        for (int i = 0 ; i < row ; i ++){
            for (int  j = 0 ; j < col ; j++){
                System.out.print(arr [i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("The Transpoe of Given Matrix is:");

        for (int i = 0 ; i < row ; i ++){
            for (int  j = 0 ; j < col ; j++){
                System.out.print(arr [j][i] + " ");
            }
            System.out.println();
        }
    }
}
