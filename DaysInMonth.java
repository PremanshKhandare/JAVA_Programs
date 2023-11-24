import java.time.YearMonth;

public class DaysInMonth {
    public static void main(String[] args) {
        int year = 2023;
        int month = 2; // February (you can change to any month)

        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();

        System.out.println("Days in " + yearMonth.getMonth() + " " + year + ": " + daysInMonth + " days");
    }
}
