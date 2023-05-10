package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();
        LocalDate d4 = LocalDate.parse("2022-07-20");
        LocalDateTime d5 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d6 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d7 = Instant.parse("2022-07-20T01:30:26-03:00");
        LocalDate d8 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d9 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d7);
        System.out.println(d8);
        System.out.println(d9);
        System.out.println(d10);
        System.out.println(d11);
    }
    
}
