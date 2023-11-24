import java.util.Random;

public class DiceRollingSimulation {
    public static int rollDice(int sides) {
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }

    public static void main(String[] args) {
        int sides = 8; // Change the number of sides as needed
        int result = rollDice(sides);
        System.out.println("You rolled a " + result);
    }
}

