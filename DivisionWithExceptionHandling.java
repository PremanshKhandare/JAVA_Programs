import java.util.Scanner;

public class DivisionWithExceptionHandling {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the numerator: ");
            double numerator = scanner.nextDouble();

            System.out.println("Enter the denominator: ");
            double denominator = scanner.nextDouble();

            try {
                double result = divideNumbers(numerator, denominator);
                System.out.println("Result of division: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }
    }

    public static double divideNumbers(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}

