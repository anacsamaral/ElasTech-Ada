package Animais;

public class Cachorro extends Animal{

    static int qtdCachorros;

    public Cachorro(String nome, String cor, String estado, int altura, double peso, int qtdCachorros) {
        super(nome, cor, estado, altura, peso);
        qtdCachorros++;
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        switch (acao){
            case "carinho": this.estado = "feliz"; break;
            case "vai dormir!": this.estado = "bravo"; break;
            case "pisar na patinha": this.estado = "triste"; break;
            default: this.estado = "neutro"; break;
        }
        return estado;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override

    @Override
    protected void soar() {
        System.out.println("Au Au");
    }
}
