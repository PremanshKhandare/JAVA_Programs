import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(arr));
        
        int choice = 2; // Change this to 1 for Bubble Sort or 2 for Selection Sort
        
        switch (choice) {
            case 1:
                bubbleSort(arr);
                System.out.println("Sorted Array using Bubble Sort: " + Arrays.toString(arr));
                break;
            case 2:
                selectionSort(arr);
                System.out.println("Sorted Array using Selection Sort: " + Arrays.toString(arr));
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 for Bubble Sort or 2 for Selection Sort.");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // If no two elements were swapped in inner loop, the array is already sorted.
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}

