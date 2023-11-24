import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:");
            int size = scanner.nextInt();

            double[] array = new double[size];

            for (int i = 0; i < size; i++) {
                System.out.println("Enter element " + (i + 1) + ":");
                array[i] = scanner.nextDouble();
            }

            reverseArray(array);
            System.out.println("Reversed array:");
            for (double value : array) {
                System.out.print(value + " ");
            }
            System.out.println();

            System.out.println("Enter the element to search:");
            double target = scanner.nextDouble();

            int position = linearSearch(array, target);
            if (position == -1) {
                System.out.println(target + " was not found in the array.");
            } else {
                System.out.println(target + " was found at position " + (position + 1));
            }
        }
    }

    public static void reverseArray(double[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            double temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static int linearSearch(double[] array, double target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

