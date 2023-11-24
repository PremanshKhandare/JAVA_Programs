import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt(6) + 1; // Generates a random number from 1 to 6
        System.out.println("You rolled a " + result);
    }
}

