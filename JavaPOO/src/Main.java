import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        // instância o objeto cachorro
        Cachorro dog1 = new Cachorro("Neguinha", "Preto", "nada", 20,10,10); // construtor vazio
        Cachorro dog2 = new Cachorro("Scooby", "Preto", "nada", 20,10,10);

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

        System.out.println("Quantidade de cachorros: " + dog1.getQtdCachorros());

        System.out.println("O cachorro está: " + dog1.interagir("carinho"));
        System.out.println("O cachorro está: " + dog1.interagir("vai dormir!"));
        System.out.println("O cachorro está: " + dog1.interagir("pisar na patinha"));
        System.out.println("O cachorro está: " + dog1.interagir("nada"));
    }
}
