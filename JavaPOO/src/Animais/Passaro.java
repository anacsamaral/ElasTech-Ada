package Animais;

public class Passaro extends Animal {
    static int qtdPassaros;

    public Passaro(String nome, String cor, String estado, int altura, double peso) {
        super(nome, cor, estado, altura, peso);
        qtdPassaros++;
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
