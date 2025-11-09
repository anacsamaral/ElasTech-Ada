package DataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExemploDataHora {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);
    }
}
