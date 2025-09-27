import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Datas {
    public static void main(String[] args) {
        // Cadastro do cliente
        LocalDate dataNasc = LocalDate.of(2005,11,5);
        System.out.println("Data de Nascimento: " + dataNasc);

        // Data e hora docadastro
        LocalDateTime dataHoraCadastro = LocalDateTime.now();
        System.out.println("Data e hora: " + dataHoraCadastro);

        // Calcular o próximo aniversário
        LocalDate hoje = LocalDate.now();
        LocalDate niver = dataNasc.withYear(hoje.getYear());
        if(niver. isBefore(hoje) || niver.isEqual(hoje)){
            niver = niver.plusYears(1);
        }
        System.out.println("Próximo Aniversário: " + niver);

        // Calcular período até o próximo niver
        Period periodo = Period.between(hoje,niver);
        System.out.println("Faltam " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias para seu aniversário");

        // Verificar se o niver é antes ou depois de um evento
        LocalDate dataEvento = LocalDate.of(2024,10,11);
        if(niver.isAfter(dataEvento)){
            System.out.println("O aniversário é depois do evento");
        }
        else {
            System.out.println("O aniversário é antes ou no mesmo dia do evento");
        }
    }
}
