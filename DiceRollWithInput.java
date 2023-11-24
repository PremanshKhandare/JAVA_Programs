import java.util.Random;
import java.util.Scanner;

public class DiceRollWithInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Enter the number of sides on the die: ");
            int sides = scanner.nextInt();
            
            int result = random.nextInt(sides) + 1;
            System.out.println("You rolled a " + result);
        }
    }
}

