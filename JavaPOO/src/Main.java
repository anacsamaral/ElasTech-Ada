import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {
        // instância o objeto cachorro
        Cachorro dog1 = new Cachorro("Neguinha", "Preto", "nada", 20,10); // construtor vazio
        Cachorro dog2 = new Cachorro("Scooby", "Preto", "nada", 20,10);

        Gato gato1 = new Gato("Miau", "Marrom", "neutro", 10, 7);
        Animal gato2 = new Gato("Miau", "Marrom", "neutro", 10, 7);
        Animal passaro2 = new Passaro("Piu", "Azul", "neutro", 10, 7);

        /* para os casos de criar uma classe pai para classes filhas, mas que ela não pode ser criada, não pode virar um objeto de fato, a gente pode utilizar as classes abstratas */

        Passaro passaro1 = new Passaro("Zeca","verde","animado", 15,1);

        /* definiu um objeto na memória;
        dog1.setNome("Neguinha");
        dog1.setCor("Mel");
        dog1.setAltura(20);
        dog1.setPeso(10);
        dog1.setTamanhoRabo(10); */

        System.out.println(dog2.getNome());
        System.out.println(dog2.getPeso());

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(gato1.toString());
        System.out.println(passaro1.toString());

        System.out.println("Quantidade de cachorros: " + dog2.getQtdCachorros());
        System.out.println("Quantidade de gatos: " + gato1.getQtdGatos());
        System.out.println("Quantidade de passaros: " + passaro1.getQtdPassaros());

        System.out.println("O cachorro está: " + dog1.interagir("carinho"));
        System.out.println("O cachorro está: " + dog1.interagir("vai dormir!"));
        System.out.println("O cachorro está: " + dog1.interagir("pisar na patinha"));
        System.out.println("O cachorro está: " + dog1.interagir("nada"));

        dog1.soar();
        gato1.soar();
        passaro1.soar();

        Petshop petshop = new Petshop();

        petshop.darBanho(dog1);
        System.out.println(dog1.getEstado());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstado());

        petshop.tosar(dog2);
        System.out.println(dog2.getEstado());

        /* em polimorfismo o objeto não fica se transformando...
        *  o objeto nasce de um tipo e morre daquele tipo
        *  o que muda é a maneira como referenciamos ele */

        // comentário de uma linha
        
        /* comentario
        *  de
        *  varias
        *  linhas */


    }
}
