package Animais;

public class Animal {

    protected String nome;
    protected String cor;
    protected String estado;
    protected int altura;
    protected double peso;

    public Animal(String nome, String cor, String estado, int altura, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.estado = estado;
        this.altura = altura;
        this.peso = peso;
    }

    protected void comer(){}

    protected void dormir(){}

    public void soar(){
        System.out.println("Cri Cri");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
