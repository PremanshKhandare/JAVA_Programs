import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysInYearRange {
    public static void main(String[] args) {
        int startYear = 2020;
        int endYear = 2025;

        long totalDays = 0;
        for (int year = startYear; year <= endYear; year++) {
            LocalDate startOfYear = LocalDate.of(year, 1, 1);
            LocalDate endOfYear = LocalDate.of(year, 12, 31);
            totalDays += ChronoUnit.DAYS.between(startOfYear, endOfYear) + 1;
        }

        System.out.println("Total days in the range " + startYear + " to " + endYear + ": " + totalDays + " days");
    }
}

