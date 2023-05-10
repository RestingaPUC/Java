package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        
        LocalDate d4 = LocalDate.parse("2022-07-20");
        LocalDateTime d5 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d6 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d4 = " + d4.format(fmt1));
        System.out.println("d4 = " + fmt1.format(d4));
        System.out.println("d4 = " + d4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d5 = " + d5.format(fmt1));
        System.out.println("d5 = " + d5.format(fmt2));
        System.out.println("d6 = " + fmt3.format(d6));

    }
    
}
