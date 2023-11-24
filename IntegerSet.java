import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntegerSet {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("1. Add element");
                System.out.println("2. Remove element");
                System.out.println("3. Check if an element is present");
                System.out.println("4. Display the set");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter an integer to add: ");
                        int numToAdd = scanner.nextInt();
                        integerSet.add(numToAdd);
                        break;
                    case 2:
                        System.out.print("Enter an integer to remove: ");
                        int numToRemove = scanner.nextInt();
                        if (integerSet.contains(numToRemove)) {
                            integerSet.remove(numToRemove);
                            System.out.println(numToRemove + " removed from the set.");
                        } else {
                            System.out.println(numToRemove + " is not in the set.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter an integer to check for: ");
                        int numToCheck = scanner.nextInt();
                        if (integerSet.contains(numToCheck)) {
                            System.out.println(numToCheck + " is present in the set.");
                        } else {
                            System.out.println(numToCheck + " is not in the set.");
                        }
                        break;
                    case 4:
                        System.out.println("Set: " + integerSet);
                        break;
                    case 5:
                        System.out.println("Exiting the program.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please choose a valid option.");
                        break;
                }
            }
        }
    }
}

