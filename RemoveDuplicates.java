import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            
            String result = removeDuplicates(input);
            
            System.out.println("String after removing duplicates: " + result);
        }
    }
    
    public static String removeDuplicates(String input) {
        Set<Character> characters = new LinkedHashSet<>();
        
        for (int i = 0; i < input.length(); i++) {
            characters.add(input.charAt(i));
        }
        
        StringBuilder result = new StringBuilder();
        for (Character character : characters) {
            result.append(character);
        }
        
        return result.toString();
    }
}

