import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {
        
        LocalDate d4 = LocalDate.parse("2022-07-20");
        LocalDateTime d5 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d6 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d6, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d6, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d6, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d6, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("d4 dia = " + d4.getDayOfMonth());
        System.out.println("d4 mês = " + d4.getMonthValue());
        System.out.println("d4 ano = " + d4.getYear());
        System.out.println("d5 hora = " + d5.getHour());
        System.out.println("d5 minuto = " + d5.getMinute());
    }
    
}
