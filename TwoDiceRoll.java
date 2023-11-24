import java.util.Random;

public class TwoDiceRoll {
    public static void main(String[] args) {
        Random random = new Random();
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        int sum = die1 + die2;
        
        System.out.println("Die 1 rolled a " + die1);
        System.out.println("Die 2 rolled a " + die2);
        System.out.println("Sum of both dice: " + sum);
    }
}

