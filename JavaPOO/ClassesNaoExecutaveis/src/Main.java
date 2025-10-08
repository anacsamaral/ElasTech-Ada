import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        // instância o objeto cachorro
        Cachorro dog1 = new Cachorro();

        // definiu um objeto na memória;
        dog1.nome = "Neguinha";
        dog1.cor = "Mel";
        dog1.altura = 25;
        dog1.peso = 10.5;
        dog1.tamanhoRabo = 10;

        System.out.println(dog1);
    }
}
