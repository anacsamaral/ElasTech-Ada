import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {
        // instância o objeto cachorro
        Cachorro dog1 = new Cachorro("Neguinha", "Preto", "nada", 20,10); // construtor vazio
        Cachorro dog2 = new Cachorro("Scooby", "Preto", "nada", 20,10);

        Gato gato1 = new Gato("Miau", "Marrom", "neutro", 10, 7);

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
    }
}
