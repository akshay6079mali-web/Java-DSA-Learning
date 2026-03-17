import java.util.Scanner;

public class Arrbasics {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns :");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0 ; i < n ; i ++){
            for( int j = 0 ; j < m  ; j++){
                System.out.println("Enter the element of array at index ("+ i +","+ j +") :");
                arr [i][j] = sc.nextInt();
            }
        } 

        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        System.err.println("The spiral order of the array is :");

        while (rowStart <= rowEnd && colStart <= colEnd){
            for( int col = colStart ; col <= colEnd ; col ++){
                System.out.print(arr [rowStart][col] + " ");
            }
            rowStart ++;

            for(int row = rowStart ; row <= rowEnd ; row++){
                System.out.print(arr[row][colEnd] + " ");

            }
            colEnd --;

            if (rowStart <= rowEnd){
                for(int col = colEnd ; col >= colStart ; col --){
                    System.out.print(arr[rowEnd][col]+ " ");
                }
                rowEnd --;
            }

            if (colStart <= colEnd){    
                for(int row = rowEnd ; row >= rowStart ; row--){
                    System.out.print(arr[row][colStart]+ " ");
                }
                colStart ++;
            }
        }
            System.err.println();
    }
}
