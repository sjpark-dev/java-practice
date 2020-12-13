package practice;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        LocalDateTime dateTime2 = LocalDateTime.of(2020, 12, 1, 15, 15);
        System.out.println(dateTime2);
        System.out.println(dateTime.isAfter((dateTime2)));

        Duration duration = Duration.between(dateTime2, dateTime);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());

        LocalDate date2 = LocalDate.parse("2020-12-03");
        Period period = Period.between(date, date2);
        System.out.println(period.getDays());

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");
        System.out.println(ldt.format(dtf));
        String sldt = "2021-01-01 15:30:20";
        ldt = LocalDateTime.parse(sldt, DateTimeFormatter.ofPattern("yyyy-MM-dd kk:mm:ss"));
        System.out.println(ldt);
    }
}
