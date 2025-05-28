package date.cheatsheet;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConferenceScheduler {
    public static void main(String[] args) {
        // Define the meeting time in UTC
        ZonedDateTime meetingTimeUTC = ZonedDateTime.parse("2024-12-30T15:00:00Z");

        // Define participant time zones
        String[] participantTimeZones = {
                "America/New_York", // Eastern Standard Time (EST)
                "Europe/London",    // Greenwich Mean Time (GMT)
                "Asia/Kolkata",     // Indian Standard Time (IST)
                "Australia/Sydney"  // Australian Eastern Daylight Time (AEDT)
        };

        // Format for displaying the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Print the meeting time in each participant's local time zone
        System.out.println("Meeting Time in UTC: " + meetingTimeUTC.format(formatter));
        for (String timeZone : participantTimeZones) {
            ZonedDateTime localTime = meetingTimeUTC.withZoneSameInstant(ZoneId.of(timeZone));
            System.out.println("Meeting Time in " + timeZone + ": " + localTime.format(formatter));
        }
    }
}
