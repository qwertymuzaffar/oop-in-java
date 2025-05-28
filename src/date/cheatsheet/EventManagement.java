package date.cheatsheet;

import java.time.*;
import java.util.Scanner;

public class EventManagement {

    static class Event {
        String name;
        LocalDate date;
        LocalTime time;
        ZoneId timeZone;

        public Event(String name, LocalDate date, LocalTime time, ZoneId timeZone) {
            this.name = name;
            this.date = date;
            this.time = time;
            this.timeZone = timeZone;
        }

        public ZonedDateTime getEventDateTime() {
            LocalDateTime localDateTime = LocalDateTime.of(date, time);
            return ZonedDateTime.of(localDateTime, timeZone);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input event details
        System.out.println("Enter event name:");
        String name = scanner.nextLine();

        System.out.println("Enter event date (YYYY-MM-DD):");
        String dateInput = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateInput);

        System.out.println("Enter event time (HH:MM):");
        String timeInput = scanner.nextLine();
        LocalTime time = LocalTime.parse(timeInput);

        System.out.println("Enter time zone (e.g., America/New_York):");
        String zoneInput = scanner.nextLine();
        ZoneId timeZone = ZoneId.of(zoneInput);

        // Create the event
        Event event = new Event(name, date, time, timeZone);

        // Display event details
        System.out.println("Event created: " + event.name);
        ZonedDateTime eventDateTime = event.getEventDateTime();
        System.out.println("Event Date and Time: " + eventDateTime);

        // Display in system's default time zone
        ZonedDateTime defaultZonedDateTime = eventDateTime.withZoneSameInstant(ZoneId.systemDefault());
        System.out.println("Event Date and Time in your local time zone: " + defaultZonedDateTime);

        scanner.close();
    }
}
