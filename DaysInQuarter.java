import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysInQuarter {
    public static void main(String[] args) {
        int year = 2023;
        int quarter = 2; // Change to the desired quarter (1 to 4)

        LocalDate startOfQuarter = LocalDate.of(year, (quarter - 1) * 3 + 1, 1);
        LocalDate endOfQuarter = startOfQuarter.plusMonths(2).withDayOfMonth(31);

        long daysInQuarter = ChronoUnit.DAYS.between(startOfQuarter, endOfQuarter) + 1;
        System.out.println("Days in quarter " + quarter + " of " + year + ": " + daysInQuarter + " days");
    }
}

