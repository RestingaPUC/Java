package App;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        
        LocalDate d4 = LocalDate.parse("2022-07-20");
        LocalDateTime d5 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d6 = Instant.parse("2022-07-20T01:30:26Z");
        
        LocalDate pastWeekLocalDate = d4.minusDays(7);
        LocalDate nextWeekLocalDate = d4.plusDays(7);
        LocalDateTime pastWeekLocalDateTime = d5.minusDays(7);
        Instant pastWeekInstant = d6.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d6.plus(7, ChronoUnit.DAYS);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d4.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d5);
        Duration t3 = Duration.between(pastWeekInstant, d6);
        Duration t4 = Duration.between(d6, pastWeekInstant);

        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);
        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);
        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());



    }
}
