package FPP.Lesson3;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
      Integer _k =0 ;
     char m =65;
        System.out.println(m+""+_k);
        System.out.println(reverse("hello"));

    }
    public static String reverse(String input){

        String output ="";
        for(int i =input.length()-1 ; i>=0 ;i--){
            output+=input.charAt(i);
        }
        return output;
    }

    public static Date dateFromLocalDate(LocalDate localDate) {
        // Convert LocalDate to ZonedDateTime with default time zone and then to Date
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}
