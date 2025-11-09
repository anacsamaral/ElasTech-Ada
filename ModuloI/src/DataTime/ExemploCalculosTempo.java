package DataTime;

import org.w3c.dom.ls.LSOutput;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ExemploCalculosTempo {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime futuro = agora.plusDays(10);

        Duration duracao = Duration.between(agora, futuro);
        System.out.println(duracao.toDays());

        LocalDate dataHoje = LocalDate.now();
        LocalDate dataFim = LocalDate.of(2025,11,19);
        Period period = Period.between(dataHoje,dataFim);
        System.out.println(period.getDays());
        //System.out.println(duracao.between(dataHoje, dataFim).toDays());
        System.out.println(ChronoUnit.DAYS.between(dataHoje, dataFim));
    }
}