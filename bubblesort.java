import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        System.out.println("");
        Scanner in = new Scanner(System.in);
        int num = 0;
        int last = arr.length - 1;
        boolean swap;
        
        
        do {
            swap = false;
            for (int i = 0; i < last; i++) {
                if (arr[i] > arr[i + 1]) {
                    num = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = num;
                    swap = true;
                }

            }
            last --;
        } while (swap == true);
        
    }
    

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
