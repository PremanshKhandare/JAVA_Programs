import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysUntilFutureDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = LocalDate.of(2023, 12, 31);

        long daysUntilFutureDate = ChronoUnit.DAYS.between(currentDate, futureDate);
        System.out.println("Days until " + futureDate + ": " + daysUntilFutureDate + " days");
    }
}

