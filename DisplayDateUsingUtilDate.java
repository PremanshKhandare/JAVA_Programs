import java.util.Date;
import java.text.SimpleDateFormat;

public class DisplayDateUsingUtilDate {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Current Date: " + formattedDate);
    }
}

