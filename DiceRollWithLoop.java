import java.util.Random;

public class DiceRollWithLoop {
    public static void main(String[] args) {
        Random random = new Random();
        int numRolls = 5; // Number of times to roll the die
        
        for (int i = 1; i <= numRolls; i++) {
            int result = random.nextInt(6) + 1; // Simulate a roll of a six-sided die
            System.out.println("Roll " + i + ": You rolled a " + result);
        }
    }
}

