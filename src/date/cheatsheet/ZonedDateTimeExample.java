package date.cheatsheet;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        // Getting the current date and time in New York
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current Date and Time in New York: " + newYorkTime);
    }
}
