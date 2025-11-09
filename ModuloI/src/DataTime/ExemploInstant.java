package DataTime;

import java.time.Duration;
import java.time.Instant;

public class ExemploInstant {
    public static void main(String[] args) throws InterruptedException {
        Instant inicio = Instant.now();

        Thread.sleep(2000);

        Instant fim = Instant.now();
        Duration duracao = Duration.between(inicio, fim);

        System.out.println(duracao.toMillis());
    }
}
