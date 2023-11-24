import java.util.Random;

public class LoadedDieRoll {
    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt(10); // Generates a number from 0 to 9

        if (result < 6) {
            System.out.println("You rolled a regular side of the die: " + (result + 1));
        } else {
            System.out.println("You rolled a loaded side of the die: " + (result - 5));
        }
    }
}

