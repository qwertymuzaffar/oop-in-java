package date.cheatsheet;

import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedNow = ZonedDateTime.now();
        System.out.println("Current date and time with zone: " + zonedNow);
    }
}
