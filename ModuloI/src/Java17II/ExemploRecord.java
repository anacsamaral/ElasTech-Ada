package Java17II;

public record ExemploRecord(String nome, int idade) {
    public ExemploRecord(String nome){
        this(nome,20);
    }
}
