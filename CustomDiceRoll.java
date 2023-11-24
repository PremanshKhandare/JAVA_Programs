import java.util.Random;

public class CustomDiceRoll {
    public static void main(String[] args) {
        int sides = 10; // Change the number of sides as needed
        Random random = new Random();
        int result = random.nextInt(sides) + 1; // Generates a random number from 1 to 'sides'
        System.out.println("You rolled a " + result);
    }
}

