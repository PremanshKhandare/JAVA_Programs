public class ArrayOutOfBoundsDemo {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            int index = 6;  // Trying to access an index that is out of bounds
            int element = numbers[index];
            System.out.println("Element at index " + index + " is: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Array index is out of bounds.");
        }
    }
}

