package FPP.Lesson3;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        // Get LocalDate for Jan 2, 1970
        LocalDate localDate = LocalDate.of(1970, 1, 2);

        // Convert LocalDate to Date and get time in milliseconds
        Date date = dateFromLocalDate(localDate);
        long timeMillis = date.getTime();

        // Compute number of hours from start of Jan 1, 1970 to start of Jan 2, 1970
        long hours = timeMillis / (1000 * 60 * 60);  // 1 hour = 1000 ms * 60 sec * 60 min

        System.out.println("Number of hours from start of Jan 1, 1970 to start of Jan 2, 1970: " + hours);
    }

    public static Date dateFromLocalDate(LocalDate localDate) {
        // Convert LocalDate to ZonedDateTime with default time zone and then to Date
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}
