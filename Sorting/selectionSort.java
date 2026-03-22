import java.util.Scanner;
class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array :");
        int n = sc.nextInt();
        int [] arr = new int [n];

        System.out.println("Enter the elements of array :");
        for(int i = 0; i <= n -1; i++){
            arr[i] = sc.nextInt();
        }

        selectionsort(arr);
        System.out.print("The Sorted array is :");
        for(int i = 0; i <= n - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int selectionsort (int [] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            int smaller = i;
            for (int j = i + 1; j < n; j++){
                if(arr[smaller] > arr[j]){
                    int temp = arr [smaller];
                    arr[smaller] = arr [j]; 
                    arr[j]= temp;
                }
            }
        }
        return n;
    }
}


