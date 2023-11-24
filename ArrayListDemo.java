import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Removing an element by value
        numbers.remove(Integer.valueOf(30)); // Removes the first occurrence of 30

        // Display the ArrayList after removal
        System.out.println("ArrayList after removing 30: " + numbers);

        // Iterating through the ArrayList using a for-each loop
        System.out.print("ArrayList elements using for-each loop: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Iterating through the ArrayList using an Iterator
        System.out.print("ArrayList elements using Iterator: ");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Check if the ArrayList contains an element
        int searchValue = 40;
        boolean containsValue = numbers.contains(searchValue);
        System.out.println("ArrayList contains " + searchValue + ": " + containsValue);

        // Get the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);

        // Clear the ArrayList
        numbers.clear();
        System.out.println("ArrayList cleared. Is it empty now? " + numbers.isEmpty());
    }
}

