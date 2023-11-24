import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysSinceHistoricalEvent {
    public static void main(String[] args) {
        LocalDate historicalDate = LocalDate.of(1776, 7, 4); // Declaration of Independence in the U.S.
        LocalDate currentDate = LocalDate.now();

        long daysSinceEvent = ChronoUnit.DAYS.between(historicalDate, currentDate);
        System.out.println("Days since the historical event: " + daysSinceEvent + " days");
    }
}
