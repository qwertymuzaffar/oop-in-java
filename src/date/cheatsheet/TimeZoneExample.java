package date.cheatsheet;

import java.time.ZoneId;

public class TimeZoneExample {
    public static void main(String[] args) {
        // Creating a ZoneId for New York
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        System.out.println("Time Zone ID: " + newYorkZone);
    }
}
