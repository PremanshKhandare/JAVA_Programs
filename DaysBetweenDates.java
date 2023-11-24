import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Days between " + startDate + " and " + endDate + ": " + daysBetween + " days");
    }
}

