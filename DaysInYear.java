import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysInYear {
    public static void main(String[] args) {
        int year = 2023; // Replace with the desired year

        LocalDate startOfYear = LocalDate.of(year, 1, 1);
        LocalDate endOfYear = LocalDate.of(year, 12, 31);

        long daysInYear = ChronoUnit.DAYS.between(startOfYear, endOfYear) + 1;
        System.out.println("Days in " + year + ": " + daysInYear + " days");
    }
}

