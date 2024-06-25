// 18_DateTimeAPI/DateTimeDemo.java
/*
 * Date and Time API (java.time package)
 * This program demonstrates the usage of Java Date and Time API introduced in Java 8.
 */

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        // LocalDate example
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // LocalTime example
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        // LocalDateTime example
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        // ZonedDateTime example
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Current date and time in Paris: " + zonedDateTime);

        // Parsing and formatting dates
        String dateStr = "2024-12-31";
        LocalDate parsedDate = LocalDate.parse(dateStr);
        System.out.println("Parsed date: " + parsedDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dateTime.format(formatter);
        System.out.println("Formatted date: " + formattedDate);

        // Period example
        LocalDate startDate = LocalDate.of(2024, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2024, Month.DECEMBER, 31);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period between " + startDate + " and " + endDate + ": " + period);

        // Duration example
        LocalTime startTime = LocalTime.of(10, 0);
        LocalTime endTime = LocalTime.of(18, 30);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration between " + startTime + " and " + endTime + ": " + duration);
    }
}
