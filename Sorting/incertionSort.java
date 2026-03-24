import java.util.Scanner;
class incertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array :");
        int n = sc.nextInt();
        int [] arr = new int [n];

        System.out.println("Enter the elements of array :");
        for(int i = 0; i <= n -1; i++){
            arr[i] = sc.nextInt();
        }

        incertionsort(arr);
        System.out.print("The Sorted array is :");
        for(int i = 0; i <= n - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int incertionsort (int [] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = key;
        }
        return n;
    }
}
