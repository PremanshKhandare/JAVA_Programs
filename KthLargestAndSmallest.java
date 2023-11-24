import java.util.Arrays;

public class KthLargestAndSmallest {

    public static void main(String[] args) {
        int[] array = {12, 3, 1, 2, 4, 6, 5, 9, 7, 8};
        int k = 3;  // Replace with the desired value of K

        // Find the Kth largest number
        int kthLargest = findKthLargest(array, k);
        System.out.println("Kth largest number: " + kthLargest);

        // Find the Kth smallest number
        int kthSmallest = findKthSmallest(array, k);
        System.out.println("Kth smallest number: " + kthSmallest);
    }

    public static int findKthLargest(int[] array, int k) {
        Arrays.sort(array); // Sort the array in ascending order
        return array[array.length - k];
    }

    public static int findKthSmallest(int[] array, int k) {
        Arrays.sort(array); // Sort the array in ascending order
        return array[k - 1];
    }
}

