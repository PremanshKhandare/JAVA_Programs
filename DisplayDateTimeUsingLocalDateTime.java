import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayDateTimeUsingLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(dateTimeFormat);
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}

