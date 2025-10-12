package Animais;

public class Gato extends Animal {

    static int qtdGatos;

    public Gato(String nome, String cor, String estado, int altura, double peso) {
        super(nome, cor, estado, altura, peso);
        qtdGatos++;
    }

    public int getQtdGatos() {
        return qtdGatos;
    }

    @Override
    public void soar() {
        System.out.println("Miau Miau");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}