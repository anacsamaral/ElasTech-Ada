package Animais;

public class Passaro extends Animal {
    static int qtdPassaros;

    public Passaro(String nome, String cor, String estado, int altura, double peso) {
        super(nome, cor, estado, altura, peso);
        qtdPassaros++;
    }

    public int getQtdPassaros() {
        return qtdPassaros;
    }

    @Override
    public void soar() {
        System.out.println("Piu Piu");
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
