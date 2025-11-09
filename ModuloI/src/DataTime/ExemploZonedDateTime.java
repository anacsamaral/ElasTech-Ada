package DataTime;

import java.time.*;

public class ExemploZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        Duration duration = Duration.ofHours(5);
        System.out.println(duration);
        System.out.println(zonedDateTime.plus(duration));

        LocalDate dataNascimento = LocalDate.of(2005,11,05);
        Period period = Period.between(dataNascimento, LocalDate.now());
        System.out.println(period.getYears());
    }
}
