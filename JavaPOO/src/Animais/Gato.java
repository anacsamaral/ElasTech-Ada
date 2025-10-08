package Animais;

public class Gato extends Animal {

    static int qtdGatos;

    public Gato(String nome, String cor, String estado, int altura, double peso, int qtdGatos) {
        super(nome, cor, estado, altura, peso);
        qtdGatos++;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}