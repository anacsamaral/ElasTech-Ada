package Java21;

import java.util.List;
import java.util.SequencedCollection;

public class ExemploSequencedCollections {
    public static void main(String[] args) {
        SequencedCollection<String> nomes = List.of("Ana", "Lucas");
        System.out.println(nomes.getFirst());
        System.out.println(nomes.getLast());
        System.out.println(nomes.reversed());
        System.out.println(nomes);
    }
}
