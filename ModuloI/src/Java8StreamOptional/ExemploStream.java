package Java8StreamOptional;

import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {
        List<String> nomes =
                List.of("Jose", "Carlos", "Maria", "Ana", "Carlos");
        List<String> nomesFiltrados =
                nomes.stream()
                        .filter(nome -> nome.startsWith("C"))
                        .distinct()
                        .collect(Collectors.toList());
        //System.out.println(nomesFiltrados);

        nomes.forEach(System.out::println);

        var lista =
                nomes.stream()
                .filter(nome -> nome.contains("a"))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(lista);
    }
}
