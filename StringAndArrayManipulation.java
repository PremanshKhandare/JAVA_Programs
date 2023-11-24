import java.util.Scanner;

public class StringAndArrayManipulation {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // 1. String reversal
            System.out.println("Enter a string to reverse:");
            String input = scanner.nextLine();
            System.out.println("Reversed string: " + reverseString(input));

            // 2. Binary search on a sorted array
            System.out.println("Enter the size of the array:");
            int size = scanner.nextInt();

            int[] array = new int[size];
            System.out.println("Enter " + size + " sorted numbers:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Enter the number to search:");
            int target = scanner.nextInt();

            int position = binarySearch(array, target);
            if (position == -1) {
                System.out.println(target + " was not found in the array.");
            } else {
                System.out.println(target + " was found at position " + (position + 1));
            }
        }
    }

    // Function to reverse a string
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    // Function to perform binary search on a sorted array
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

