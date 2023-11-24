import java.util.Random;

public class MultipleDiceRolls {
    public static void main(String[] args) {
        int numDice = 3; // Change the number of dice to roll
        Random random = new Random();

        for (int i = 0; i < numDice; i++) {
            int result = random.nextInt(6) + 1; // Simulate a roll of a six-sided die
            System.out.println("Dice " + (i + 1) + " rolled a " + result);
        }
    }
}

