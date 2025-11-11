package Java11;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExemploColecoes {
    public static void main(String[] args) {
        // criando uma lista imutável
        List<String> lista = List.of("João","Maria","Carlos");
        System.out.println(lista);

        // criando um conjunto imutável
        Set<Integer> conjunto = Set.of(1,2,3,4,5);
        System.out.println(conjunto);

        // criando um mapa imutável
        Map<String, Integer> mapa;
        mapa = Map.of("João",25,"Maria",30,"Carlos",35);
        System.out.println(mapa);
    }
}
